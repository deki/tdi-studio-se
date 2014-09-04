// ============================================================================
//
// Copyright (C) 2006-2014 Talend Inc. - www.talend.com
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.INode;
import org.talend.cwm.relational.RelationalFactory;
import org.talend.cwm.relational.TdColumn;
import org.talend.cwm.relational.TdTable;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.ElementParameter;

/**
 * DOC PLV class global comment. Detailled comment
 */
public class QueryGuessCommandTest {

    private IMetadataTable metadataTable;

    private Connection connection;

    private INode node;

    /**
     * DOC PLV Comment method "setUp".
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        connection = ConnectionFactory.eINSTANCE.createConnection();
        node = Mockito.mock(INode.class);
        connection.setContextMode(true);
        TdTable table = RelationalFactory.eINSTANCE.createTdTable();
        table.setName("tableName");
        table.setLabel("tableLabel");
        TdColumn column1 = RelationalFactory.eINSTANCE.createTdColumn();
        column1.setId("ID1");
        column1.setName("cName1");
        TdColumn column2 = RelationalFactory.eINSTANCE.createTdColumn();
        column2.setId("ID2");
        column2.setName("cName2");
        table.getColumns().add(column1);
        table.getColumns().add(column2);
        metadataTable = ConvertionHelper.convert(table);
        ElementParameter parameter = new ElementParameter(node);
        parameter.setName("DBTABLE");
        parameter.setValue(table.getName());
        Mockito.when(node.getPropertyValue(EParameterName.PROPERTY_TYPE.getName())).thenReturn("REPOSITORY");
        Mockito.when(node.getElementParameterFromField(EParameterFieldType.DBTABLE)).thenReturn(parameter);
    }

    @Test
    public void generateNewQuery() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        String schema = "schema";
        // add test for PostgreSQL
        String dbType = EDatabaseTypeName.PSQL.getDisplayName();
        QueryGuessCommand command = new QueryGuessCommand(node, metadataTable, schema, dbType, connection);
        Method method = command.getClass().getDeclaredMethod("generateNewQuery");
        method.setAccessible(true);
        String queryString = (String) method.invoke(command);
        Assert.assertNotNull(queryString);
        Assert.assertTrue(queryString.contains(schema));
        Assert.assertTrue(queryString.contains(metadataTable.getTableName()));
        Assert.assertTrue(queryString.contains("cName1"));
        Assert.assertTrue(queryString.contains("cName2"));

        // add test for MySQL
        dbType = EDatabaseTypeName.MYSQL.getDisplayName();
        command = new QueryGuessCommand(node, metadataTable, schema, dbType, connection);
        method = command.getClass().getDeclaredMethod("generateNewQuery");
        method.setAccessible(true);
        queryString = (String) method.invoke(command);
        Assert.assertNotNull(queryString);
        Assert.assertFalse(queryString.contains(schema));
        Assert.assertTrue(queryString.contains(metadataTable.getTableName()));
        Assert.assertTrue(queryString.contains("cName1"));
        Assert.assertTrue(queryString.contains("cName2"));
    }
}
