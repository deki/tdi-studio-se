// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.cmd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.talend.core.model.components.IODataComponent;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.metadata.builder.connection.Query;
import org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection;
import org.talend.core.model.metadata.designerproperties.RepositoryToComponentProperty;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.properties.Item;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.model.process.jobsettings.JobSettingsConstants;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.core.ui.views.jobsettings.JobSettings;
import org.talend.repository.UpdateRepositoryUtils;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public class ChangeValuesFromRepository extends ChangeMetadataCommand {

    private final Map<String, Object> oldValues;

    private final Element elem;

    private final Connection connection;

    private final String value;

    private final String propertyName;

    private String oldMetadata;

    private Map<String, IMetadataTable> repositoryTableMap;

    private boolean isGuessQuery = false;

    private final String propertyTypeName;

    private final String repositoryPropertyTypeName;

    private final String updataComponentParamName;

    public ChangeValuesFromRepository(Element elem, Connection connection, String propertyName, String value) {
        this.elem = elem;
        this.connection = connection;
        this.value = value;
        this.propertyName = propertyName;
        oldValues = new HashMap<String, Object>();

        setLabel(Messages.getString("PropertyChangeCommand.Label")); //$NON-NLS-1$
        // for job settings extra (feature 2710)
        // if (JobSettingsConstants.isExtraParameter(propertyName)) {
        // propertyTypeName = JobSettingsConstants.getExtraParameterName(EParameterName.PROPERTY_TYPE.getName());
        // repositoryPropertyTypeName =
        // JobSettingsConstants.getExtraParameterName(EParameterName.REPOSITORY_PROPERTY_TYPE
        // .getName());
        // updataComponentParamName =
        // JobSettingsConstants.getExtraParameterName(EParameterName.UPDATE_COMPONENTS.getName());
        // } else {
        propertyTypeName = EParameterName.PROPERTY_TYPE.getName();
        repositoryPropertyTypeName = EParameterName.REPOSITORY_PROPERTY_TYPE.getName();
        updataComponentParamName = EParameterName.UPDATE_COMPONENTS.getName();
        // }
    }

    @Override
    public void execute() {

        // Force redraw of Commponents propoerties
        elem.setPropertyValue(updataComponentParamName, new Boolean(true));

        boolean allowAutoSwitch = true;

        IElementParameter elemParam = elem.getElementParameter(EParameterName.REPOSITORY_ALLOW_AUTO_SWITCH.getName());
        if (elemParam != null) {
            allowAutoSwitch = (Boolean) elemParam.getValue();
        }
        if (!allowAutoSwitch && (elem instanceof Node)) {
            // force the autoSwitch to true if the schema is empty and if the
            // query is not set.
            Node node = (Node) elem;
            boolean isSchemaEmpty = node.getMetadataList().get(0).getListColumns().size() == 0;
            boolean isQueryEmpty = false;
            for (IElementParameter curParam : node.getElementParameters()) {
                if (curParam.getField().equals(EParameterFieldType.MEMO_SQL)) {
                    String defaultValue = "";
                    if (curParam.getDefaultValues().size() > 0) {
                        defaultValue = (String) curParam.getDefaultValues().get(0).getDefaultValue();
                    }
                    String paramValue = (String) curParam.getValue();
                    isQueryEmpty = paramValue.equals("") || paramValue.equals("''") || paramValue.equals("\"\"")
                            || paramValue.equals(defaultValue);
                }
            }
            if (isSchemaEmpty) {
                allowAutoSwitch = true;
            }
        }

        if (propertyName.split(":")[1].equals(propertyTypeName)) {
            elem.setPropertyValue(propertyName, value);
            if (allowAutoSwitch) {
                setOtherProperties();
            }
        } else {
            oldMetadata = (String) elem.getPropertyValue(propertyName);
            elem.setPropertyValue(propertyName, value);
            if (allowAutoSwitch) {
                setOtherProperties();
            }
        }

        if (propertyName.split(":")[1].equals(propertyTypeName) && (EmfComponent.BUILTIN.equals(value))) {
            for (IElementParameter param : elem.getElementParameters()) {

                boolean paramFlag = JobSettingsConstants.isExtraParameter(param.getName());
                boolean extraFlag = JobSettingsConstants.isExtraParameter(propertyName.split(":")[0]);
                if (paramFlag == extraFlag) {
                    param.setReadOnly(false);
                    // for job settings extra.(feature 2710)
                    param.setRepositoryValueUsed(false);
                }

            }
        } else {
            oldValues.clear();
            IElementParameter propertyParam = elem.getElementParameter(propertyName);
            EComponentCategory currentCategory = propertyParam.getCategory();
            for (IElementParameter param : elem.getElementParameters()) {

                String repositoryValue = param.getRepositoryValue();
                if (param.isShow(elem.getElementParameters()) && (repositoryValue != null)
                        && (!param.getName().equals(propertyTypeName))) {
                    IElementParameter relatedPropertyParam = elem.getElementParameterFromField(EParameterFieldType.PROPERTY_TYPE,
                            param.getCategory());
                    if (!relatedPropertyParam.getCategory().equals(currentCategory)) {
                        continue;
                    }
                    Object objectValue = RepositoryToComponentProperty.getValue(connection, repositoryValue);
                    if (objectValue != null) {
                        oldValues.put(param.getName(), param.getValue());

                        if (param.getField().equals(EParameterFieldType.CLOSED_LIST) && param.getRepositoryValue().equals("TYPE")) {
                            boolean found = false;
                            String[] list = param.getListRepositoryItems();
                            for (int i = 0; (i < list.length) && (!found); i++) {
                                if (objectValue.equals(list[i])) {
                                    found = true;
                                    elem.setPropertyValue(param.getName(), param.getListItemsValue()[i]);
                                }
                            }
                        } else {
                            if (repositoryValue.equals("ENCODING")) {
                                IElementParameter paramEncoding = param.getChildParameters().get(
                                        EParameterName.ENCODING_TYPE.getName());
                                paramEncoding.setValue(EmfComponent.ENCODING_TYPE_CUSTOM);
                            } else if (repositoryValue.equals("CSV_OPTION")) {
                                setOtherProperties();
                            }
                            elem.setPropertyValue(param.getName(), objectValue);
                        }
                        param.setRepositoryValueUsed(true);
                    } else if (param.getField().equals(EParameterFieldType.TABLE)
                            && param.getRepositoryValue().equals("XML_MAPPING")) { //$NON-NLS-1$

                        List<Map<String, Object>> table = (List<Map<String, Object>>) elem.getPropertyValue(param.getName());
                        IMetadataTable metaTable = ((Node) elem).getMetadataList().get(0);
                        RepositoryToComponentProperty.getTableXmlFileValue(connection, "XML_MAPPING", param, //$NON-NLS-1$
                                table, metaTable);
                        param.setRepositoryValueUsed(true);
                    } else if (param.getField().equals(EParameterFieldType.TABLE)
                            && param.getRepositoryValue().equals("WSDL_PARAMS")) {
                        List<Map<String, Object>> table = (List<Map<String, Object>>) elem.getPropertyValue(param.getName());
                        table.clear();
                        ArrayList parameters = ((WSDLSchemaConnection) connection).getParameters();
                        for (Object object : parameters) {
                            Map<String, Object> map2 = new HashMap<String, Object>();
                            map2.put("VALUE", TalendTextUtils.addQuotes(object.toString()));
                            table.add(map2);
                        }
                        param.setRepositoryValueUsed(true);
                    }

                    if (param.isRepositoryValueUsed()) {
                        param.setReadOnly(true);
                    }
                }
            }
        }
        // change AS400 value
        for (IElementParameter curParam : elem.getElementParameters()) {
            if (curParam.getField().equals(EParameterFieldType.AS400_CHECK)) {
                setOtherProperties();
            }
        }

        if (elem instanceof Node) {
            ((Process) ((Node) elem).getProcess()).checkProcess();
        }
    }

    private String getFirstRepositoryTable(Item item) {
        if (item != null) {
            final List<MetadataTable> tables = UpdateRepositoryUtils.getMetadataTablesFromItem(item);
            if (tables != null && !tables.isEmpty()) {
                return tables.get(0).getId();
            }
        }
        return "";
    }

    /**
     * qzhang Comment method "setOtherProperties".
     */
    private void setOtherProperties() {
        boolean metadataInput = false;
        IElementParameter currentParam = elem.getElementParameter(propertyName);

        Item item = null;
        IElementParameter repositoryParam = elem.getElementParameter(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());
        if (repositoryParam != null) {
            item = UpdateRepositoryUtils.getConnectionItemByItemId((String) repositoryParam.getValue());
        }

        if (elem instanceof Node) {
            Node node = (Node) elem;
            if (node.getCurrentActiveLinksNbInput(EConnectionType.FLOW_MAIN) > 0
                    || node.getCurrentActiveLinksNbInput(EConnectionType.FLOW_REF) > 0
                    || node.getCurrentActiveLinksNbInput(EConnectionType.TABLE) > 0) {
                metadataInput = true;
            }

            boolean hasSchema = elem.getElementParameterFromField(EParameterFieldType.SCHEMA_TYPE) != null;
            if (value.equals(EmfComponent.BUILTIN)) {
                if (!metadataInput && hasSchema) {
                    elem.setPropertyValue(EParameterName.SCHEMA_TYPE.getName(), value);
                }
                elem.setPropertyValue(EParameterName.QUERYSTORE_TYPE.getName(), value);
            } else {
                if (hasSchema) {
                    for (IElementParameter param : elem.getElementParameters()) {
                        if (param.getField().equals(EParameterFieldType.SCHEMA_TYPE)) {
                            if (!metadataInput) {
                                IElementParameter repositorySchemaTypeParameter = param.getChildParameters().get(
                                        EParameterName.REPOSITORY_SCHEMA_TYPE.getName());
                                String repositoryTable;
                                if (propertyName.split(":")[1].equals(EParameterName.PROPERTY_TYPE.getName())) {
                                    repositoryTable = (String) repositorySchemaTypeParameter.getValue();
                                } else {
                                    repositoryTable = getFirstRepositoryTable(item);
                                    repositorySchemaTypeParameter.setValue(repositoryTable);
                                }
                                if (!"".equals(repositoryTable)) {
                                    param.getChildParameters().get(EParameterName.SCHEMA_TYPE.getName()).setValue(
                                            EmfComponent.REPOSITORY);

                                    IMetadataTable table = repositoryTableMap.get(repositoryTable);
                                    if (table != null) {
                                        table = table.clone();
                                        setDBTableFieldValue(node, table.getTableName(), null);
                                        table.setTableName(node.getMetadataList().get(0).getTableName());
                                        if (!table.sameMetadataAs(node.getMetadataList().get(0))) {
                                            ChangeMetadataCommand cmd = new ChangeMetadataCommand(node, param, null, table);
                                            cmd.setRepositoryMode(true);
                                            cmd.execute(true);
                                        }
                                    }
                                }
                            } else {
                                Node sourceNode = getRealSourceNode((INode) elem);
                                if (sourceNode != null) {
                                    IMetadataTable sourceMetadataTable = sourceNode.getMetadataList().get(0);
                                    Object sourceSchema = sourceNode.getPropertyValue(EParameterName.SCHEMA_TYPE.getName());
                                    boolean isTake = !sourceNode.isExternalNode() && sourceSchema != null
                                            && elem.getPropertyValue(EParameterName.SCHEMA_TYPE.getName()) != null;
                                    if (isTake && getTake()) {
                                        ChangeMetadataCommand cmd = new ChangeMetadataCommand((Node) elem, param, null,
                                                sourceMetadataTable);
                                        cmd.execute(true);
                                        elem.setPropertyValue(EParameterName.SCHEMA_TYPE.getName(), sourceSchema);
                                        if (sourceSchema.equals(EmfComponent.REPOSITORY)) {
                                            elem.setPropertyValue(EParameterName.REPOSITORY_SCHEMA_TYPE.getName(), sourceNode
                                                    .getPropertyValue(EParameterName.REPOSITORY_SCHEMA_TYPE.getName()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            IElementParameter queryParam = elem.getElementParameterFromField(EParameterFieldType.QUERYSTORE_TYPE, currentParam
                    .getCategory());
            IElementParameter queryStoreType = null;
            if (queryParam != null) {
                queryStoreType = queryParam.getChildParameters().get(EParameterName.QUERYSTORE_TYPE.getName());
            }

            if (item != null) {
                final List<Query> queries = UpdateRepositoryUtils.getQueriesFromItem(item);

                if (propertyName.split(":")[1].equals(EParameterName.PROPERTY_TYPE.getName())) {
                    if (queries != null && !queries.isEmpty()) {
                        if (queryParam != null) {
                            queryStoreType.setValue(value);
                            if (value.equals(EmfComponent.REPOSITORY)) {
                                setQueryToRepositoryMode(queryParam, queries, item);
                            }
                        }
                        // query change
                    }
                } else {
                    if (queryParam != null) {
                        if (this.isGuessQuery || queries == null || (queries != null && queries.isEmpty())) {
                            queryStoreType.setValue(EmfComponent.BUILTIN);
                        } else {
                            queryStoreType.setValue(EmfComponent.REPOSITORY);
                            setQueryToRepositoryMode(queryParam, queries, item);
                        }
                    }
                    List<MetadataTable> tables = UpdateRepositoryUtils.getMetadataTablesFromItem(item);
                    if (tables == null || tables.isEmpty()) {
                        elem.setPropertyValue(EParameterName.SCHEMA_TYPE.getName(), EmfComponent.BUILTIN);
                    }
                }
            }
        }
    }

    private void setQueryToRepositoryMode(IElementParameter queryParam, List<Query> queries, Item item) {

        IElementParameter repositoryParam = queryParam.getChildParameters().get(
                EParameterName.REPOSITORY_QUERYSTORE_TYPE.getName());
        Query query = UpdateRepositoryUtils.getQueryById(item, (String) repositoryParam.getValue());
        if (query == null && queries != null && !queries.isEmpty()) {
            query = queries.get(0);
            if (query != null) {
                repositoryParam.setValue(query.getId());
            }

        }

        if (query != null) {
            IElementParameter memoSqlParam = elem.getElementParameterFromField(EParameterFieldType.MEMO_SQL, queryParam
                    .getCategory());
            memoSqlParam.setValue(TalendTextUtils.addSQLQuotes(query.getValue()));
            memoSqlParam.setRepositoryValueUsed(true);
        }
    }

    @SuppressWarnings("unchecked")
    protected Node getRealSourceNode(INode target) {
        Node sourceNode = null;
        IODataComponent input = null;
        List<org.talend.designer.core.ui.editor.connections.Connection> incomingConnections = null;
        incomingConnections = (List<org.talend.designer.core.ui.editor.connections.Connection>) target.getIncomingConnections();
        for (org.talend.designer.core.ui.editor.connections.Connection connec : incomingConnections) {
            if (connec.isActivate() && connec.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
                input = new IODataComponent(connec);
            }
        }
        if (input != null) {
            INode source = input.getSource();
            if (source instanceof Node) {
                sourceNode = (Node) source;
                // final IExternalNode externalNode =
                // sourceNode.getExternalNode();
                // if (sourceNode.getPluginFullName() != null &&
                // !"".equals(sourceNode.getPluginFullName())
                // && sourceNode.getExternalNode() != null) {
                // return getRealSourceNode(externalNode);
                // }
            }
        }
        return sourceNode;
    }

    /**
     * qzhang Comment method "getTake".
     * 
     * @return
     */
    private Boolean take = null;

    private boolean getTake() {
        if (take == null) {
            take = MessageDialog.openQuestion(new Shell(), "", Messages
                    .getString("ChangeValuesFromRepository.messageDialog.takeMessage"));
        }
        return take;
    }

    @Override
    public void undo() {
        // Force redraw of Commponents propoerties
        elem.setPropertyValue(updataComponentParamName, new Boolean(true));

        if (propertyName.split(":")[1].equals(propertyTypeName) && (EmfComponent.BUILTIN.equals(value))) {
            for (IElementParameter param : elem.getElementParameters()) {
                String repositoryValue = param.getRepositoryValue();
                if (param.isShow(elem.getElementParameters()) && (repositoryValue != null)
                        && (!param.getName().equals(propertyTypeName))) {
                    boolean paramFlag = JobSettingsConstants.isExtraParameter(param.getName());
                    boolean extraFlag = JobSettingsConstants.isExtraParameter(propertyTypeName);
                    if (paramFlag == extraFlag) {
                        // for job settings extra.(feature 2710)
                        param.setRepositoryValueUsed(true);
                    }
                }
            }
        } else {
            for (IElementParameter param : elem.getElementParameters()) {
                String repositoryValue = param.getRepositoryValue();
                if (param.isShow(elem.getElementParameters()) && (repositoryValue != null)) {
                    Object objectValue = RepositoryToComponentProperty.getValue(connection, repositoryValue);
                    if (objectValue != null) {
                        elem.setPropertyValue(param.getName(), oldValues.get(param.getName()));
                        param.setRepositoryValueUsed(false);
                    }
                }
            }
        }
        IElementParameter currentParam = elem.getElementParameter(propertyName);
        if (propertyName.split(":")[1].equals(propertyTypeName)) {
            if (value.equals(EmfComponent.BUILTIN)) {
                currentParam.setValue(EmfComponent.REPOSITORY);
            } else {
                currentParam.setValue(EmfComponent.BUILTIN);
                IElementParameter schemaParam = elem.getElementParameterFromField(EParameterFieldType.SCHEMA_TYPE, currentParam
                        .getCategory());
                if (schemaParam != null) {
                    IElementParameter schemaType = schemaParam.getChildParameters().get(EParameterName.SCHEMA_TYPE.getName());
                    schemaType.setValue(EmfComponent.BUILTIN);
                }

                IElementParameter queryParam = elem.getElementParameterFromField(EParameterFieldType.QUERYSTORE_TYPE,
                        currentParam.getCategory());
                if (queryParam != null) {
                    IElementParameter queryStoreType = queryParam.getChildParameters().get(
                            EParameterName.QUERYSTORE_TYPE.getName());
                    queryStoreType.setValue(EmfComponent.BUILTIN);
                }
            }
        } else {
            elem.setPropertyValue(propertyName, oldMetadata);
        }

        JobSettings.switchToCurJobSettingsView();
    }

    /**
     * Sets a sets of maps.
     * 
     * @param tablesmap
     * @param queriesmap
     * @param repositoryTableMap
     */

    public void setMaps(Map<String, IMetadataTable> repositoryTableMap) {
        this.repositoryTableMap = repositoryTableMap;
    }

    /**
     * 
     * ggu Comment method "isGuessQuery".
     * 
     * for guess query
     * 
     * @return
     */
    public boolean isGuessQuery() {
        return this.isGuessQuery;
    }

    public void setGuessQuery(boolean isGuessQuery) {
        this.isGuessQuery = isGuessQuery;
    }

}
