/**
 * SforceServiceStub.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.salesforce.soap.partner;

/*
 * SforceServiceStub java implementation
 */

public class SforceServiceStub extends org.apache.axis2.client.Stub implements
		SforceService {

	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();

	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();

	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis())
				+ "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("SforceService"
				+ getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[32];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "merge"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "getUserInfo"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "describeSoftphoneLayout"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "update"));
		_service.addOperation(__operation);

		_operations[3] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "setPassword"));
		_service.addOperation(__operation);

		_operations[4] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "logout"));
		_service.addOperation(__operation);

		_operations[5] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "retrieve"));
		_service.addOperation(__operation);

		_operations[6] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "queryAll"));
		_service.addOperation(__operation);

		_operations[7] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "getUpdated"));
		_service.addOperation(__operation);

		_operations[8] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "undelete"));
		_service.addOperation(__operation);

		_operations[9] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "create"));
		_service.addOperation(__operation);

		_operations[10] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "sendEmail"));
		_service.addOperation(__operation);

		_operations[11] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "search"));
		_service.addOperation(__operation);

		_operations[12] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "query"));
		_service.addOperation(__operation);

		_operations[13] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "getDeleted"));
		_service.addOperation(__operation);

		_operations[14] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "process"));
		_service.addOperation(__operation);

		_operations[15] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com",
				"describeDataCategoryGroupStructures"));
		_service.addOperation(__operation);

		_operations[16] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "resetPassword"));
		_service.addOperation(__operation);

		_operations[17] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "describeGlobal"));
		_service.addOperation(__operation);

		_operations[18] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "describeLayout"));
		_service.addOperation(__operation);

		_operations[19] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "describeTabs"));
		_service.addOperation(__operation);

		_operations[20] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "describeDataCategoryGroups"));
		_service.addOperation(__operation);

		_operations[21] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "getServerTimestamp"));
		_service.addOperation(__operation);

		_operations[22] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "invalidateSessions"));
		_service.addOperation(__operation);

		_operations[23] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "describeSObject"));
		_service.addOperation(__operation);

		_operations[24] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "login"));
		_service.addOperation(__operation);

		_operations[25] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "queryMore"));
		_service.addOperation(__operation);

		_operations[26] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "describeSObjects"));
		_service.addOperation(__operation);

		_operations[27] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "emptyRecycleBin"));
		_service.addOperation(__operation);

		_operations[28] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "upsert"));
		_service.addOperation(__operation);

		_operations[29] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "convertLead"));
		_service.addOperation(__operation);

		_operations[30] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"urn:partner.soap.sforce.com", "delete"));
		_service.addOperation(__operation);

		_operations[31] = __operation;

	}

	// populates the faults
	private void populateFaults() {

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "merge"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "merge"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "merge"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"merge"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"merge"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"merge"), "com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "merge"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "merge"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "merge"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "merge"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "merge"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "merge"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getUserInfo"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getUserInfo"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getUserInfo"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSoftphoneLayout"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSoftphoneLayout"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSoftphoneLayout"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "update"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "update"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "update"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"update"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"update"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"update"), "com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "update"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "update"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "update"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "update"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "update"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "update"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"setPassword"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"setPassword"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"setPassword"),
				"com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "setPassword"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "setPassword"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "setPassword"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidNewPasswordFault"), "setPassword"),
				"com.salesforce.soap.partner.InvalidNewPasswordFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidNewPasswordFault"), "setPassword"),
				"com.salesforce.soap.partner.InvalidNewPasswordFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidNewPasswordFault"), "setPassword"),
				"com.salesforce.soap.partner.fault.InvalidNewPasswordFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "logout"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "logout"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "logout"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "retrieve"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "retrieve"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "retrieve"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "retrieve"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "retrieve"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "retrieve"),
				"com.salesforce.soap.partner.fault.MalformedQueryFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"retrieve"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"retrieve"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"retrieve"),
				"com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "retrieve"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "retrieve"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "retrieve"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "retrieve"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "retrieve"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "retrieve"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "queryAll"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "queryAll"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "queryAll"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "queryAll"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "queryAll"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "queryAll"),
				"com.salesforce.soap.partner.fault.MalformedQueryFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"queryAll"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"queryAll"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"queryAll"),
				"com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "queryAll"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "queryAll"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "queryAll"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "queryAll"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "queryAll"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "queryAll"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "queryAll"),
				"com.salesforce.soap.partner.InvalidQueryLocatorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "queryAll"),
				"com.salesforce.soap.partner.InvalidQueryLocatorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "queryAll"),
				"com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "getUpdated"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "getUpdated"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "getUpdated"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getUpdated"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getUpdated"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getUpdated"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "undelete"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "undelete"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "undelete"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "create"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "create"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "create"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"create"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"create"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"create"), "com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "create"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "create"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "create"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "create"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "create"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "create"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "sendEmail"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "sendEmail"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "sendEmail"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "search"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "search"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "search"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedSearchFault"), "search"),
				"com.salesforce.soap.partner.MalformedSearchFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedSearchFault"), "search"),
				"com.salesforce.soap.partner.MalformedSearchFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedSearchFault"), "search"),
				"com.salesforce.soap.partner.fault.MalformedSearchFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "search"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "search"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "search"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "search"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "search"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "search"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "query"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "query"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "query"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "query"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "query"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "query"),
				"com.salesforce.soap.partner.fault.MalformedQueryFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"query"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"query"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"query"), "com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "query"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "query"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "query"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "query"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "query"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "query"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "query"),
				"com.salesforce.soap.partner.InvalidQueryLocatorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "query"),
				"com.salesforce.soap.partner.InvalidQueryLocatorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "query"),
				"com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "getDeleted"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "getDeleted"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "getDeleted"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getDeleted"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getDeleted"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getDeleted"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"process"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"process"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap
				.put(new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName(
								"urn:fault.partner.soap.sforce.com",
								"InvalidIdFault"), "process"),
						"com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "process"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "process"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "process"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"),
				"describeDataCategoryGroupStructures"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"),
				"describeDataCategoryGroupStructures"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"),
				"describeDataCategoryGroupStructures"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"),
				"describeDataCategoryGroupStructures"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"),
				"describeDataCategoryGroupStructures"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"),
				"describeDataCategoryGroupStructures"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"resetPassword"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"resetPassword"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"resetPassword"),
				"com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "resetPassword"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "resetPassword"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "resetPassword"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeGlobal"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeGlobal"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeGlobal"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeLayout"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeLayout"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeLayout"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap
				.put(new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName(
								"urn:fault.partner.soap.sforce.com",
								"InvalidIdFault"), "describeLayout"),
						"com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap
				.put(new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName(
								"urn:fault.partner.soap.sforce.com",
								"InvalidIdFault"), "describeLayout"),
						"com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"describeLayout"),
				"com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeLayout"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeLayout"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeLayout"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeTabs"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeTabs"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeTabs"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeDataCategoryGroups"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeDataCategoryGroups"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeDataCategoryGroups"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeDataCategoryGroups"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeDataCategoryGroups"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeDataCategoryGroups"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getServerTimestamp"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getServerTimestamp"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "getServerTimestamp"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "invalidateSessions"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "invalidateSessions"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "invalidateSessions"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeSObject"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeSObject"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeSObject"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSObject"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSObject"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSObject"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"login"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"login"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"login"), "com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "login"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "login"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "login"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "LoginFault"),
				"login"), "com.salesforce.soap.partner.LoginFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "LoginFault"),
				"login"), "com.salesforce.soap.partner.LoginFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "LoginFault"),
				"login"),
				"com.salesforce.soap.partner.SforceServiceStub$LoginFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "queryMore"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"MalformedQueryFault"), "queryMore"),
				"com.salesforce.soap.partner.MalformedQueryFault");
		faultMessageMap
				.put(new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName(
								"urn:fault.partner.soap.sforce.com",
								"MalformedQueryFault"), "queryMore"),
						"com.salesforce.soap.partner.SforceServiceStub$MalformedQueryFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "queryMore"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "queryMore"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "queryMore"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "queryMore"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "queryMore"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "queryMore"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "queryMore"),
				"com.salesforce.soap.partner.InvalidQueryLocatorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "queryMore"),
				"com.salesforce.soap.partner.InvalidQueryLocatorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidQueryLocatorFault"), "queryMore"),
				"com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeSObjects"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeSObjects"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "describeSObjects"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSObjects"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSObjects"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "describeSObjects"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "emptyRecycleBin"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "emptyRecycleBin"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "emptyRecycleBin"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "upsert"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "upsert"),
				"com.salesforce.soap.partner.InvalidSObjectFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidSObjectFault"), "upsert"),
				"com.salesforce.soap.partner.fault.InvalidSObjectFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"upsert"), "com.salesforce.soap.partner.InvalidIdFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"upsert"), "com.salesforce.soap.partner.InvalidIdFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com", "InvalidIdFault"),
				"upsert"), "com.salesforce.soap.partner.fault.InvalidIdFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "upsert"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "upsert"),
				"com.salesforce.soap.partner.InvalidFieldFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"InvalidFieldFault"), "upsert"),
				"com.salesforce.soap.partner.fault.InvalidFieldFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "upsert"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "upsert"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "upsert"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "convertLead"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "convertLead"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "convertLead"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "delete"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "delete"),
				"com.salesforce.soap.partner.UnexpectedErrorFault");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName(
						"urn:fault.partner.soap.sforce.com",
						"UnexpectedErrorFault"), "delete"),
				"com.salesforce.soap.partner.fault.UnexpectedErrorFaultE");

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public SforceServiceStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public SforceServiceStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener)
			throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(
				configurationContext, _service);

		_serviceClient.getOptions().setTo(
				new org.apache.axis2.addressing.EndpointReference(
						targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	}

	/**
	 * Default Constructor
	 */
	public SforceServiceStub(
			org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext,
				"https://login.salesforce.com/services/Soap/u/25.0");

	}

	/**
	 * Default Constructor
	 */
	public SforceServiceStub() throws org.apache.axis2.AxisFault {

		this("https://login.salesforce.com/services/Soap/u/25.0");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public SforceServiceStub(java.lang.String targetEndpoint)
			throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature Merge and update a set of sObjects based
	 * on object id
	 * 
	 * @see com.salesforce.soap.partner.SforceService#merge
	 * @param merge335
	 * 
	 * @param sessionHeader336
	 * 
	 * @param callOptions337
	 * 
	 * @param assignmentRuleHeader338
	 * 
	 * @param mruHeader339
	 * 
	 * @param allowFieldTruncationHeader340
	 * 
	 * @param disableFeedTrackingHeader341
	 * 
	 * @param streamingEnabledHeader342
	 * 
	 * @param debuggingHeader343
	 * 
	 * @param packageVersionHeader344
	 * 
	 * @param emailHeader345
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.MergeResponse merge(

			com.salesforce.soap.partner.Merge merge335,
			com.salesforce.soap.partner.SessionHeader sessionHeader336,
			com.salesforce.soap.partner.CallOptions callOptions337,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader338,
			com.salesforce.soap.partner.MruHeader mruHeader339,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader340,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader341,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader342,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader343,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader344,
			com.salesforce.soap.partner.EmailHeader emailHeader345)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:mergeRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), merge335,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader336 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader336 = toOM(
						sessionHeader336,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementsessionHeader336, env);

			}

			// add the children only if the parameter is not null
			if (callOptions337 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions337 = toOM(
						callOptions337,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementcallOptions337, env);

			}

			// add the children only if the parameter is not null
			if (assignmentRuleHeader338 != null) {

				org.apache.axiom.om.OMElement omElementassignmentRuleHeader338 = toOM(
						assignmentRuleHeader338,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementassignmentRuleHeader338, env);

			}

			// add the children only if the parameter is not null
			if (mruHeader339 != null) {

				org.apache.axiom.om.OMElement omElementmruHeader339 = toOM(
						mruHeader339,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementmruHeader339, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader340 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader340 = toOM(
						allowFieldTruncationHeader340,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementallowFieldTruncationHeader340, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader341 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader341 = toOM(
						disableFeedTrackingHeader341,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementdisableFeedTrackingHeader341, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader342 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader342 = toOM(
						streamingEnabledHeader342,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementstreamingEnabledHeader342, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader343 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader343 = toOM(
						debuggingHeader343,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementdebuggingHeader343, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader344 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader344 = toOM(
						packageVersionHeader344,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementpackageVersionHeader344, env);

			}

			// add the children only if the parameter is not null
			if (emailHeader345 != null) {

				org.apache.axiom.om.OMElement omElementemailHeader345 = toOM(
						emailHeader345,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "merge")));
				addHeader(omElementemailHeader345, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.MergeResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.MergeResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "merge"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "merge"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "merge"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Merge and
	 * update a set of sObjects based on object id
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startmerge
	 * @param merge335
	 * 
	 * @param sessionHeader336
	 * 
	 * @param callOptions337
	 * 
	 * @param assignmentRuleHeader338
	 * 
	 * @param mruHeader339
	 * 
	 * @param allowFieldTruncationHeader340
	 * 
	 * @param disableFeedTrackingHeader341
	 * 
	 * @param streamingEnabledHeader342
	 * 
	 * @param debuggingHeader343
	 * 
	 * @param packageVersionHeader344
	 * 
	 * @param emailHeader345
	 */
	public void startmerge(

			com.salesforce.soap.partner.Merge merge335,
			com.salesforce.soap.partner.SessionHeader sessionHeader336,
			com.salesforce.soap.partner.CallOptions callOptions337,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader338,
			com.salesforce.soap.partner.MruHeader mruHeader339,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader340,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader341,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader342,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader343,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader344,
			com.salesforce.soap.partner.EmailHeader emailHeader345,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:mergeRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), merge335,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "merge")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"merge"));

		// add the soap_headers only if they are not null
		if (sessionHeader336 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader336 = toOM(
					sessionHeader336,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementsessionHeader336, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions337 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions337 = toOM(
					callOptions337,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementcallOptions337, env);

		}

		// add the soap_headers only if they are not null
		if (assignmentRuleHeader338 != null) {

			org.apache.axiom.om.OMElement omElementassignmentRuleHeader338 = toOM(
					assignmentRuleHeader338,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementassignmentRuleHeader338, env);

		}

		// add the soap_headers only if they are not null
		if (mruHeader339 != null) {

			org.apache.axiom.om.OMElement omElementmruHeader339 = toOM(
					mruHeader339,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementmruHeader339, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader340 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader340 = toOM(
					allowFieldTruncationHeader340,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementallowFieldTruncationHeader340, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader341 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader341 = toOM(
					disableFeedTrackingHeader341,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementdisableFeedTrackingHeader341, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader342 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader342 = toOM(
					streamingEnabledHeader342,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementstreamingEnabledHeader342, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader343 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader343 = toOM(
					debuggingHeader343,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementdebuggingHeader343, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader344 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader344 = toOM(
					packageVersionHeader344,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementpackageVersionHeader344, env);

		}

		// add the soap_headers only if they are not null
		if (emailHeader345 != null) {

			org.apache.axiom.om.OMElement omElementemailHeader345 = toOM(
					emailHeader345,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "merge")));
			addHeader(omElementemailHeader345, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.MergeResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultmerge((com.salesforce.soap.partner.MergeResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrormerge(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "merge"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"merge"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"merge"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrormerge((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrormerge((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrormerge((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrormerge((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrormerge(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrormerge(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrormerge(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrormerge(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrormerge(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrormerge(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrormerge(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrormerge(f);
									}
								} else {
									callback.receiveErrormerge(f);
								}
							} else {
								callback.receiveErrormerge(f);
							}
						} else {
							callback.receiveErrormerge(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrormerge(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns standard information relevant to
	 * the current user
	 * 
	 * @see com.salesforce.soap.partner.SforceService#getUserInfo
	 * @param getUserInfo347
	 * 
	 * @param sessionHeader348
	 * 
	 * @param callOptions349
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.GetUserInfoResponse getUserInfo(

	com.salesforce.soap.partner.GetUserInfo getUserInfo347,
			com.salesforce.soap.partner.SessionHeader sessionHeader348,
			com.salesforce.soap.partner.CallOptions callOptions349)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:getUserInfoRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getUserInfo347,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUserInfo")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUserInfo"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader348 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader348 = toOM(
						sessionHeader348,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "getUserInfo")));
				addHeader(omElementsessionHeader348, env);

			}

			// add the children only if the parameter is not null
			if (callOptions349 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions349 = toOM(
						callOptions349,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "getUserInfo")));
				addHeader(omElementcallOptions349, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.GetUserInfoResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.GetUserInfoResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "getUserInfo"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "getUserInfo"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "getUserInfo"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * standard information relevant to the current user
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startgetUserInfo
	 * @param getUserInfo347
	 * 
	 * @param sessionHeader348
	 * 
	 * @param callOptions349
	 */
	public void startgetUserInfo(

			com.salesforce.soap.partner.GetUserInfo getUserInfo347,
			com.salesforce.soap.partner.SessionHeader sessionHeader348,
			com.salesforce.soap.partner.CallOptions callOptions349,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:getUserInfoRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getUserInfo347,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "getUserInfo")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"getUserInfo"));

		// add the soap_headers only if they are not null
		if (sessionHeader348 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader348 = toOM(
					sessionHeader348,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUserInfo")));
			addHeader(omElementsessionHeader348, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions349 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions349 = toOM(
					callOptions349,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUserInfo")));
			addHeader(omElementcallOptions349, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.GetUserInfoResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultgetUserInfo((com.salesforce.soap.partner.GetUserInfoResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorgetUserInfo(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"getUserInfo"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getUserInfo"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getUserInfo"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorgetUserInfo((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorgetUserInfo(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUserInfo(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUserInfo(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUserInfo(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUserInfo(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUserInfo(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUserInfo(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUserInfo(f);
									}
								} else {
									callback.receiveErrorgetUserInfo(f);
								}
							} else {
								callback.receiveErrorgetUserInfo(f);
							}
						} else {
							callback.receiveErrorgetUserInfo(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorgetUserInfo(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe the layout of the SoftPhone
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeSoftphoneLayout
	 * @param describeSoftphoneLayout351
	 * 
	 * @param sessionHeader352
	 * 
	 * @param callOptions353
	 * 
	 * @param packageVersionHeader354
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(

			com.salesforce.soap.partner.DescribeSoftphoneLayout describeSoftphoneLayout351,
			com.salesforce.soap.partner.SessionHeader sessionHeader352,
			com.salesforce.soap.partner.CallOptions callOptions353,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader354)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient
					.getOptions()
					.setAction(
							"urn:partner.soap.sforce.com:Soap:describeSoftphoneLayoutRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), describeSoftphoneLayout351,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeSoftphoneLayout")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeSoftphoneLayout"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader352 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader352 = toOM(
						sessionHeader352,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSoftphoneLayout")));
				addHeader(omElementsessionHeader352, env);

			}

			// add the children only if the parameter is not null
			if (callOptions353 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions353 = toOM(
						callOptions353,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSoftphoneLayout")));
				addHeader(omElementcallOptions353, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader354 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader354 = toOM(
						packageVersionHeader354,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSoftphoneLayout")));
				addHeader(omElementpackageVersionHeader354, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "describeSoftphoneLayout"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"describeSoftphoneLayout"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"describeSoftphoneLayout"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe the
	 * layout of the SoftPhone
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeSoftphoneLayout
	 * @param describeSoftphoneLayout351
	 * 
	 * @param sessionHeader352
	 * 
	 * @param callOptions353
	 * 
	 * @param packageVersionHeader354
	 */
	public void startdescribeSoftphoneLayout(

			com.salesforce.soap.partner.DescribeSoftphoneLayout describeSoftphoneLayout351,
			com.salesforce.soap.partner.SessionHeader sessionHeader352,
			com.salesforce.soap.partner.CallOptions callOptions353,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader354,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient
				.getOptions()
				.setAction(
						"urn:partner.soap.sforce.com:Soap:describeSoftphoneLayoutRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeSoftphoneLayout351,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com",
						"describeSoftphoneLayout")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeSoftphoneLayout"));

		// add the soap_headers only if they are not null
		if (sessionHeader352 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader352 = toOM(
					sessionHeader352,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeSoftphoneLayout")));
			addHeader(omElementsessionHeader352, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions353 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions353 = toOM(
					callOptions353,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeSoftphoneLayout")));
			addHeader(omElementcallOptions353, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader354 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader354 = toOM(
					packageVersionHeader354,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeSoftphoneLayout")));
			addHeader(omElementpackageVersionHeader354, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeSoftphoneLayout((com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeSoftphoneLayout(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeSoftphoneLayout"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeSoftphoneLayout"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeSoftphoneLayout"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeSoftphoneLayout((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeSoftphoneLayout(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSoftphoneLayout(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSoftphoneLayout(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSoftphoneLayout(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSoftphoneLayout(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSoftphoneLayout(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSoftphoneLayout(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSoftphoneLayout(f);
									}
								} else {
									callback.receiveErrordescribeSoftphoneLayout(f);
								}
							} else {
								callback.receiveErrordescribeSoftphoneLayout(f);
							}
						} else {
							callback.receiveErrordescribeSoftphoneLayout(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeSoftphoneLayout(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Update a set of sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#update
	 * @param update356
	 * 
	 * @param sessionHeader357
	 * 
	 * @param callOptions358
	 * 
	 * @param assignmentRuleHeader359
	 * 
	 * @param mruHeader360
	 * 
	 * @param allowFieldTruncationHeader361
	 * 
	 * @param disableFeedTrackingHeader362
	 * 
	 * @param streamingEnabledHeader363
	 * 
	 * @param allOrNoneHeader364
	 * 
	 * @param debuggingHeader365
	 * 
	 * @param packageVersionHeader366
	 * 
	 * @param emailHeader367
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.UpdateResponse update(

			com.salesforce.soap.partner.Update update356,
			com.salesforce.soap.partner.SessionHeader sessionHeader357,
			com.salesforce.soap.partner.CallOptions callOptions358,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader359,
			com.salesforce.soap.partner.MruHeader mruHeader360,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader361,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader362,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader363,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader364,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader365,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader366,
			com.salesforce.soap.partner.EmailHeader emailHeader367)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:updateRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), update356,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader357 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader357 = toOM(
						sessionHeader357,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementsessionHeader357, env);

			}

			// add the children only if the parameter is not null
			if (callOptions358 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions358 = toOM(
						callOptions358,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementcallOptions358, env);

			}

			// add the children only if the parameter is not null
			if (assignmentRuleHeader359 != null) {

				org.apache.axiom.om.OMElement omElementassignmentRuleHeader359 = toOM(
						assignmentRuleHeader359,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementassignmentRuleHeader359, env);

			}

			// add the children only if the parameter is not null
			if (mruHeader360 != null) {

				org.apache.axiom.om.OMElement omElementmruHeader360 = toOM(
						mruHeader360,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementmruHeader360, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader361 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader361 = toOM(
						allowFieldTruncationHeader361,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementallowFieldTruncationHeader361, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader362 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader362 = toOM(
						disableFeedTrackingHeader362,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementdisableFeedTrackingHeader362, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader363 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader363 = toOM(
						streamingEnabledHeader363,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementstreamingEnabledHeader363, env);

			}

			// add the children only if the parameter is not null
			if (allOrNoneHeader364 != null) {

				org.apache.axiom.om.OMElement omElementallOrNoneHeader364 = toOM(
						allOrNoneHeader364,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementallOrNoneHeader364, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader365 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader365 = toOM(
						debuggingHeader365,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementdebuggingHeader365, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader366 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader366 = toOM(
						packageVersionHeader366,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementpackageVersionHeader366, env);

			}

			// add the children only if the parameter is not null
			if (emailHeader367 != null) {

				org.apache.axiom.om.OMElement omElementemailHeader367 = toOM(
						emailHeader367,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "update")));
				addHeader(omElementemailHeader367, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.UpdateResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.UpdateResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "update"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "update"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "update"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Update a set
	 * of sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startupdate
	 * @param update356
	 * 
	 * @param sessionHeader357
	 * 
	 * @param callOptions358
	 * 
	 * @param assignmentRuleHeader359
	 * 
	 * @param mruHeader360
	 * 
	 * @param allowFieldTruncationHeader361
	 * 
	 * @param disableFeedTrackingHeader362
	 * 
	 * @param streamingEnabledHeader363
	 * 
	 * @param allOrNoneHeader364
	 * 
	 * @param debuggingHeader365
	 * 
	 * @param packageVersionHeader366
	 * 
	 * @param emailHeader367
	 */
	public void startupdate(

			com.salesforce.soap.partner.Update update356,
			com.salesforce.soap.partner.SessionHeader sessionHeader357,
			com.salesforce.soap.partner.CallOptions callOptions358,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader359,
			com.salesforce.soap.partner.MruHeader mruHeader360,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader361,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader362,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader363,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader364,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader365,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader366,
			com.salesforce.soap.partner.EmailHeader emailHeader367,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:updateRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), update356,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "update")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"update"));

		// add the soap_headers only if they are not null
		if (sessionHeader357 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader357 = toOM(
					sessionHeader357,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementsessionHeader357, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions358 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions358 = toOM(
					callOptions358,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementcallOptions358, env);

		}

		// add the soap_headers only if they are not null
		if (assignmentRuleHeader359 != null) {

			org.apache.axiom.om.OMElement omElementassignmentRuleHeader359 = toOM(
					assignmentRuleHeader359,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementassignmentRuleHeader359, env);

		}

		// add the soap_headers only if they are not null
		if (mruHeader360 != null) {

			org.apache.axiom.om.OMElement omElementmruHeader360 = toOM(
					mruHeader360,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementmruHeader360, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader361 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader361 = toOM(
					allowFieldTruncationHeader361,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementallowFieldTruncationHeader361, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader362 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader362 = toOM(
					disableFeedTrackingHeader362,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementdisableFeedTrackingHeader362, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader363 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader363 = toOM(
					streamingEnabledHeader363,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementstreamingEnabledHeader363, env);

		}

		// add the soap_headers only if they are not null
		if (allOrNoneHeader364 != null) {

			org.apache.axiom.om.OMElement omElementallOrNoneHeader364 = toOM(
					allOrNoneHeader364,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementallOrNoneHeader364, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader365 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader365 = toOM(
					debuggingHeader365,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementdebuggingHeader365, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader366 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader366 = toOM(
					packageVersionHeader366,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementpackageVersionHeader366, env);

		}

		// add the soap_headers only if they are not null
		if (emailHeader367 != null) {

			org.apache.axiom.om.OMElement omElementemailHeader367 = toOM(
					emailHeader367,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "update")));
			addHeader(omElementemailHeader367, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.UpdateResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultupdate((com.salesforce.soap.partner.UpdateResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorupdate(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "update"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"update"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"update"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorupdate((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorupdate((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorupdate((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorupdate((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorupdate(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupdate(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupdate(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupdate(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupdate(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupdate(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupdate(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupdate(f);
									}
								} else {
									callback.receiveErrorupdate(f);
								}
							} else {
								callback.receiveErrorupdate(f);
							}
						} else {
							callback.receiveErrorupdate(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorupdate(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[3].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Set a user's password
	 * 
	 * @see com.salesforce.soap.partner.SforceService#setPassword
	 * @param setPassword369
	 * 
	 * @param sessionHeader370
	 * 
	 * @param callOptions371
	 * 
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidNewPasswordFault
	 *             :
	 */

	public com.salesforce.soap.partner.SetPasswordResponse setPassword(

	com.salesforce.soap.partner.SetPassword setPassword369,
			com.salesforce.soap.partner.SessionHeader sessionHeader370,
			com.salesforce.soap.partner.CallOptions callOptions371)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.UnexpectedErrorFault,
			com.salesforce.soap.partner.InvalidNewPasswordFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:setPasswordRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), setPassword369,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "setPassword")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "setPassword"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader370 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader370 = toOM(
						sessionHeader370,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "setPassword")));
				addHeader(omElementsessionHeader370, env);

			}

			// add the children only if the parameter is not null
			if (callOptions371 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions371 = toOM(
						callOptions371,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "setPassword")));
				addHeader(omElementcallOptions371, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.SetPasswordResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.SetPasswordResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "setPassword"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "setPassword"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "setPassword"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidNewPasswordFault) {
							throw (com.salesforce.soap.partner.InvalidNewPasswordFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Set a user's
	 * password
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startsetPassword
	 * @param setPassword369
	 * 
	 * @param sessionHeader370
	 * 
	 * @param callOptions371
	 */
	public void startsetPassword(

			com.salesforce.soap.partner.SetPassword setPassword369,
			com.salesforce.soap.partner.SessionHeader sessionHeader370,
			com.salesforce.soap.partner.CallOptions callOptions371,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:setPasswordRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), setPassword369,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "setPassword")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"setPassword"));

		// add the soap_headers only if they are not null
		if (sessionHeader370 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader370 = toOM(
					sessionHeader370,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "setPassword")));
			addHeader(omElementsessionHeader370, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions371 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions371 = toOM(
					callOptions371,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "setPassword")));
			addHeader(omElementcallOptions371, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.SetPasswordResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultsetPassword((com.salesforce.soap.partner.SetPasswordResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorsetPassword(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"setPassword"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"setPassword"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"setPassword"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorsetPassword((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorsetPassword((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidNewPasswordFault) {
											callback.receiveErrorsetPassword((com.salesforce.soap.partner.InvalidNewPasswordFault) ex);
											return;
										}

										callback.receiveErrorsetPassword(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsetPassword(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsetPassword(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsetPassword(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsetPassword(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsetPassword(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsetPassword(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsetPassword(f);
									}
								} else {
									callback.receiveErrorsetPassword(f);
								}
							} else {
								callback.receiveErrorsetPassword(f);
							}
						} else {
							callback.receiveErrorsetPassword(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorsetPassword(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[4].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Logout the current user, invalidating the
	 * current session.
	 * 
	 * @see com.salesforce.soap.partner.SforceService#logout
	 * @param logout373
	 * 
	 * @param sessionHeader374
	 * 
	 * @param callOptions375
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.LogoutResponse logout(

	com.salesforce.soap.partner.Logout logout373,
			com.salesforce.soap.partner.SessionHeader sessionHeader374,
			com.salesforce.soap.partner.CallOptions callOptions375)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[5].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:logoutRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), logout373,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "logout")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "logout"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader374 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader374 = toOM(
						sessionHeader374,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "logout")));
				addHeader(omElementsessionHeader374, env);

			}

			// add the children only if the parameter is not null
			if (callOptions375 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions375 = toOM(
						callOptions375,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "logout")));
				addHeader(omElementcallOptions375, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.LogoutResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.LogoutResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "logout"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "logout"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "logout"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Logout the
	 * current user, invalidating the current session.
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startlogout
	 * @param logout373
	 * 
	 * @param sessionHeader374
	 * 
	 * @param callOptions375
	 */
	public void startlogout(

			com.salesforce.soap.partner.Logout logout373,
			com.salesforce.soap.partner.SessionHeader sessionHeader374,
			com.salesforce.soap.partner.CallOptions callOptions375,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[5].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:logoutRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), logout373,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "logout")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"logout"));

		// add the soap_headers only if they are not null
		if (sessionHeader374 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader374 = toOM(
					sessionHeader374,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "logout")));
			addHeader(omElementsessionHeader374, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions375 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions375 = toOM(
					callOptions375,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "logout")));
			addHeader(omElementcallOptions375, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.LogoutResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultlogout((com.salesforce.soap.partner.LogoutResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorlogout(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "logout"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"logout"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"logout"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorlogout((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorlogout(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogout(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogout(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogout(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogout(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogout(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogout(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogout(f);
									}
								} else {
									callback.receiveErrorlogout(f);
								}
							} else {
								callback.receiveErrorlogout(f);
							}
						} else {
							callback.receiveErrorlogout(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorlogout(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[5].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[5].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Get a set of sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#retrieve
	 * @param retrieve377
	 * 
	 * @param sessionHeader378
	 * 
	 * @param callOptions379
	 * 
	 * @param queryOptions380
	 * 
	 * @param mruHeader381
	 * 
	 * @param packageVersionHeader382
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.MalformedQueryFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.RetrieveResponse retrieve(

			com.salesforce.soap.partner.Retrieve retrieve377,
			com.salesforce.soap.partner.SessionHeader sessionHeader378,
			com.salesforce.soap.partner.CallOptions callOptions379,
			com.salesforce.soap.partner.QueryOptions queryOptions380,
			com.salesforce.soap.partner.MruHeader mruHeader381,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader382)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.MalformedQueryFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[6].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:retrieveRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), retrieve377,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "retrieve")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "retrieve"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader378 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader378 = toOM(
						sessionHeader378,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "retrieve")));
				addHeader(omElementsessionHeader378, env);

			}

			// add the children only if the parameter is not null
			if (callOptions379 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions379 = toOM(
						callOptions379,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "retrieve")));
				addHeader(omElementcallOptions379, env);

			}

			// add the children only if the parameter is not null
			if (queryOptions380 != null) {

				org.apache.axiom.om.OMElement omElementqueryOptions380 = toOM(
						queryOptions380,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "retrieve")));
				addHeader(omElementqueryOptions380, env);

			}

			// add the children only if the parameter is not null
			if (mruHeader381 != null) {

				org.apache.axiom.om.OMElement omElementmruHeader381 = toOM(
						mruHeader381,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "retrieve")));
				addHeader(omElementmruHeader381, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader382 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader382 = toOM(
						packageVersionHeader382,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "retrieve")));
				addHeader(omElementpackageVersionHeader382, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.RetrieveResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.RetrieveResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "retrieve"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "retrieve"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "retrieve"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
							throw (com.salesforce.soap.partner.MalformedQueryFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Get a set of
	 * sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startretrieve
	 * @param retrieve377
	 * 
	 * @param sessionHeader378
	 * 
	 * @param callOptions379
	 * 
	 * @param queryOptions380
	 * 
	 * @param mruHeader381
	 * 
	 * @param packageVersionHeader382
	 */
	public void startretrieve(

			com.salesforce.soap.partner.Retrieve retrieve377,
			com.salesforce.soap.partner.SessionHeader sessionHeader378,
			com.salesforce.soap.partner.CallOptions callOptions379,
			com.salesforce.soap.partner.QueryOptions queryOptions380,
			com.salesforce.soap.partner.MruHeader mruHeader381,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader382,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[6].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:retrieveRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), retrieve377,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "retrieve")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"retrieve"));

		// add the soap_headers only if they are not null
		if (sessionHeader378 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader378 = toOM(
					sessionHeader378,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "retrieve")));
			addHeader(omElementsessionHeader378, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions379 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions379 = toOM(
					callOptions379,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "retrieve")));
			addHeader(omElementcallOptions379, env);

		}

		// add the soap_headers only if they are not null
		if (queryOptions380 != null) {

			org.apache.axiom.om.OMElement omElementqueryOptions380 = toOM(
					queryOptions380,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "retrieve")));
			addHeader(omElementqueryOptions380, env);

		}

		// add the soap_headers only if they are not null
		if (mruHeader381 != null) {

			org.apache.axiom.om.OMElement omElementmruHeader381 = toOM(
					mruHeader381,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "retrieve")));
			addHeader(omElementmruHeader381, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader382 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader382 = toOM(
					packageVersionHeader382,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "retrieve")));
			addHeader(omElementpackageVersionHeader382, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.RetrieveResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultretrieve((com.salesforce.soap.partner.RetrieveResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorretrieve(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "retrieve"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"retrieve"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"retrieve"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorretrieve((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
											callback.receiveErrorretrieve((com.salesforce.soap.partner.MalformedQueryFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorretrieve((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorretrieve((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorretrieve((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorretrieve(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorretrieve(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorretrieve(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorretrieve(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorretrieve(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorretrieve(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorretrieve(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorretrieve(f);
									}
								} else {
									callback.receiveErrorretrieve(f);
								}
							} else {
								callback.receiveErrorretrieve(f);
							}
						} else {
							callback.receiveErrorretrieve(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorretrieve(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[6].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[6].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Create a Query Cursor, including deleted
	 * sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#queryAll
	 * @param queryAll384
	 * 
	 * @param sessionHeader385
	 * 
	 * @param callOptions386
	 * 
	 * @param queryOptions387
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.MalformedQueryFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidQueryLocatorFault
	 *             :
	 */

	public com.salesforce.soap.partner.QueryAllResponse queryAll(

	com.salesforce.soap.partner.QueryAll queryAll384,
			com.salesforce.soap.partner.SessionHeader sessionHeader385,
			com.salesforce.soap.partner.CallOptions callOptions386,
			com.salesforce.soap.partner.QueryOptions queryOptions387)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.MalformedQueryFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault,
			com.salesforce.soap.partner.InvalidQueryLocatorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[7].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:queryAllRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), queryAll384,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryAll")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryAll"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader385 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader385 = toOM(
						sessionHeader385,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "queryAll")));
				addHeader(omElementsessionHeader385, env);

			}

			// add the children only if the parameter is not null
			if (callOptions386 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions386 = toOM(
						callOptions386,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "queryAll")));
				addHeader(omElementcallOptions386, env);

			}

			// add the children only if the parameter is not null
			if (queryOptions387 != null) {

				org.apache.axiom.om.OMElement omElementqueryOptions387 = toOM(
						queryOptions387,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "queryAll")));
				addHeader(omElementqueryOptions387, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.QueryAllResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.QueryAllResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "queryAll"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "queryAll"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "queryAll"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
							throw (com.salesforce.soap.partner.MalformedQueryFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidQueryLocatorFault) {
							throw (com.salesforce.soap.partner.InvalidQueryLocatorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Create a
	 * Query Cursor, including deleted sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startqueryAll
	 * @param queryAll384
	 * 
	 * @param sessionHeader385
	 * 
	 * @param callOptions386
	 * 
	 * @param queryOptions387
	 */
	public void startqueryAll(

			com.salesforce.soap.partner.QueryAll queryAll384,
			com.salesforce.soap.partner.SessionHeader sessionHeader385,
			com.salesforce.soap.partner.CallOptions callOptions386,
			com.salesforce.soap.partner.QueryOptions queryOptions387,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[7].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:queryAllRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), queryAll384,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "queryAll")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"queryAll"));

		// add the soap_headers only if they are not null
		if (sessionHeader385 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader385 = toOM(
					sessionHeader385,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryAll")));
			addHeader(omElementsessionHeader385, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions386 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions386 = toOM(
					callOptions386,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryAll")));
			addHeader(omElementcallOptions386, env);

		}

		// add the soap_headers only if they are not null
		if (queryOptions387 != null) {

			org.apache.axiom.om.OMElement omElementqueryOptions387 = toOM(
					queryOptions387,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryAll")));
			addHeader(omElementqueryOptions387, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.QueryAllResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultqueryAll((com.salesforce.soap.partner.QueryAllResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorqueryAll(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "queryAll"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"queryAll"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"queryAll"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorqueryAll((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
											callback.receiveErrorqueryAll((com.salesforce.soap.partner.MalformedQueryFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorqueryAll((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorqueryAll((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorqueryAll((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidQueryLocatorFault) {
											callback.receiveErrorqueryAll((com.salesforce.soap.partner.InvalidQueryLocatorFault) ex);
											return;
										}

										callback.receiveErrorqueryAll(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryAll(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryAll(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryAll(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryAll(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryAll(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryAll(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryAll(f);
									}
								} else {
									callback.receiveErrorqueryAll(f);
								}
							} else {
								callback.receiveErrorqueryAll(f);
							}
						} else {
							callback.receiveErrorqueryAll(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorqueryAll(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[7].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[7].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Get the IDs for updated sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#getUpdated
	 * @param getUpdated389
	 * 
	 * @param sessionHeader390
	 * 
	 * @param callOptions391
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.GetUpdatedResponse getUpdated(

	com.salesforce.soap.partner.GetUpdated getUpdated389,
			com.salesforce.soap.partner.SessionHeader sessionHeader390,
			com.salesforce.soap.partner.CallOptions callOptions391)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[8].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:getUpdatedRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getUpdated389,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUpdated")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUpdated"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader390 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader390 = toOM(
						sessionHeader390,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "getUpdated")));
				addHeader(omElementsessionHeader390, env);

			}

			// add the children only if the parameter is not null
			if (callOptions391 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions391 = toOM(
						callOptions391,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "getUpdated")));
				addHeader(omElementcallOptions391, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.GetUpdatedResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.GetUpdatedResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "getUpdated"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "getUpdated"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "getUpdated"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Get the IDs
	 * for updated sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startgetUpdated
	 * @param getUpdated389
	 * 
	 * @param sessionHeader390
	 * 
	 * @param callOptions391
	 */
	public void startgetUpdated(

			com.salesforce.soap.partner.GetUpdated getUpdated389,
			com.salesforce.soap.partner.SessionHeader sessionHeader390,
			com.salesforce.soap.partner.CallOptions callOptions391,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[8].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:getUpdatedRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getUpdated389,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "getUpdated")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"getUpdated"));

		// add the soap_headers only if they are not null
		if (sessionHeader390 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader390 = toOM(
					sessionHeader390,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUpdated")));
			addHeader(omElementsessionHeader390, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions391 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions391 = toOM(
					callOptions391,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getUpdated")));
			addHeader(omElementcallOptions391, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.GetUpdatedResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultgetUpdated((com.salesforce.soap.partner.GetUpdatedResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorgetUpdated(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"getUpdated"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getUpdated"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getUpdated"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorgetUpdated((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorgetUpdated((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorgetUpdated(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUpdated(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUpdated(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUpdated(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUpdated(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUpdated(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUpdated(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetUpdated(f);
									}
								} else {
									callback.receiveErrorgetUpdated(f);
								}
							} else {
								callback.receiveErrorgetUpdated(f);
							}
						} else {
							callback.receiveErrorgetUpdated(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorgetUpdated(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[8].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[8].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Undelete a set of sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#undelete
	 * @param undelete393
	 * 
	 * @param sessionHeader394
	 * 
	 * @param callOptions395
	 * 
	 * @param allowFieldTruncationHeader396
	 * 
	 * @param disableFeedTrackingHeader397
	 * 
	 * @param streamingEnabledHeader398
	 * 
	 * @param allOrNoneHeader399
	 * 
	 * @param debuggingHeader400
	 * 
	 * @param packageVersionHeader401
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.UndeleteResponse undelete(

			com.salesforce.soap.partner.Undelete undelete393,
			com.salesforce.soap.partner.SessionHeader sessionHeader394,
			com.salesforce.soap.partner.CallOptions callOptions395,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader396,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader397,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader398,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader399,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader400,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader401)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[9].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:undeleteRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), undelete393,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader394 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader394 = toOM(
						sessionHeader394,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementsessionHeader394, env);

			}

			// add the children only if the parameter is not null
			if (callOptions395 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions395 = toOM(
						callOptions395,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementcallOptions395, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader396 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader396 = toOM(
						allowFieldTruncationHeader396,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementallowFieldTruncationHeader396, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader397 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader397 = toOM(
						disableFeedTrackingHeader397,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementdisableFeedTrackingHeader397, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader398 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader398 = toOM(
						streamingEnabledHeader398,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementstreamingEnabledHeader398, env);

			}

			// add the children only if the parameter is not null
			if (allOrNoneHeader399 != null) {

				org.apache.axiom.om.OMElement omElementallOrNoneHeader399 = toOM(
						allOrNoneHeader399,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementallOrNoneHeader399, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader400 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader400 = toOM(
						debuggingHeader400,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementdebuggingHeader400, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader401 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader401 = toOM(
						packageVersionHeader401,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "undelete")));
				addHeader(omElementpackageVersionHeader401, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.UndeleteResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.UndeleteResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "undelete"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "undelete"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "undelete"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Undelete a
	 * set of sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startundelete
	 * @param undelete393
	 * 
	 * @param sessionHeader394
	 * 
	 * @param callOptions395
	 * 
	 * @param allowFieldTruncationHeader396
	 * 
	 * @param disableFeedTrackingHeader397
	 * 
	 * @param streamingEnabledHeader398
	 * 
	 * @param allOrNoneHeader399
	 * 
	 * @param debuggingHeader400
	 * 
	 * @param packageVersionHeader401
	 */
	public void startundelete(

			com.salesforce.soap.partner.Undelete undelete393,
			com.salesforce.soap.partner.SessionHeader sessionHeader394,
			com.salesforce.soap.partner.CallOptions callOptions395,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader396,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader397,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader398,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader399,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader400,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader401,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[9].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:undeleteRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), undelete393,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "undelete")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"undelete"));

		// add the soap_headers only if they are not null
		if (sessionHeader394 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader394 = toOM(
					sessionHeader394,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementsessionHeader394, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions395 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions395 = toOM(
					callOptions395,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementcallOptions395, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader396 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader396 = toOM(
					allowFieldTruncationHeader396,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementallowFieldTruncationHeader396, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader397 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader397 = toOM(
					disableFeedTrackingHeader397,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementdisableFeedTrackingHeader397, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader398 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader398 = toOM(
					streamingEnabledHeader398,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementstreamingEnabledHeader398, env);

		}

		// add the soap_headers only if they are not null
		if (allOrNoneHeader399 != null) {

			org.apache.axiom.om.OMElement omElementallOrNoneHeader399 = toOM(
					allOrNoneHeader399,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementallOrNoneHeader399, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader400 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader400 = toOM(
					debuggingHeader400,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementdebuggingHeader400, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader401 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader401 = toOM(
					packageVersionHeader401,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "undelete")));
			addHeader(omElementpackageVersionHeader401, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.UndeleteResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultundelete((com.salesforce.soap.partner.UndeleteResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorundelete(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "undelete"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"undelete"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"undelete"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorundelete((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorundelete(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorundelete(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorundelete(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorundelete(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorundelete(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorundelete(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorundelete(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorundelete(f);
									}
								} else {
									callback.receiveErrorundelete(f);
								}
							} else {
								callback.receiveErrorundelete(f);
							}
						} else {
							callback.receiveErrorundelete(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorundelete(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[9].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[9].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Create a set of new sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#create
	 * @param create403
	 * 
	 * @param sessionHeader404
	 * 
	 * @param callOptions405
	 * 
	 * @param assignmentRuleHeader406
	 * 
	 * @param mruHeader407
	 * 
	 * @param allowFieldTruncationHeader408
	 * 
	 * @param disableFeedTrackingHeader409
	 * 
	 * @param streamingEnabledHeader410
	 * 
	 * @param allOrNoneHeader411
	 * 
	 * @param debuggingHeader412
	 * 
	 * @param packageVersionHeader413
	 * 
	 * @param emailHeader414
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.CreateResponse create(

			com.salesforce.soap.partner.Create create403,
			com.salesforce.soap.partner.SessionHeader sessionHeader404,
			com.salesforce.soap.partner.CallOptions callOptions405,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader406,
			com.salesforce.soap.partner.MruHeader mruHeader407,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader408,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader409,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader410,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader411,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader412,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader413,
			com.salesforce.soap.partner.EmailHeader emailHeader414)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[10].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:createRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), create403,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader404 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader404 = toOM(
						sessionHeader404,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementsessionHeader404, env);

			}

			// add the children only if the parameter is not null
			if (callOptions405 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions405 = toOM(
						callOptions405,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementcallOptions405, env);

			}

			// add the children only if the parameter is not null
			if (assignmentRuleHeader406 != null) {

				org.apache.axiom.om.OMElement omElementassignmentRuleHeader406 = toOM(
						assignmentRuleHeader406,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementassignmentRuleHeader406, env);

			}

			// add the children only if the parameter is not null
			if (mruHeader407 != null) {

				org.apache.axiom.om.OMElement omElementmruHeader407 = toOM(
						mruHeader407,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementmruHeader407, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader408 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader408 = toOM(
						allowFieldTruncationHeader408,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementallowFieldTruncationHeader408, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader409 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader409 = toOM(
						disableFeedTrackingHeader409,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementdisableFeedTrackingHeader409, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader410 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader410 = toOM(
						streamingEnabledHeader410,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementstreamingEnabledHeader410, env);

			}

			// add the children only if the parameter is not null
			if (allOrNoneHeader411 != null) {

				org.apache.axiom.om.OMElement omElementallOrNoneHeader411 = toOM(
						allOrNoneHeader411,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementallOrNoneHeader411, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader412 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader412 = toOM(
						debuggingHeader412,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementdebuggingHeader412, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader413 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader413 = toOM(
						packageVersionHeader413,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementpackageVersionHeader413, env);

			}

			// add the children only if the parameter is not null
			if (emailHeader414 != null) {

				org.apache.axiom.om.OMElement omElementemailHeader414 = toOM(
						emailHeader414,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "create")));
				addHeader(omElementemailHeader414, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.CreateResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.CreateResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "create"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "create"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "create"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Create a set
	 * of new sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startcreate
	 * @param create403
	 * 
	 * @param sessionHeader404
	 * 
	 * @param callOptions405
	 * 
	 * @param assignmentRuleHeader406
	 * 
	 * @param mruHeader407
	 * 
	 * @param allowFieldTruncationHeader408
	 * 
	 * @param disableFeedTrackingHeader409
	 * 
	 * @param streamingEnabledHeader410
	 * 
	 * @param allOrNoneHeader411
	 * 
	 * @param debuggingHeader412
	 * 
	 * @param packageVersionHeader413
	 * 
	 * @param emailHeader414
	 */
	public void startcreate(

			com.salesforce.soap.partner.Create create403,
			com.salesforce.soap.partner.SessionHeader sessionHeader404,
			com.salesforce.soap.partner.CallOptions callOptions405,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader406,
			com.salesforce.soap.partner.MruHeader mruHeader407,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader408,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader409,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader410,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader411,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader412,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader413,
			com.salesforce.soap.partner.EmailHeader emailHeader414,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[10].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:createRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), create403,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "create")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"create"));

		// add the soap_headers only if they are not null
		if (sessionHeader404 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader404 = toOM(
					sessionHeader404,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementsessionHeader404, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions405 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions405 = toOM(
					callOptions405,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementcallOptions405, env);

		}

		// add the soap_headers only if they are not null
		if (assignmentRuleHeader406 != null) {

			org.apache.axiom.om.OMElement omElementassignmentRuleHeader406 = toOM(
					assignmentRuleHeader406,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementassignmentRuleHeader406, env);

		}

		// add the soap_headers only if they are not null
		if (mruHeader407 != null) {

			org.apache.axiom.om.OMElement omElementmruHeader407 = toOM(
					mruHeader407,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementmruHeader407, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader408 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader408 = toOM(
					allowFieldTruncationHeader408,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementallowFieldTruncationHeader408, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader409 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader409 = toOM(
					disableFeedTrackingHeader409,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementdisableFeedTrackingHeader409, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader410 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader410 = toOM(
					streamingEnabledHeader410,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementstreamingEnabledHeader410, env);

		}

		// add the soap_headers only if they are not null
		if (allOrNoneHeader411 != null) {

			org.apache.axiom.om.OMElement omElementallOrNoneHeader411 = toOM(
					allOrNoneHeader411,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementallOrNoneHeader411, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader412 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader412 = toOM(
					debuggingHeader412,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementdebuggingHeader412, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader413 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader413 = toOM(
					packageVersionHeader413,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementpackageVersionHeader413, env);

		}

		// add the soap_headers only if they are not null
		if (emailHeader414 != null) {

			org.apache.axiom.om.OMElement omElementemailHeader414 = toOM(
					emailHeader414,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "create")));
			addHeader(omElementemailHeader414, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.CreateResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultcreate((com.salesforce.soap.partner.CreateResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorcreate(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "create"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"create"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"create"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorcreate((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorcreate((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorcreate((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorcreate((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorcreate(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcreate(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcreate(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcreate(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcreate(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcreate(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcreate(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorcreate(f);
									}
								} else {
									callback.receiveErrorcreate(f);
								}
							} else {
								callback.receiveErrorcreate(f);
							}
						} else {
							callback.receiveErrorcreate(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorcreate(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[10].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[10].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Send outbound email
	 * 
	 * @see com.salesforce.soap.partner.SforceService#sendEmail
	 * @param sendEmail416
	 * 
	 * @param sessionHeader417
	 * 
	 * @param callOptions418
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.SendEmailResponse sendEmail(

	com.salesforce.soap.partner.SendEmail sendEmail416,
			com.salesforce.soap.partner.SessionHeader sessionHeader417,
			com.salesforce.soap.partner.CallOptions callOptions418)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[11].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:sendEmailRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), sendEmail416,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "sendEmail")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "sendEmail"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader417 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader417 = toOM(
						sessionHeader417,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "sendEmail")));
				addHeader(omElementsessionHeader417, env);

			}

			// add the children only if the parameter is not null
			if (callOptions418 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions418 = toOM(
						callOptions418,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "sendEmail")));
				addHeader(omElementcallOptions418, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.SendEmailResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.SendEmailResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "sendEmail"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "sendEmail"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "sendEmail"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Send
	 * outbound email
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startsendEmail
	 * @param sendEmail416
	 * 
	 * @param sessionHeader417
	 * 
	 * @param callOptions418
	 */
	public void startsendEmail(

			com.salesforce.soap.partner.SendEmail sendEmail416,
			com.salesforce.soap.partner.SessionHeader sessionHeader417,
			com.salesforce.soap.partner.CallOptions callOptions418,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[11].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:sendEmailRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), sendEmail416,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "sendEmail")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"sendEmail"));

		// add the soap_headers only if they are not null
		if (sessionHeader417 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader417 = toOM(
					sessionHeader417,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "sendEmail")));
			addHeader(omElementsessionHeader417, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions418 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions418 = toOM(
					callOptions418,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "sendEmail")));
			addHeader(omElementcallOptions418, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.SendEmailResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultsendEmail((com.salesforce.soap.partner.SendEmailResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorsendEmail(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"sendEmail"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"sendEmail"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"sendEmail"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorsendEmail((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorsendEmail(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsendEmail(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsendEmail(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsendEmail(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsendEmail(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsendEmail(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsendEmail(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsendEmail(f);
									}
								} else {
									callback.receiveErrorsendEmail(f);
								}
							} else {
								callback.receiveErrorsendEmail(f);
							}
						} else {
							callback.receiveErrorsendEmail(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorsendEmail(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[11].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[11].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Search for sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#search
	 * @param search420
	 * 
	 * @param sessionHeader421
	 * 
	 * @param callOptions422
	 * 
	 * @param packageVersionHeader423
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.MalformedSearchFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.SearchResponse search(

			com.salesforce.soap.partner.Search search420,
			com.salesforce.soap.partner.SessionHeader sessionHeader421,
			com.salesforce.soap.partner.CallOptions callOptions422,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader423)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.MalformedSearchFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[12].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:searchRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), search420,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "search")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "search"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader421 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader421 = toOM(
						sessionHeader421,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "search")));
				addHeader(omElementsessionHeader421, env);

			}

			// add the children only if the parameter is not null
			if (callOptions422 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions422 = toOM(
						callOptions422,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "search")));
				addHeader(omElementcallOptions422, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader423 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader423 = toOM(
						packageVersionHeader423,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "search")));
				addHeader(omElementpackageVersionHeader423, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.SearchResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.SearchResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "search"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "search"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "search"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.MalformedSearchFault) {
							throw (com.salesforce.soap.partner.MalformedSearchFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Search for
	 * sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startsearch
	 * @param search420
	 * 
	 * @param sessionHeader421
	 * 
	 * @param callOptions422
	 * 
	 * @param packageVersionHeader423
	 */
	public void startsearch(

			com.salesforce.soap.partner.Search search420,
			com.salesforce.soap.partner.SessionHeader sessionHeader421,
			com.salesforce.soap.partner.CallOptions callOptions422,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader423,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[12].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:searchRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), search420,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "search")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"search"));

		// add the soap_headers only if they are not null
		if (sessionHeader421 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader421 = toOM(
					sessionHeader421,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "search")));
			addHeader(omElementsessionHeader421, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions422 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions422 = toOM(
					callOptions422,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "search")));
			addHeader(omElementcallOptions422, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader423 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader423 = toOM(
					packageVersionHeader423,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "search")));
			addHeader(omElementpackageVersionHeader423, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.SearchResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultsearch((com.salesforce.soap.partner.SearchResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorsearch(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "search"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"search"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"search"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorsearch((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.MalformedSearchFault) {
											callback.receiveErrorsearch((com.salesforce.soap.partner.MalformedSearchFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorsearch((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorsearch((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorsearch(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsearch(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsearch(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsearch(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsearch(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsearch(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsearch(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorsearch(f);
									}
								} else {
									callback.receiveErrorsearch(f);
								}
							} else {
								callback.receiveErrorsearch(f);
							}
						} else {
							callback.receiveErrorsearch(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorsearch(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[12].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[12].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Create a Query Cursor
	 * 
	 * @see com.salesforce.soap.partner.SforceService#query
	 * @param query425
	 * 
	 * @param sessionHeader426
	 * 
	 * @param callOptions427
	 * 
	 * @param queryOptions428
	 * 
	 * @param mruHeader429
	 * 
	 * @param packageVersionHeader430
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.MalformedQueryFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidQueryLocatorFault
	 *             :
	 */

	public com.salesforce.soap.partner.QueryResponse query(

			com.salesforce.soap.partner.Query query425,
			com.salesforce.soap.partner.SessionHeader sessionHeader426,
			com.salesforce.soap.partner.CallOptions callOptions427,
			com.salesforce.soap.partner.QueryOptions queryOptions428,
			com.salesforce.soap.partner.MruHeader mruHeader429,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader430)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.MalformedQueryFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault,
			com.salesforce.soap.partner.InvalidQueryLocatorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[13].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:queryRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), query425,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "query")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "query"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader426 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader426 = toOM(
						sessionHeader426,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "query")));
				addHeader(omElementsessionHeader426, env);

			}

			// add the children only if the parameter is not null
			if (callOptions427 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions427 = toOM(
						callOptions427,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "query")));
				addHeader(omElementcallOptions427, env);

			}

			// add the children only if the parameter is not null
			if (queryOptions428 != null) {

				org.apache.axiom.om.OMElement omElementqueryOptions428 = toOM(
						queryOptions428,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "query")));
				addHeader(omElementqueryOptions428, env);

			}

			// add the children only if the parameter is not null
			if (mruHeader429 != null) {

				org.apache.axiom.om.OMElement omElementmruHeader429 = toOM(
						mruHeader429,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "query")));
				addHeader(omElementmruHeader429, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader430 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader430 = toOM(
						packageVersionHeader430,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "query")));
				addHeader(omElementpackageVersionHeader430, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.QueryResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.QueryResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "query"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "query"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "query"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
							throw (com.salesforce.soap.partner.MalformedQueryFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidQueryLocatorFault) {
							throw (com.salesforce.soap.partner.InvalidQueryLocatorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Create a
	 * Query Cursor
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startquery
	 * @param query425
	 * 
	 * @param sessionHeader426
	 * 
	 * @param callOptions427
	 * 
	 * @param queryOptions428
	 * 
	 * @param mruHeader429
	 * 
	 * @param packageVersionHeader430
	 */
	public void startquery(

			com.salesforce.soap.partner.Query query425,
			com.salesforce.soap.partner.SessionHeader sessionHeader426,
			com.salesforce.soap.partner.CallOptions callOptions427,
			com.salesforce.soap.partner.QueryOptions queryOptions428,
			com.salesforce.soap.partner.MruHeader mruHeader429,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader430,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[13].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:queryRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), query425,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "query")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"query"));

		// add the soap_headers only if they are not null
		if (sessionHeader426 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader426 = toOM(
					sessionHeader426,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "query")));
			addHeader(omElementsessionHeader426, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions427 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions427 = toOM(
					callOptions427,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "query")));
			addHeader(omElementcallOptions427, env);

		}

		// add the soap_headers only if they are not null
		if (queryOptions428 != null) {

			org.apache.axiom.om.OMElement omElementqueryOptions428 = toOM(
					queryOptions428,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "query")));
			addHeader(omElementqueryOptions428, env);

		}

		// add the soap_headers only if they are not null
		if (mruHeader429 != null) {

			org.apache.axiom.om.OMElement omElementmruHeader429 = toOM(
					mruHeader429,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "query")));
			addHeader(omElementmruHeader429, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader430 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader430 = toOM(
					packageVersionHeader430,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "query")));
			addHeader(omElementpackageVersionHeader430, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.QueryResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultquery((com.salesforce.soap.partner.QueryResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorquery(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "query"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"query"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"query"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorquery((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
											callback.receiveErrorquery((com.salesforce.soap.partner.MalformedQueryFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorquery((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorquery((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorquery((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidQueryLocatorFault) {
											callback.receiveErrorquery((com.salesforce.soap.partner.InvalidQueryLocatorFault) ex);
											return;
										}

										callback.receiveErrorquery(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorquery(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorquery(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorquery(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorquery(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorquery(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorquery(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorquery(f);
									}
								} else {
									callback.receiveErrorquery(f);
								}
							} else {
								callback.receiveErrorquery(f);
							}
						} else {
							callback.receiveErrorquery(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorquery(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[13].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[13].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Get the IDs for deleted sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#getDeleted
	 * @param getDeleted432
	 * 
	 * @param sessionHeader433
	 * 
	 * @param callOptions434
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.GetDeletedResponse getDeleted(

	com.salesforce.soap.partner.GetDeleted getDeleted432,
			com.salesforce.soap.partner.SessionHeader sessionHeader433,
			com.salesforce.soap.partner.CallOptions callOptions434)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[14].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:getDeletedRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getDeleted432,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getDeleted")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getDeleted"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader433 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader433 = toOM(
						sessionHeader433,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "getDeleted")));
				addHeader(omElementsessionHeader433, env);

			}

			// add the children only if the parameter is not null
			if (callOptions434 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions434 = toOM(
						callOptions434,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "getDeleted")));
				addHeader(omElementcallOptions434, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.GetDeletedResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.GetDeletedResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "getDeleted"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "getDeleted"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "getDeleted"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Get the IDs
	 * for deleted sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startgetDeleted
	 * @param getDeleted432
	 * 
	 * @param sessionHeader433
	 * 
	 * @param callOptions434
	 */
	public void startgetDeleted(

			com.salesforce.soap.partner.GetDeleted getDeleted432,
			com.salesforce.soap.partner.SessionHeader sessionHeader433,
			com.salesforce.soap.partner.CallOptions callOptions434,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[14].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:getDeletedRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getDeleted432,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "getDeleted")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"getDeleted"));

		// add the soap_headers only if they are not null
		if (sessionHeader433 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader433 = toOM(
					sessionHeader433,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getDeleted")));
			addHeader(omElementsessionHeader433, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions434 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions434 = toOM(
					callOptions434,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getDeleted")));
			addHeader(omElementcallOptions434, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.GetDeletedResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultgetDeleted((com.salesforce.soap.partner.GetDeletedResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorgetDeleted(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"getDeleted"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getDeleted"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getDeleted"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorgetDeleted((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorgetDeleted((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorgetDeleted(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetDeleted(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetDeleted(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetDeleted(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetDeleted(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetDeleted(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetDeleted(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetDeleted(f);
									}
								} else {
									callback.receiveErrorgetDeleted(f);
								}
							} else {
								callback.receiveErrorgetDeleted(f);
							}
						} else {
							callback.receiveErrorgetDeleted(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorgetDeleted(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[14].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[14].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Submit an entity to a workflow process or
	 * process a workitem
	 * 
	 * @see com.salesforce.soap.partner.SforceService#process
	 * @param process436
	 * 
	 * @param sessionHeader437
	 * 
	 * @param callOptions438
	 * 
	 * @param allowFieldTruncationHeader439
	 * 
	 * @param disableFeedTrackingHeader440
	 * 
	 * @param streamingEnabledHeader441
	 * 
	 * @param debuggingHeader442
	 * 
	 * @param packageVersionHeader443
	 * 
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.ProcessResponse process(

			com.salesforce.soap.partner.Process process436,
			com.salesforce.soap.partner.SessionHeader sessionHeader437,
			com.salesforce.soap.partner.CallOptions callOptions438,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader439,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader440,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader441,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader442,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader443)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[15].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:processRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), process436,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader437 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader437 = toOM(
						sessionHeader437,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "process")));
				addHeader(omElementsessionHeader437, env);

			}

			// add the children only if the parameter is not null
			if (callOptions438 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions438 = toOM(
						callOptions438,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "process")));
				addHeader(omElementcallOptions438, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader439 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader439 = toOM(
						allowFieldTruncationHeader439,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "process")));
				addHeader(omElementallowFieldTruncationHeader439, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader440 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader440 = toOM(
						disableFeedTrackingHeader440,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "process")));
				addHeader(omElementdisableFeedTrackingHeader440, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader441 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader441 = toOM(
						streamingEnabledHeader441,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "process")));
				addHeader(omElementstreamingEnabledHeader441, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader442 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader442 = toOM(
						debuggingHeader442,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "process")));
				addHeader(omElementdebuggingHeader442, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader443 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader443 = toOM(
						packageVersionHeader443,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "process")));
				addHeader(omElementpackageVersionHeader443, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.ProcessResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.ProcessResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "process"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "process"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "process"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Submit an
	 * entity to a workflow process or process a workitem
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startprocess
	 * @param process436
	 * 
	 * @param sessionHeader437
	 * 
	 * @param callOptions438
	 * 
	 * @param allowFieldTruncationHeader439
	 * 
	 * @param disableFeedTrackingHeader440
	 * 
	 * @param streamingEnabledHeader441
	 * 
	 * @param debuggingHeader442
	 * 
	 * @param packageVersionHeader443
	 */
	public void startprocess(

			com.salesforce.soap.partner.Process process436,
			com.salesforce.soap.partner.SessionHeader sessionHeader437,
			com.salesforce.soap.partner.CallOptions callOptions438,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader439,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader440,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader441,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader442,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader443,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[15].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:processRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), process436,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "process")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"process"));

		// add the soap_headers only if they are not null
		if (sessionHeader437 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader437 = toOM(
					sessionHeader437,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")));
			addHeader(omElementsessionHeader437, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions438 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions438 = toOM(
					callOptions438,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")));
			addHeader(omElementcallOptions438, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader439 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader439 = toOM(
					allowFieldTruncationHeader439,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")));
			addHeader(omElementallowFieldTruncationHeader439, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader440 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader440 = toOM(
					disableFeedTrackingHeader440,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")));
			addHeader(omElementdisableFeedTrackingHeader440, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader441 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader441 = toOM(
					streamingEnabledHeader441,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")));
			addHeader(omElementstreamingEnabledHeader441, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader442 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader442 = toOM(
					debuggingHeader442,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")));
			addHeader(omElementdebuggingHeader442, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader443 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader443 = toOM(
					packageVersionHeader443,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "process")));
			addHeader(omElementpackageVersionHeader443, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.ProcessResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultprocess((com.salesforce.soap.partner.ProcessResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorprocess(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "process"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"process"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"process"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorprocess((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorprocess((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorprocess(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorprocess(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorprocess(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorprocess(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorprocess(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorprocess(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorprocess(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorprocess(f);
									}
								} else {
									callback.receiveErrorprocess(f);
								}
							} else {
								callback.receiveErrorprocess(f);
							}
						} else {
							callback.receiveErrorprocess(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorprocess(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[15].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[15].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe the data category group
	 * structures for a given set of pair of types and data category group name
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeDataCategoryGroupStructures
	 * @param describeDataCategoryGroupStructures445
	 * 
	 * @param sessionHeader446
	 * 
	 * @param callOptions447
	 * 
	 * @param packageVersionHeader448
	 * 
	 * @param localeOptions244
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse describeDataCategoryGroupStructures(

			com.salesforce.soap.partner.DescribeDataCategoryGroupStructures describeDataCategoryGroupStructures445,
			com.salesforce.soap.partner.SessionHeader sessionHeader446,
			com.salesforce.soap.partner.CallOptions callOptions447,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader448,
			com.salesforce.soap.partner.LocaleOptions localeOptions244)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[16].getName());
			_operationClient
					.getOptions()
					.setAction(
							"urn:partner.soap.sforce.com:Soap:describeDataCategoryGroupStructuresRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()),
					describeDataCategoryGroupStructures445,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroupStructures")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroupStructures"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader446 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader446 = toOM(
						sessionHeader446,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroupStructures")));
				addHeader(omElementsessionHeader446, env);

			}

			// add the children only if the parameter is not null
			if (callOptions447 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions447 = toOM(
						callOptions447,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroupStructures")));
				addHeader(omElementcallOptions447, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader448 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader448 = toOM(
						packageVersionHeader448,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroupStructures")));
				addHeader(omElementpackageVersionHeader448, env);

			}

			// add the children only if the parameter is not null
			if (localeOptions244 != null) {

				org.apache.axiom.om.OMElement omElementlocaleOptions244 = toOM(
						localeOptions244,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroupStructures")));
				addHeader(omElementlocaleOptions244, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(),
								"describeDataCategoryGroupStructures"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"describeDataCategoryGroupStructures"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"describeDataCategoryGroupStructures"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe the
	 * data category group structures for a given set of pair of types and data
	 * category group name
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeDataCategoryGroupStructures
	 * @param describeDataCategoryGroupStructures445
	 * 
	 * @param sessionHeader446
	 * 
	 * @param callOptions447
	 * 
	 * @param packageVersionHeader448
	 * 
	 * @param localeOptions244
	 */
	public void startdescribeDataCategoryGroupStructures(

			com.salesforce.soap.partner.DescribeDataCategoryGroupStructures describeDataCategoryGroupStructures445,
			com.salesforce.soap.partner.SessionHeader sessionHeader446,
			com.salesforce.soap.partner.CallOptions callOptions447,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader448,
			com.salesforce.soap.partner.LocaleOptions localeOptions244,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[16].getName());
		_operationClient
				.getOptions()
				.setAction(
						"urn:partner.soap.sforce.com:Soap:describeDataCategoryGroupStructuresRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeDataCategoryGroupStructures445,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com",
						"describeDataCategoryGroupStructures")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeDataCategoryGroupStructures"));

		// add the soap_headers only if they are not null
		if (sessionHeader446 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader446 = toOM(
					sessionHeader446,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroupStructures")));
			addHeader(omElementsessionHeader446, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions447 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions447 = toOM(
					callOptions447,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroupStructures")));
			addHeader(omElementcallOptions447, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader448 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader448 = toOM(
					packageVersionHeader448,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroupStructures")));
			addHeader(omElementpackageVersionHeader448, env);

		}

		// add the soap_headers only if they are not null
		if (localeOptions244 != null) {

			org.apache.axiom.om.OMElement omElementlocaleOptions244 = toOM(
					localeOptions244,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroupStructures")));
			addHeader(omElementlocaleOptions244, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeDataCategoryGroupStructures((com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeDataCategoryGroupStructures(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeDataCategoryGroupStructures"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeDataCategoryGroupStructures"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeDataCategoryGroupStructures"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrordescribeDataCategoryGroupStructures((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeDataCategoryGroupStructures((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeDataCategoryGroupStructures(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroupStructures(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroupStructures(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroupStructures(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroupStructures(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroupStructures(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroupStructures(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroupStructures(f);
									}
								} else {
									callback.receiveErrordescribeDataCategoryGroupStructures(f);
								}
							} else {
								callback.receiveErrordescribeDataCategoryGroupStructures(f);
							}
						} else {
							callback.receiveErrordescribeDataCategoryGroupStructures(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeDataCategoryGroupStructures(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[16].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[16].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Reset a user's password
	 * 
	 * @see com.salesforce.soap.partner.SforceService#resetPassword
	 * @param resetPassword450
	 * 
	 * @param sessionHeader451
	 * 
	 * @param callOptions452
	 * 
	 * @param emailHeader453
	 * 
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.ResetPasswordResponse resetPassword(

	com.salesforce.soap.partner.ResetPassword resetPassword450,
			com.salesforce.soap.partner.SessionHeader sessionHeader451,
			com.salesforce.soap.partner.CallOptions callOptions452,
			com.salesforce.soap.partner.EmailHeader emailHeader453)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[17].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:resetPasswordRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), resetPassword450,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "resetPassword")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "resetPassword"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader451 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader451 = toOM(
						sessionHeader451,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "resetPassword")));
				addHeader(omElementsessionHeader451, env);

			}

			// add the children only if the parameter is not null
			if (callOptions452 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions452 = toOM(
						callOptions452,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "resetPassword")));
				addHeader(omElementcallOptions452, env);

			}

			// add the children only if the parameter is not null
			if (emailHeader453 != null) {

				org.apache.axiom.om.OMElement omElementemailHeader453 = toOM(
						emailHeader453,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "resetPassword")));
				addHeader(omElementemailHeader453, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.ResetPasswordResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.ResetPasswordResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "resetPassword"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "resetPassword"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "resetPassword"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Reset a
	 * user's password
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startresetPassword
	 * @param resetPassword450
	 * 
	 * @param sessionHeader451
	 * 
	 * @param callOptions452
	 * 
	 * @param emailHeader453
	 */
	public void startresetPassword(

			com.salesforce.soap.partner.ResetPassword resetPassword450,
			com.salesforce.soap.partner.SessionHeader sessionHeader451,
			com.salesforce.soap.partner.CallOptions callOptions452,
			com.salesforce.soap.partner.EmailHeader emailHeader453,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[17].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:resetPasswordRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), resetPassword450,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "resetPassword")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"resetPassword"));

		// add the soap_headers only if they are not null
		if (sessionHeader451 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader451 = toOM(
					sessionHeader451,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "resetPassword")));
			addHeader(omElementsessionHeader451, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions452 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions452 = toOM(
					callOptions452,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "resetPassword")));
			addHeader(omElementcallOptions452, env);

		}

		// add the soap_headers only if they are not null
		if (emailHeader453 != null) {

			org.apache.axiom.om.OMElement omElementemailHeader453 = toOM(
					emailHeader453,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "resetPassword")));
			addHeader(omElementemailHeader453, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.ResetPasswordResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultresetPassword((com.salesforce.soap.partner.ResetPasswordResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorresetPassword(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"resetPassword"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"resetPassword"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"resetPassword"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorresetPassword((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorresetPassword((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorresetPassword(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorresetPassword(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorresetPassword(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorresetPassword(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorresetPassword(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorresetPassword(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorresetPassword(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorresetPassword(f);
									}
								} else {
									callback.receiveErrorresetPassword(f);
								}
							} else {
								callback.receiveErrorresetPassword(f);
							}
						} else {
							callback.receiveErrorresetPassword(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorresetPassword(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[17].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[17].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe the Global state
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeGlobal
	 * @param describeGlobal455
	 * 
	 * @param sessionHeader456
	 * 
	 * @param callOptions457
	 * 
	 * @param packageVersionHeader458
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeGlobalResponse describeGlobal(

			com.salesforce.soap.partner.DescribeGlobal describeGlobal455,
			com.salesforce.soap.partner.SessionHeader sessionHeader456,
			com.salesforce.soap.partner.CallOptions callOptions457,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader458)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[18].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:describeGlobalRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);
			{
    			/*- ADD - START - BY cmeng - 20140901*/
    			/**
    			 * https://jira.talendforge.org/browse/TDI-30366<br>
    			 * 1. Because this API seems not support this case: server use HTTP Protocol 1.0(not support CHUNKED) while client use HTTP Protocol 1.1<br>
    			 * , then client will throw exception(org.apache.axis2.AxisFault: Transport error: 411 Error: Length Required)<br>
    			 * 2. If the new API can support this case, then this additional codes can be cancelled.
    			 * 
    			 * Some information I searched on the net:<br>
    			 * https://www.mail-archive.com/basedb-devel@lists.sourceforge.net/msg00309.html
    			 * http://axis.apache.org/axis2/java/core/docs/http-transport.html
    			 * http://en.wikipedia.org/wiki/Chunked_transfer_encoding
    			 */
    			_operationClient.getOptions().setProperty(
    			        org.apache.axis2.transport.http.HTTPConstants.CHUNKED, "false");
    			/*- ADD - END - BY cmeng* - 20140901*/
			}

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), describeGlobal455,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeGlobal")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeGlobal"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader456 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader456 = toOM(
						sessionHeader456,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeGlobal")));
				addHeader(omElementsessionHeader456, env);

			}

			// add the children only if the parameter is not null
			if (callOptions457 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions457 = toOM(
						callOptions457,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeGlobal")));
				addHeader(omElementcallOptions457, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader458 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader458 = toOM(
						packageVersionHeader458,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeGlobal")));
				addHeader(omElementpackageVersionHeader458, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.DescribeGlobalResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeGlobalResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "describeGlobal"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeGlobal"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeGlobal"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe the
	 * Global state
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeGlobal
	 * @param describeGlobal455
	 * 
	 * @param sessionHeader456
	 * 
	 * @param callOptions457
	 * 
	 * @param packageVersionHeader458
	 */
	public void startdescribeGlobal(

			com.salesforce.soap.partner.DescribeGlobal describeGlobal455,
			com.salesforce.soap.partner.SessionHeader sessionHeader456,
			com.salesforce.soap.partner.CallOptions callOptions457,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader458,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[18].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:describeGlobalRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeGlobal455,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "describeGlobal")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeGlobal"));

		// add the soap_headers only if they are not null
		if (sessionHeader456 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader456 = toOM(
					sessionHeader456,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeGlobal")));
			addHeader(omElementsessionHeader456, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions457 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions457 = toOM(
					callOptions457,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeGlobal")));
			addHeader(omElementcallOptions457, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader458 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader458 = toOM(
					packageVersionHeader458,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeGlobal")));
			addHeader(omElementpackageVersionHeader458, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeGlobalResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeGlobal((com.salesforce.soap.partner.DescribeGlobalResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeGlobal(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeGlobal"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeGlobal"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeGlobal"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeGlobal((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeGlobal(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeGlobal(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeGlobal(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeGlobal(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeGlobal(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeGlobal(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeGlobal(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeGlobal(f);
									}
								} else {
									callback.receiveErrordescribeGlobal(f);
								}
							} else {
								callback.receiveErrordescribeGlobal(f);
							}
						} else {
							callback.receiveErrordescribeGlobal(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeGlobal(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[18].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[18].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe the layout of an sObject
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeLayout
	 * @param describeLayout460
	 * 
	 * @param sessionHeader461
	 * 
	 * @param callOptions462
	 * 
	 * @param packageVersionHeader463
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeLayoutResponse describeLayout(

			com.salesforce.soap.partner.DescribeLayoutE describeLayout460,
			com.salesforce.soap.partner.SessionHeader sessionHeader461,
			com.salesforce.soap.partner.CallOptions callOptions462,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader463)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[19].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:describeLayoutRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), describeLayout460,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeLayout")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeLayout"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader461 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader461 = toOM(
						sessionHeader461,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeLayout")));
				addHeader(omElementsessionHeader461, env);

			}

			// add the children only if the parameter is not null
			if (callOptions462 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions462 = toOM(
						callOptions462,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeLayout")));
				addHeader(omElementcallOptions462, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader463 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader463 = toOM(
						packageVersionHeader463,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeLayout")));
				addHeader(omElementpackageVersionHeader463, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.DescribeLayoutResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeLayoutResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "describeLayout"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeLayout"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeLayout"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe the
	 * layout of an sObject
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeLayout
	 * @param describeLayout460
	 * 
	 * @param sessionHeader461
	 * 
	 * @param callOptions462
	 * 
	 * @param packageVersionHeader463
	 */
	public void startdescribeLayout(

			com.salesforce.soap.partner.DescribeLayoutE describeLayout460,
			com.salesforce.soap.partner.SessionHeader sessionHeader461,
			com.salesforce.soap.partner.CallOptions callOptions462,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader463,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[19].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:describeLayoutRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeLayout460,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "describeLayout")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeLayout"));

		// add the soap_headers only if they are not null
		if (sessionHeader461 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader461 = toOM(
					sessionHeader461,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeLayout")));
			addHeader(omElementsessionHeader461, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions462 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions462 = toOM(
					callOptions462,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeLayout")));
			addHeader(omElementcallOptions462, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader463 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader463 = toOM(
					packageVersionHeader463,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeLayout")));
			addHeader(omElementpackageVersionHeader463, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeLayoutResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeLayout((com.salesforce.soap.partner.DescribeLayoutResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeLayout(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeLayout"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeLayout"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeLayout"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrordescribeLayout((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrordescribeLayout((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeLayout((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeLayout(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeLayout(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeLayout(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeLayout(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeLayout(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeLayout(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeLayout(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeLayout(f);
									}
								} else {
									callback.receiveErrordescribeLayout(f);
								}
							} else {
								callback.receiveErrordescribeLayout(f);
							}
						} else {
							callback.receiveErrordescribeLayout(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeLayout(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[19].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[19].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe the tabs that appear on a users
	 * page
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeTabs
	 * @param describeTabs465
	 * 
	 * @param sessionHeader466
	 * 
	 * @param callOptions467
	 * 
	 * @param packageVersionHeader468
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeTabsResponse describeTabs(

			com.salesforce.soap.partner.DescribeTabs describeTabs465,
			com.salesforce.soap.partner.SessionHeader sessionHeader466,
			com.salesforce.soap.partner.CallOptions callOptions467,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader468)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[20].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:describeTabsRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), describeTabs465,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeTabs")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeTabs"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader466 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader466 = toOM(
						sessionHeader466,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeTabs")));
				addHeader(omElementsessionHeader466, env);

			}

			// add the children only if the parameter is not null
			if (callOptions467 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions467 = toOM(
						callOptions467,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeTabs")));
				addHeader(omElementcallOptions467, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader468 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader468 = toOM(
						packageVersionHeader468,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "describeTabs")));
				addHeader(omElementpackageVersionHeader468, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.DescribeTabsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeTabsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "describeTabs"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeTabs"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeTabs"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe the
	 * tabs that appear on a users page
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeTabs
	 * @param describeTabs465
	 * 
	 * @param sessionHeader466
	 * 
	 * @param callOptions467
	 * 
	 * @param packageVersionHeader468
	 */
	public void startdescribeTabs(

			com.salesforce.soap.partner.DescribeTabs describeTabs465,
			com.salesforce.soap.partner.SessionHeader sessionHeader466,
			com.salesforce.soap.partner.CallOptions callOptions467,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader468,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[20].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:describeTabsRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeTabs465,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "describeTabs")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeTabs"));

		// add the soap_headers only if they are not null
		if (sessionHeader466 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader466 = toOM(
					sessionHeader466,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeTabs")));
			addHeader(omElementsessionHeader466, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions467 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions467 = toOM(
					callOptions467,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeTabs")));
			addHeader(omElementcallOptions467, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader468 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader468 = toOM(
					packageVersionHeader468,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeTabs")));
			addHeader(omElementpackageVersionHeader468, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeTabsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeTabs((com.salesforce.soap.partner.DescribeTabsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeTabs(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeTabs"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeTabs"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeTabs"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeTabs((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeTabs(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeTabs(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeTabs(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeTabs(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeTabs(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeTabs(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeTabs(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeTabs(f);
									}
								} else {
									callback.receiveErrordescribeTabs(f);
								}
							} else {
								callback.receiveErrordescribeTabs(f);
							}
						} else {
							callback.receiveErrordescribeTabs(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeTabs(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[20].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[20].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe all the data category groups
	 * available for a given set of types
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeDataCategoryGroups
	 * @param describeDataCategoryGroups470
	 * 
	 * @param sessionHeader471
	 * 
	 * @param callOptions472
	 * 
	 * @param packageVersionHeader473
	 * 
	 * @param localeOptions270
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse describeDataCategoryGroups(

			com.salesforce.soap.partner.DescribeDataCategoryGroups describeDataCategoryGroups470,
			com.salesforce.soap.partner.SessionHeader sessionHeader471,
			com.salesforce.soap.partner.CallOptions callOptions472,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader473,
			com.salesforce.soap.partner.LocaleOptions localeOptions270)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[21].getName());
			_operationClient
					.getOptions()
					.setAction(
							"urn:partner.soap.sforce.com:Soap:describeDataCategoryGroupsRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), describeDataCategoryGroups470,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroups")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroups"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader471 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader471 = toOM(
						sessionHeader471,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroups")));
				addHeader(omElementsessionHeader471, env);

			}

			// add the children only if the parameter is not null
			if (callOptions472 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions472 = toOM(
						callOptions472,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroups")));
				addHeader(omElementcallOptions472, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader473 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader473 = toOM(
						packageVersionHeader473,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroups")));
				addHeader(omElementpackageVersionHeader473, env);

			}

			// add the children only if the parameter is not null
			if (localeOptions270 != null) {

				org.apache.axiom.om.OMElement omElementlocaleOptions270 = toOM(
						localeOptions270,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeDataCategoryGroups")));
				addHeader(omElementlocaleOptions270, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(),
								"describeDataCategoryGroups"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"describeDataCategoryGroups"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"describeDataCategoryGroups"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe all
	 * the data category groups available for a given set of types
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeDataCategoryGroups
	 * @param describeDataCategoryGroups470
	 * 
	 * @param sessionHeader471
	 * 
	 * @param callOptions472
	 * 
	 * @param packageVersionHeader473
	 * 
	 * @param localeOptions270
	 */
	public void startdescribeDataCategoryGroups(

			com.salesforce.soap.partner.DescribeDataCategoryGroups describeDataCategoryGroups470,
			com.salesforce.soap.partner.SessionHeader sessionHeader471,
			com.salesforce.soap.partner.CallOptions callOptions472,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader473,
			com.salesforce.soap.partner.LocaleOptions localeOptions270,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[21].getName());
		_operationClient
				.getOptions()
				.setAction(
						"urn:partner.soap.sforce.com:Soap:describeDataCategoryGroupsRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeDataCategoryGroups470,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com",
						"describeDataCategoryGroups")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeDataCategoryGroups"));

		// add the soap_headers only if they are not null
		if (sessionHeader471 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader471 = toOM(
					sessionHeader471,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroups")));
			addHeader(omElementsessionHeader471, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions472 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions472 = toOM(
					callOptions472,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroups")));
			addHeader(omElementcallOptions472, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader473 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader473 = toOM(
					packageVersionHeader473,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroups")));
			addHeader(omElementpackageVersionHeader473, env);

		}

		// add the soap_headers only if they are not null
		if (localeOptions270 != null) {

			org.apache.axiom.om.OMElement omElementlocaleOptions270 = toOM(
					localeOptions270,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com",
							"describeDataCategoryGroups")));
			addHeader(omElementlocaleOptions270, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeDataCategoryGroups((com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeDataCategoryGroups(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeDataCategoryGroups"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeDataCategoryGroups"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeDataCategoryGroups"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrordescribeDataCategoryGroups((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeDataCategoryGroups((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeDataCategoryGroups(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroups(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroups(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroups(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroups(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroups(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroups(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeDataCategoryGroups(f);
									}
								} else {
									callback.receiveErrordescribeDataCategoryGroups(f);
								}
							} else {
								callback.receiveErrordescribeDataCategoryGroups(f);
							}
						} else {
							callback.receiveErrordescribeDataCategoryGroups(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeDataCategoryGroups(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[21].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[21].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Gets server timestamp
	 * 
	 * @see com.salesforce.soap.partner.SforceService#getServerTimestamp
	 * @param getServerTimestamp475
	 * 
	 * @param sessionHeader476
	 * 
	 * @param callOptions477
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.GetServerTimestampResponse getServerTimestamp(

	com.salesforce.soap.partner.GetServerTimestamp getServerTimestamp475,
			com.salesforce.soap.partner.SessionHeader sessionHeader476,
			com.salesforce.soap.partner.CallOptions callOptions477)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[22].getName());
			_operationClient
					.getOptions()
					.setAction(
							"urn:partner.soap.sforce.com:Soap:getServerTimestampRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(
					getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getServerTimestamp475,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getServerTimestamp")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getServerTimestamp"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader476 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader476 = toOM(
						sessionHeader476,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"getServerTimestamp")));
				addHeader(omElementsessionHeader476, env);

			}

			// add the children only if the parameter is not null
			if (callOptions477 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions477 = toOM(
						callOptions477,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"getServerTimestamp")));
				addHeader(omElementcallOptions477, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.salesforce.soap.partner.GetServerTimestampResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.GetServerTimestampResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "getServerTimestamp"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"getServerTimestamp"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"getServerTimestamp"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Gets server
	 * timestamp
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startgetServerTimestamp
	 * @param getServerTimestamp475
	 * 
	 * @param sessionHeader476
	 * 
	 * @param callOptions477
	 */
	public void startgetServerTimestamp(

			com.salesforce.soap.partner.GetServerTimestamp getServerTimestamp475,
			com.salesforce.soap.partner.SessionHeader sessionHeader476,
			com.salesforce.soap.partner.CallOptions callOptions477,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[22].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:getServerTimestampRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getServerTimestamp475,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "getServerTimestamp")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"getServerTimestamp"));

		// add the soap_headers only if they are not null
		if (sessionHeader476 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader476 = toOM(
					sessionHeader476,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getServerTimestamp")));
			addHeader(omElementsessionHeader476, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions477 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions477 = toOM(
					callOptions477,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "getServerTimestamp")));
			addHeader(omElementcallOptions477, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.GetServerTimestampResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultgetServerTimestamp((com.salesforce.soap.partner.GetServerTimestampResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorgetServerTimestamp(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"getServerTimestamp"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getServerTimestamp"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"getServerTimestamp"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorgetServerTimestamp((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorgetServerTimestamp(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetServerTimestamp(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetServerTimestamp(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetServerTimestamp(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetServerTimestamp(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetServerTimestamp(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetServerTimestamp(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorgetServerTimestamp(f);
									}
								} else {
									callback.receiveErrorgetServerTimestamp(f);
								}
							} else {
								callback.receiveErrorgetServerTimestamp(f);
							}
						} else {
							callback.receiveErrorgetServerTimestamp(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorgetServerTimestamp(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[22].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[22].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Logs out and invalidates session ids
	 * 
	 * @see com.salesforce.soap.partner.SforceService#invalidateSessions
	 * @param invalidateSessions479
	 * 
	 * @param sessionHeader480
	 * 
	 * @param callOptions481
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.InvalidateSessionsResponse invalidateSessions(

	com.salesforce.soap.partner.InvalidateSessions invalidateSessions479,
			com.salesforce.soap.partner.SessionHeader sessionHeader480,
			com.salesforce.soap.partner.CallOptions callOptions481)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[23].getName());
			_operationClient
					.getOptions()
					.setAction(
							"urn:partner.soap.sforce.com:Soap:invalidateSessionsRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(
					getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					invalidateSessions479,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "invalidateSessions")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "invalidateSessions"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader480 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader480 = toOM(
						sessionHeader480,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"invalidateSessions")));
				addHeader(omElementsessionHeader480, env);

			}

			// add the children only if the parameter is not null
			if (callOptions481 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions481 = toOM(
						callOptions481,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"invalidateSessions")));
				addHeader(omElementcallOptions481, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.salesforce.soap.partner.InvalidateSessionsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.InvalidateSessionsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "invalidateSessions"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"invalidateSessions"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(),
										"invalidateSessions"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Logs out and
	 * invalidates session ids
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startinvalidateSessions
	 * @param invalidateSessions479
	 * 
	 * @param sessionHeader480
	 * 
	 * @param callOptions481
	 */
	public void startinvalidateSessions(

			com.salesforce.soap.partner.InvalidateSessions invalidateSessions479,
			com.salesforce.soap.partner.SessionHeader sessionHeader480,
			com.salesforce.soap.partner.CallOptions callOptions481,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[23].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:invalidateSessionsRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), invalidateSessions479,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "invalidateSessions")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"invalidateSessions"));

		// add the soap_headers only if they are not null
		if (sessionHeader480 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader480 = toOM(
					sessionHeader480,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "invalidateSessions")));
			addHeader(omElementsessionHeader480, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions481 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions481 = toOM(
					callOptions481,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "invalidateSessions")));
			addHeader(omElementcallOptions481, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.InvalidateSessionsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultinvalidateSessions((com.salesforce.soap.partner.InvalidateSessionsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorinvalidateSessions(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"invalidateSessions"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"invalidateSessions"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"invalidateSessions"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorinvalidateSessions((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorinvalidateSessions(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorinvalidateSessions(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorinvalidateSessions(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorinvalidateSessions(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorinvalidateSessions(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorinvalidateSessions(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorinvalidateSessions(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorinvalidateSessions(f);
									}
								} else {
									callback.receiveErrorinvalidateSessions(f);
								}
							} else {
								callback.receiveErrorinvalidateSessions(f);
							}
						} else {
							callback.receiveErrorinvalidateSessions(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorinvalidateSessions(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[23].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[23].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe an sObject
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeSObject
	 * @param describeSObject483
	 * 
	 * @param sessionHeader484
	 * 
	 * @param callOptions485
	 * 
	 * @param packageVersionHeader486
	 * 
	 * @param localeOptions487
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeSObjectResponse describeSObject(

			com.salesforce.soap.partner.DescribeSObject describeSObject483,
			com.salesforce.soap.partner.SessionHeader sessionHeader484,
			com.salesforce.soap.partner.CallOptions callOptions485,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader486,
			com.salesforce.soap.partner.LocaleOptions localeOptions487)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[24].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:describeSObjectRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);
			{
    			/*- ADD - START - BY cmeng - 20140901*/
                /**
                 * https://jira.talendforge.org/browse/TDI-30366<br>
                 * 1. Because this API seems not support this case: server use HTTP Protocol 1.0(not support CHUNKED) while client use HTTP Protocol 1.1<br>
                 * , then client will throw exception(org.apache.axis2.AxisFault: Transport error: 411 Error: Length Required)<br>
                 * 2. If the new API can support this case, then this additional codes can be cancelled.
                 * 
                 * Some information I searched on the net:<br>
                 * https://www.mail-archive.com/basedb-devel@lists.sourceforge.net/msg00309.html
                 * http://axis.apache.org/axis2/java/core/docs/http-transport.html
                 * http://en.wikipedia.org/wiki/Chunked_transfer_encoding
                 */
    			_operationClient.getOptions().setProperty(
    			        org.apache.axis2.transport.http.HTTPConstants.CHUNKED, "false");
    			/*- ADD - END - BY cmeng - 20140901*/
			}

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), describeSObject483,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObject")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObject"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader484 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader484 = toOM(
						sessionHeader484,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObject")));
				addHeader(omElementsessionHeader484, env);

			}

			// add the children only if the parameter is not null
			if (callOptions485 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions485 = toOM(
						callOptions485,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObject")));
				addHeader(omElementcallOptions485, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader486 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader486 = toOM(
						packageVersionHeader486,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObject")));
				addHeader(omElementpackageVersionHeader486, env);

			}

			// add the children only if the parameter is not null
			if (localeOptions487 != null) {

				org.apache.axiom.om.OMElement omElementlocaleOptions487 = toOM(
						localeOptions487,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObject")));
				addHeader(omElementlocaleOptions487, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.DescribeSObjectResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeSObjectResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "describeSObject"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeSObject"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeSObject"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe an
	 * sObject
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeSObject
	 * @param describeSObject483
	 * 
	 * @param sessionHeader484
	 * 
	 * @param callOptions485
	 * 
	 * @param packageVersionHeader486
	 * 
	 * @param localeOptions487
	 */
	public void startdescribeSObject(

			com.salesforce.soap.partner.DescribeSObject describeSObject483,
			com.salesforce.soap.partner.SessionHeader sessionHeader484,
			com.salesforce.soap.partner.CallOptions callOptions485,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader486,
			com.salesforce.soap.partner.LocaleOptions localeOptions487,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[24].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:describeSObjectRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeSObject483,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "describeSObject")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeSObject"));

		// add the soap_headers only if they are not null
		if (sessionHeader484 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader484 = toOM(
					sessionHeader484,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObject")));
			addHeader(omElementsessionHeader484, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions485 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions485 = toOM(
					callOptions485,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObject")));
			addHeader(omElementcallOptions485, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader486 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader486 = toOM(
					packageVersionHeader486,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObject")));
			addHeader(omElementpackageVersionHeader486, env);

		}

		// add the soap_headers only if they are not null
		if (localeOptions487 != null) {

			org.apache.axiom.om.OMElement omElementlocaleOptions487 = toOM(
					localeOptions487,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObject")));
			addHeader(omElementlocaleOptions487, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeSObjectResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeSObject((com.salesforce.soap.partner.DescribeSObjectResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeSObject(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeSObject"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeSObject"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeSObject"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrordescribeSObject((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeSObject((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeSObject(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObject(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObject(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObject(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObject(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObject(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObject(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObject(f);
									}
								} else {
									callback.receiveErrordescribeSObject(f);
								}
							} else {
								callback.receiveErrordescribeSObject(f);
							}
						} else {
							callback.receiveErrordescribeSObject(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeSObject(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[24].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[24].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Login to the Salesforce.com SOAP Api
	 * 
	 * @see com.salesforce.soap.partner.SforceService#login
	 * @param login489
	 * 
	 * @param loginScopeHeader490
	 * 
	 * @param callOptions491
	 * 
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 * @throws com.salesforce.soap.partner.LoginFault
	 *             :
	 */

	public com.salesforce.soap.partner.LoginResponse login(

	com.salesforce.soap.partner.Login login489,
			com.salesforce.soap.partner.LoginScopeHeader loginScopeHeader490,
			com.salesforce.soap.partner.CallOptions callOptions491)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.UnexpectedErrorFault,
			com.salesforce.soap.partner.LoginFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[25].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:loginRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), login489,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "login")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "login"));

			env.build();

			// add the children only if the parameter is not null
			if (loginScopeHeader490 != null) {

				org.apache.axiom.om.OMElement omElementloginScopeHeader490 = toOM(
						loginScopeHeader490,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "login")));
				addHeader(omElementloginScopeHeader490, env);

			}

			// add the children only if the parameter is not null
			if (callOptions491 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions491 = toOM(
						callOptions491,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "login")));
				addHeader(omElementcallOptions491, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.LoginResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.LoginResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "login"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "login"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "login"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.LoginFault) {
							throw (com.salesforce.soap.partner.LoginFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Login to the
	 * Salesforce.com SOAP Api
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startlogin
	 * @param login489
	 * 
	 * @param loginScopeHeader490
	 * 
	 * @param callOptions491
	 */
	public void startlogin(

			com.salesforce.soap.partner.Login login489,
			com.salesforce.soap.partner.LoginScopeHeader loginScopeHeader490,
			com.salesforce.soap.partner.CallOptions callOptions491,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[25].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:loginRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), login489,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "login")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"login"));

		// add the soap_headers only if they are not null
		if (loginScopeHeader490 != null) {

			org.apache.axiom.om.OMElement omElementloginScopeHeader490 = toOM(
					loginScopeHeader490,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "login")));
			addHeader(omElementloginScopeHeader490, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions491 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions491 = toOM(
					callOptions491,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "login")));
			addHeader(omElementcallOptions491, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.LoginResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultlogin((com.salesforce.soap.partner.LoginResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorlogin(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "login"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"login"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"login"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorlogin((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorlogin((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.LoginFault) {
											callback.receiveErrorlogin((com.salesforce.soap.partner.LoginFault) ex);
											return;
										}

										callback.receiveErrorlogin(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogin(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogin(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogin(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogin(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogin(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogin(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorlogin(f);
									}
								} else {
									callback.receiveErrorlogin(f);
								}
							} else {
								callback.receiveErrorlogin(f);
							}
						} else {
							callback.receiveErrorlogin(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorlogin(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[25].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[25].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Gets the next batch of sObjects from a
	 * query
	 * 
	 * @see com.salesforce.soap.partner.SforceService#queryMore
	 * @param queryMore493
	 * 
	 * @param sessionHeader494
	 * 
	 * @param callOptions495
	 * 
	 * @param queryOptions496
	 * 
	 * @throws com.salesforce.soap.partner.MalformedQueryFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidQueryLocatorFault
	 *             :
	 */

	public com.salesforce.soap.partner.QueryMoreResponse queryMore(

	com.salesforce.soap.partner.QueryMore queryMore493,
			com.salesforce.soap.partner.SessionHeader sessionHeader494,
			com.salesforce.soap.partner.CallOptions callOptions495,
			com.salesforce.soap.partner.QueryOptions queryOptions496)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.MalformedQueryFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault,
			com.salesforce.soap.partner.InvalidQueryLocatorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[26].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:queryMoreRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), queryMore493,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryMore")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryMore"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader494 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader494 = toOM(
						sessionHeader494,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "queryMore")));
				addHeader(omElementsessionHeader494, env);

			}

			// add the children only if the parameter is not null
			if (callOptions495 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions495 = toOM(
						callOptions495,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "queryMore")));
				addHeader(omElementcallOptions495, env);

			}

			// add the children only if the parameter is not null
			if (queryOptions496 != null) {

				org.apache.axiom.om.OMElement omElementqueryOptions496 = toOM(
						queryOptions496,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "queryMore")));
				addHeader(omElementqueryOptions496, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.QueryMoreResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.QueryMoreResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "queryMore"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "queryMore"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "queryMore"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
							throw (com.salesforce.soap.partner.MalformedQueryFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidQueryLocatorFault) {
							throw (com.salesforce.soap.partner.InvalidQueryLocatorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Gets the
	 * next batch of sObjects from a query
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startqueryMore
	 * @param queryMore493
	 * 
	 * @param sessionHeader494
	 * 
	 * @param callOptions495
	 * 
	 * @param queryOptions496
	 */
	public void startqueryMore(

			com.salesforce.soap.partner.QueryMore queryMore493,
			com.salesforce.soap.partner.SessionHeader sessionHeader494,
			com.salesforce.soap.partner.CallOptions callOptions495,
			com.salesforce.soap.partner.QueryOptions queryOptions496,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[26].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:queryMoreRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), queryMore493,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "queryMore")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"queryMore"));

		// add the soap_headers only if they are not null
		if (sessionHeader494 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader494 = toOM(
					sessionHeader494,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryMore")));
			addHeader(omElementsessionHeader494, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions495 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions495 = toOM(
					callOptions495,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryMore")));
			addHeader(omElementcallOptions495, env);

		}

		// add the soap_headers only if they are not null
		if (queryOptions496 != null) {

			org.apache.axiom.om.OMElement omElementqueryOptions496 = toOM(
					queryOptions496,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "queryMore")));
			addHeader(omElementqueryOptions496, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.QueryMoreResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultqueryMore((com.salesforce.soap.partner.QueryMoreResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorqueryMore(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"queryMore"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"queryMore"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"queryMore"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.MalformedQueryFault) {
											callback.receiveErrorqueryMore((com.salesforce.soap.partner.MalformedQueryFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorqueryMore((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorqueryMore((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidQueryLocatorFault) {
											callback.receiveErrorqueryMore((com.salesforce.soap.partner.InvalidQueryLocatorFault) ex);
											return;
										}

										callback.receiveErrorqueryMore(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryMore(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryMore(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryMore(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryMore(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryMore(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryMore(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorqueryMore(f);
									}
								} else {
									callback.receiveErrorqueryMore(f);
								}
							} else {
								callback.receiveErrorqueryMore(f);
							}
						} else {
							callback.receiveErrorqueryMore(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorqueryMore(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[26].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[26].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Describe a number sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#describeSObjects
	 * @param describeSObjects498
	 * 
	 * @param sessionHeader499
	 * 
	 * @param callOptions500
	 * 
	 * @param packageVersionHeader501
	 * 
	 * @param localeOptions502
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DescribeSObjectsResponse describeSObjects(

			com.salesforce.soap.partner.DescribeSObjects describeSObjects498,
			com.salesforce.soap.partner.SessionHeader sessionHeader499,
			com.salesforce.soap.partner.CallOptions callOptions500,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader501,
			com.salesforce.soap.partner.LocaleOptions localeOptions502)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[27].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:describeSObjectsRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(
					getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					describeSObjects498,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObjects")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObjects"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader499 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader499 = toOM(
						sessionHeader499,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObjects")));
				addHeader(omElementsessionHeader499, env);

			}

			// add the children only if the parameter is not null
			if (callOptions500 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions500 = toOM(
						callOptions500,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObjects")));
				addHeader(omElementcallOptions500, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader501 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader501 = toOM(
						packageVersionHeader501,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObjects")));
				addHeader(omElementpackageVersionHeader501, env);

			}

			// add the children only if the parameter is not null
			if (localeOptions502 != null) {

				org.apache.axiom.om.OMElement omElementlocaleOptions502 = toOM(
						localeOptions502,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"describeSObjects")));
				addHeader(omElementlocaleOptions502, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.DescribeSObjectsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DescribeSObjectsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "describeSObjects"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeSObjects"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "describeSObjects"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Describe a
	 * number sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdescribeSObjects
	 * @param describeSObjects498
	 * 
	 * @param sessionHeader499
	 * 
	 * @param callOptions500
	 * 
	 * @param packageVersionHeader501
	 * 
	 * @param localeOptions502
	 */
	public void startdescribeSObjects(

			com.salesforce.soap.partner.DescribeSObjects describeSObjects498,
			com.salesforce.soap.partner.SessionHeader sessionHeader499,
			com.salesforce.soap.partner.CallOptions callOptions500,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader501,
			com.salesforce.soap.partner.LocaleOptions localeOptions502,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[27].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:describeSObjectsRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), describeSObjects498,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "describeSObjects")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"describeSObjects"));

		// add the soap_headers only if they are not null
		if (sessionHeader499 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader499 = toOM(
					sessionHeader499,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObjects")));
			addHeader(omElementsessionHeader499, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions500 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions500 = toOM(
					callOptions500,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObjects")));
			addHeader(omElementcallOptions500, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader501 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader501 = toOM(
					packageVersionHeader501,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObjects")));
			addHeader(omElementpackageVersionHeader501, env);

		}

		// add the soap_headers only if they are not null
		if (localeOptions502 != null) {

			org.apache.axiom.om.OMElement omElementlocaleOptions502 = toOM(
					localeOptions502,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "describeSObjects")));
			addHeader(omElementlocaleOptions502, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DescribeSObjectsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdescribeSObjects((com.salesforce.soap.partner.DescribeSObjectsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordescribeSObjects(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"describeSObjects"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeSObjects"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"describeSObjects"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrordescribeSObjects((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordescribeSObjects((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordescribeSObjects(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObjects(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObjects(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObjects(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObjects(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObjects(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObjects(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordescribeSObjects(f);
									}
								} else {
									callback.receiveErrordescribeSObjects(f);
								}
							} else {
								callback.receiveErrordescribeSObjects(f);
							}
						} else {
							callback.receiveErrordescribeSObjects(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordescribeSObjects(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[27].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[27].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Empty a set of sObjects from the recycle
	 * bin
	 * 
	 * @see com.salesforce.soap.partner.SforceService#emptyRecycleBin
	 * @param emptyRecycleBin504
	 * 
	 * @param sessionHeader505
	 * 
	 * @param callOptions506
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.EmptyRecycleBinResponse emptyRecycleBin(

	com.salesforce.soap.partner.EmptyRecycleBin emptyRecycleBin504,
			com.salesforce.soap.partner.SessionHeader sessionHeader505,
			com.salesforce.soap.partner.CallOptions callOptions506)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[28].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:emptyRecycleBinRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), emptyRecycleBin504,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "emptyRecycleBin")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "emptyRecycleBin"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader505 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader505 = toOM(
						sessionHeader505,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"emptyRecycleBin")));
				addHeader(omElementsessionHeader505, env);

			}

			// add the children only if the parameter is not null
			if (callOptions506 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions506 = toOM(
						callOptions506,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com",
								"emptyRecycleBin")));
				addHeader(omElementcallOptions506, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.EmptyRecycleBinResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.EmptyRecycleBinResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "emptyRecycleBin"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "emptyRecycleBin"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "emptyRecycleBin"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Empty a set
	 * of sObjects from the recycle bin
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startemptyRecycleBin
	 * @param emptyRecycleBin504
	 * 
	 * @param sessionHeader505
	 * 
	 * @param callOptions506
	 */
	public void startemptyRecycleBin(

			com.salesforce.soap.partner.EmptyRecycleBin emptyRecycleBin504,
			com.salesforce.soap.partner.SessionHeader sessionHeader505,
			com.salesforce.soap.partner.CallOptions callOptions506,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[28].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:emptyRecycleBinRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), emptyRecycleBin504,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "emptyRecycleBin")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"emptyRecycleBin"));

		// add the soap_headers only if they are not null
		if (sessionHeader505 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader505 = toOM(
					sessionHeader505,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "emptyRecycleBin")));
			addHeader(omElementsessionHeader505, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions506 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions506 = toOM(
					callOptions506,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "emptyRecycleBin")));
			addHeader(omElementcallOptions506, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.EmptyRecycleBinResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultemptyRecycleBin((com.salesforce.soap.partner.EmptyRecycleBinResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErroremptyRecycleBin(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"emptyRecycleBin"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"emptyRecycleBin"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"emptyRecycleBin"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErroremptyRecycleBin((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErroremptyRecycleBin(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErroremptyRecycleBin(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErroremptyRecycleBin(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErroremptyRecycleBin(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErroremptyRecycleBin(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErroremptyRecycleBin(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErroremptyRecycleBin(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErroremptyRecycleBin(f);
									}
								} else {
									callback.receiveErroremptyRecycleBin(f);
								}
							} else {
								callback.receiveErroremptyRecycleBin(f);
							}
						} else {
							callback.receiveErroremptyRecycleBin(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErroremptyRecycleBin(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[28].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[28].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Update or insert a set of sObjects based
	 * on object id
	 * 
	 * @see com.salesforce.soap.partner.SforceService#upsert
	 * @param upsert508
	 * 
	 * @param sessionHeader509
	 * 
	 * @param callOptions510
	 * 
	 * @param assignmentRuleHeader511
	 * 
	 * @param mruHeader512
	 * 
	 * @param allowFieldTruncationHeader513
	 * 
	 * @param disableFeedTrackingHeader514
	 * 
	 * @param streamingEnabledHeader515
	 * 
	 * @param allOrNoneHeader516
	 * 
	 * @param debuggingHeader517
	 * 
	 * @param packageVersionHeader518
	 * 
	 * @param emailHeader519
	 * 
	 * @throws com.salesforce.soap.partner.InvalidSObjectFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidIdFault
	 *             :
	 * @throws com.salesforce.soap.partner.InvalidFieldFault
	 *             :
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.UpsertResponse upsert(

			com.salesforce.soap.partner.Upsert upsert508,
			com.salesforce.soap.partner.SessionHeader sessionHeader509,
			com.salesforce.soap.partner.CallOptions callOptions510,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader511,
			com.salesforce.soap.partner.MruHeader mruHeader512,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader513,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader514,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader515,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader516,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader517,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader518,
			com.salesforce.soap.partner.EmailHeader emailHeader519)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.InvalidSObjectFault,
			com.salesforce.soap.partner.InvalidIdFault,
			com.salesforce.soap.partner.InvalidFieldFault,
			com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[29].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:upsertRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), upsert508,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader509 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader509 = toOM(
						sessionHeader509,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementsessionHeader509, env);

			}

			// add the children only if the parameter is not null
			if (callOptions510 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions510 = toOM(
						callOptions510,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementcallOptions510, env);

			}

			// add the children only if the parameter is not null
			if (assignmentRuleHeader511 != null) {

				org.apache.axiom.om.OMElement omElementassignmentRuleHeader511 = toOM(
						assignmentRuleHeader511,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementassignmentRuleHeader511, env);

			}

			// add the children only if the parameter is not null
			if (mruHeader512 != null) {

				org.apache.axiom.om.OMElement omElementmruHeader512 = toOM(
						mruHeader512,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementmruHeader512, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader513 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader513 = toOM(
						allowFieldTruncationHeader513,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementallowFieldTruncationHeader513, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader514 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader514 = toOM(
						disableFeedTrackingHeader514,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementdisableFeedTrackingHeader514, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader515 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader515 = toOM(
						streamingEnabledHeader515,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementstreamingEnabledHeader515, env);

			}

			// add the children only if the parameter is not null
			if (allOrNoneHeader516 != null) {

				org.apache.axiom.om.OMElement omElementallOrNoneHeader516 = toOM(
						allOrNoneHeader516,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementallOrNoneHeader516, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader517 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader517 = toOM(
						debuggingHeader517,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementdebuggingHeader517, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader518 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader518 = toOM(
						packageVersionHeader518,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementpackageVersionHeader518, env);

			}

			// add the children only if the parameter is not null
			if (emailHeader519 != null) {

				org.apache.axiom.om.OMElement omElementemailHeader519 = toOM(
						emailHeader519,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "upsert")));
				addHeader(omElementemailHeader519, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.UpsertResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.UpsertResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "upsert"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "upsert"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "upsert"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
							throw (com.salesforce.soap.partner.InvalidSObjectFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
							throw (com.salesforce.soap.partner.InvalidIdFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
							throw (com.salesforce.soap.partner.InvalidFieldFault) ex;
						}

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Update or
	 * insert a set of sObjects based on object id
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startupsert
	 * @param upsert508
	 * 
	 * @param sessionHeader509
	 * 
	 * @param callOptions510
	 * 
	 * @param assignmentRuleHeader511
	 * 
	 * @param mruHeader512
	 * 
	 * @param allowFieldTruncationHeader513
	 * 
	 * @param disableFeedTrackingHeader514
	 * 
	 * @param streamingEnabledHeader515
	 * 
	 * @param allOrNoneHeader516
	 * 
	 * @param debuggingHeader517
	 * 
	 * @param packageVersionHeader518
	 * 
	 * @param emailHeader519
	 */
	public void startupsert(

			com.salesforce.soap.partner.Upsert upsert508,
			com.salesforce.soap.partner.SessionHeader sessionHeader509,
			com.salesforce.soap.partner.CallOptions callOptions510,
			com.salesforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader511,
			com.salesforce.soap.partner.MruHeader mruHeader512,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader513,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader514,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader515,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader516,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader517,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader518,
			com.salesforce.soap.partner.EmailHeader emailHeader519,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[29].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:upsertRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), upsert508,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "upsert")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"upsert"));

		// add the soap_headers only if they are not null
		if (sessionHeader509 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader509 = toOM(
					sessionHeader509,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementsessionHeader509, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions510 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions510 = toOM(
					callOptions510,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementcallOptions510, env);

		}

		// add the soap_headers only if they are not null
		if (assignmentRuleHeader511 != null) {

			org.apache.axiom.om.OMElement omElementassignmentRuleHeader511 = toOM(
					assignmentRuleHeader511,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementassignmentRuleHeader511, env);

		}

		// add the soap_headers only if they are not null
		if (mruHeader512 != null) {

			org.apache.axiom.om.OMElement omElementmruHeader512 = toOM(
					mruHeader512,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementmruHeader512, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader513 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader513 = toOM(
					allowFieldTruncationHeader513,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementallowFieldTruncationHeader513, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader514 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader514 = toOM(
					disableFeedTrackingHeader514,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementdisableFeedTrackingHeader514, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader515 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader515 = toOM(
					streamingEnabledHeader515,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementstreamingEnabledHeader515, env);

		}

		// add the soap_headers only if they are not null
		if (allOrNoneHeader516 != null) {

			org.apache.axiom.om.OMElement omElementallOrNoneHeader516 = toOM(
					allOrNoneHeader516,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementallOrNoneHeader516, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader517 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader517 = toOM(
					debuggingHeader517,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementdebuggingHeader517, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader518 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader518 = toOM(
					packageVersionHeader518,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementpackageVersionHeader518, env);

		}

		// add the soap_headers only if they are not null
		if (emailHeader519 != null) {

			org.apache.axiom.om.OMElement omElementemailHeader519 = toOM(
					emailHeader519,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "upsert")));
			addHeader(omElementemailHeader519, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.UpsertResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultupsert((com.salesforce.soap.partner.UpsertResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorupsert(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "upsert"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"upsert"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"upsert"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.InvalidSObjectFault) {
											callback.receiveErrorupsert((com.salesforce.soap.partner.InvalidSObjectFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidIdFault) {
											callback.receiveErrorupsert((com.salesforce.soap.partner.InvalidIdFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.InvalidFieldFault) {
											callback.receiveErrorupsert((com.salesforce.soap.partner.InvalidFieldFault) ex);
											return;
										}

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorupsert((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorupsert(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupsert(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupsert(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupsert(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupsert(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupsert(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupsert(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorupsert(f);
									}
								} else {
									callback.receiveErrorupsert(f);
								}
							} else {
								callback.receiveErrorupsert(f);
							}
						} else {
							callback.receiveErrorupsert(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorupsert(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[29].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[29].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature convert a set of leads
	 * 
	 * @see com.salesforce.soap.partner.SforceService#convertLead
	 * @param convertLead521
	 * 
	 * @param sessionHeader522
	 * 
	 * @param callOptions523
	 * 
	 * @param allowFieldTruncationHeader524
	 * 
	 * @param disableFeedTrackingHeader525
	 * 
	 * @param streamingEnabledHeader526
	 * 
	 * @param debuggingHeader527
	 * 
	 * @param packageVersionHeader528
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.ConvertLeadResponse convertLead(

			com.salesforce.soap.partner.ConvertLead convertLead521,
			com.salesforce.soap.partner.SessionHeader sessionHeader522,
			com.salesforce.soap.partner.CallOptions callOptions523,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader524,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader525,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader526,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader527,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader528)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[30].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:convertLeadRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), convertLead521,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader522 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader522 = toOM(
						sessionHeader522,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "convertLead")));
				addHeader(omElementsessionHeader522, env);

			}

			// add the children only if the parameter is not null
			if (callOptions523 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions523 = toOM(
						callOptions523,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "convertLead")));
				addHeader(omElementcallOptions523, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader524 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader524 = toOM(
						allowFieldTruncationHeader524,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "convertLead")));
				addHeader(omElementallowFieldTruncationHeader524, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader525 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader525 = toOM(
						disableFeedTrackingHeader525,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "convertLead")));
				addHeader(omElementdisableFeedTrackingHeader525, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader526 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader526 = toOM(
						streamingEnabledHeader526,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "convertLead")));
				addHeader(omElementstreamingEnabledHeader526, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader527 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader527 = toOM(
						debuggingHeader527,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "convertLead")));
				addHeader(omElementdebuggingHeader527, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader528 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader528 = toOM(
						packageVersionHeader528,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "convertLead")));
				addHeader(omElementpackageVersionHeader528, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.ConvertLeadResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.ConvertLeadResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "convertLead"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "convertLead"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "convertLead"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations convert a
	 * set of leads
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startconvertLead
	 * @param convertLead521
	 * 
	 * @param sessionHeader522
	 * 
	 * @param callOptions523
	 * 
	 * @param allowFieldTruncationHeader524
	 * 
	 * @param disableFeedTrackingHeader525
	 * 
	 * @param streamingEnabledHeader526
	 * 
	 * @param debuggingHeader527
	 * 
	 * @param packageVersionHeader528
	 */
	public void startconvertLead(

			com.salesforce.soap.partner.ConvertLead convertLead521,
			com.salesforce.soap.partner.SessionHeader sessionHeader522,
			com.salesforce.soap.partner.CallOptions callOptions523,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader524,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader525,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader526,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader527,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader528,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[30].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:convertLeadRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), convertLead521,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "convertLead")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"convertLead"));

		// add the soap_headers only if they are not null
		if (sessionHeader522 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader522 = toOM(
					sessionHeader522,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")));
			addHeader(omElementsessionHeader522, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions523 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions523 = toOM(
					callOptions523,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")));
			addHeader(omElementcallOptions523, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader524 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader524 = toOM(
					allowFieldTruncationHeader524,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")));
			addHeader(omElementallowFieldTruncationHeader524, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader525 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader525 = toOM(
					disableFeedTrackingHeader525,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")));
			addHeader(omElementdisableFeedTrackingHeader525, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader526 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader526 = toOM(
					streamingEnabledHeader526,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")));
			addHeader(omElementstreamingEnabledHeader526, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader527 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader527 = toOM(
					debuggingHeader527,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")));
			addHeader(omElementdebuggingHeader527, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader528 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader528 = toOM(
					packageVersionHeader528,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "convertLead")));
			addHeader(omElementpackageVersionHeader528, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.ConvertLeadResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultconvertLead((com.salesforce.soap.partner.ConvertLeadResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorconvertLead(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(),
												"convertLead"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"convertLead"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"convertLead"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrorconvertLead((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrorconvertLead(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorconvertLead(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorconvertLead(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorconvertLead(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorconvertLead(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorconvertLead(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorconvertLead(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorconvertLead(f);
									}
								} else {
									callback.receiveErrorconvertLead(f);
								}
							} else {
								callback.receiveErrorconvertLead(f);
							}
						} else {
							callback.receiveErrorconvertLead(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorconvertLead(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[30].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[30].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Delete a set of sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#delete
	 * @param delete530
	 * 
	 * @param sessionHeader531
	 * 
	 * @param callOptions532
	 * 
	 * @param packageVersionHeader533
	 * 
	 * @param userTerritoryDeleteHeader534
	 * 
	 * @param emailHeader535
	 * 
	 * @param allowFieldTruncationHeader536
	 * 
	 * @param disableFeedTrackingHeader537
	 * 
	 * @param streamingEnabledHeader538
	 * 
	 * @param allOrNoneHeader539
	 * 
	 * @param debuggingHeader540
	 * 
	 * @throws com.salesforce.soap.partner.UnexpectedErrorFault
	 *             :
	 */

	public com.salesforce.soap.partner.DeleteResponse delete(

			com.salesforce.soap.partner.Delete delete530,
			com.salesforce.soap.partner.SessionHeader sessionHeader531,
			com.salesforce.soap.partner.CallOptions callOptions532,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader533,
			com.salesforce.soap.partner.UserTerritoryDeleteHeader userTerritoryDeleteHeader534,
			com.salesforce.soap.partner.EmailHeader emailHeader535,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader536,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader537,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader538,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader539,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader540)

	throws java.rmi.RemoteException

	, com.salesforce.soap.partner.UnexpectedErrorFault {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[31].getName());
			_operationClient.getOptions().setAction(
					"urn:partner.soap.sforce.com:Soap:deleteRequest");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), delete530,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")),
					new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete"));

			env.build();

			// add the children only if the parameter is not null
			if (sessionHeader531 != null) {

				org.apache.axiom.om.OMElement omElementsessionHeader531 = toOM(
						sessionHeader531,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementsessionHeader531, env);

			}

			// add the children only if the parameter is not null
			if (callOptions532 != null) {

				org.apache.axiom.om.OMElement omElementcallOptions532 = toOM(
						callOptions532,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementcallOptions532, env);

			}

			// add the children only if the parameter is not null
			if (packageVersionHeader533 != null) {

				org.apache.axiom.om.OMElement omElementpackageVersionHeader533 = toOM(
						packageVersionHeader533,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementpackageVersionHeader533, env);

			}

			// add the children only if the parameter is not null
			if (userTerritoryDeleteHeader534 != null) {

				org.apache.axiom.om.OMElement omElementuserTerritoryDeleteHeader534 = toOM(
						userTerritoryDeleteHeader534,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementuserTerritoryDeleteHeader534, env);

			}

			// add the children only if the parameter is not null
			if (emailHeader535 != null) {

				org.apache.axiom.om.OMElement omElementemailHeader535 = toOM(
						emailHeader535,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementemailHeader535, env);

			}

			// add the children only if the parameter is not null
			if (allowFieldTruncationHeader536 != null) {

				org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader536 = toOM(
						allowFieldTruncationHeader536,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementallowFieldTruncationHeader536, env);

			}

			// add the children only if the parameter is not null
			if (disableFeedTrackingHeader537 != null) {

				org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader537 = toOM(
						disableFeedTrackingHeader537,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementdisableFeedTrackingHeader537, env);

			}

			// add the children only if the parameter is not null
			if (streamingEnabledHeader538 != null) {

				org.apache.axiom.om.OMElement omElementstreamingEnabledHeader538 = toOM(
						streamingEnabledHeader538,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementstreamingEnabledHeader538, env);

			}

			// add the children only if the parameter is not null
			if (allOrNoneHeader539 != null) {

				org.apache.axiom.om.OMElement omElementallOrNoneHeader539 = toOM(
						allOrNoneHeader539,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementallOrNoneHeader539, env);

			}

			// add the children only if the parameter is not null
			if (debuggingHeader540 != null) {

				org.apache.axiom.om.OMElement omElementdebuggingHeader540 = toOM(
						debuggingHeader540,
						optimizeContent(new javax.xml.namespace.QName(
								"urn:partner.soap.sforce.com", "delete")));
				addHeader(omElementdebuggingHeader540, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					com.salesforce.soap.partner.DeleteResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.salesforce.soap.partner.DeleteResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(
								faultElt.getQName(), "delete"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "delete"));
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(
										faultElt.getQName(), "delete"));
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
							throw (com.salesforce.soap.partner.UnexpectedErrorFault) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Delete a set
	 * of sObjects
	 * 
	 * @see com.salesforce.soap.partner.SforceService#startdelete
	 * @param delete530
	 * 
	 * @param sessionHeader531
	 * 
	 * @param callOptions532
	 * 
	 * @param packageVersionHeader533
	 * 
	 * @param userTerritoryDeleteHeader534
	 * 
	 * @param emailHeader535
	 * 
	 * @param allowFieldTruncationHeader536
	 * 
	 * @param disableFeedTrackingHeader537
	 * 
	 * @param streamingEnabledHeader538
	 * 
	 * @param allOrNoneHeader539
	 * 
	 * @param debuggingHeader540
	 */
	public void startdelete(

			com.salesforce.soap.partner.Delete delete530,
			com.salesforce.soap.partner.SessionHeader sessionHeader531,
			com.salesforce.soap.partner.CallOptions callOptions532,
			com.salesforce.soap.partner.PackageVersionHeader packageVersionHeader533,
			com.salesforce.soap.partner.UserTerritoryDeleteHeader userTerritoryDeleteHeader534,
			com.salesforce.soap.partner.EmailHeader emailHeader535,
			com.salesforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader536,
			com.salesforce.soap.partner.DisableFeedTrackingHeader disableFeedTrackingHeader537,
			com.salesforce.soap.partner.StreamingEnabledHeader streamingEnabledHeader538,
			com.salesforce.soap.partner.AllOrNoneHeader allOrNoneHeader539,
			com.salesforce.soap.partner.DebuggingHeader debuggingHeader540,

			final com.salesforce.soap.partner.SforceServiceCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[31].getName());
		_operationClient.getOptions().setAction(
				"urn:partner.soap.sforce.com:Soap:deleteRequest");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), delete530,
				optimizeContent(new javax.xml.namespace.QName(
						"urn:partner.soap.sforce.com", "delete")),
				new javax.xml.namespace.QName("urn:partner.soap.sforce.com",
						"delete"));

		// add the soap_headers only if they are not null
		if (sessionHeader531 != null) {

			org.apache.axiom.om.OMElement omElementsessionHeader531 = toOM(
					sessionHeader531,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementsessionHeader531, env);

		}

		// add the soap_headers only if they are not null
		if (callOptions532 != null) {

			org.apache.axiom.om.OMElement omElementcallOptions532 = toOM(
					callOptions532,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementcallOptions532, env);

		}

		// add the soap_headers only if they are not null
		if (packageVersionHeader533 != null) {

			org.apache.axiom.om.OMElement omElementpackageVersionHeader533 = toOM(
					packageVersionHeader533,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementpackageVersionHeader533, env);

		}

		// add the soap_headers only if they are not null
		if (userTerritoryDeleteHeader534 != null) {

			org.apache.axiom.om.OMElement omElementuserTerritoryDeleteHeader534 = toOM(
					userTerritoryDeleteHeader534,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementuserTerritoryDeleteHeader534, env);

		}

		// add the soap_headers only if they are not null
		if (emailHeader535 != null) {

			org.apache.axiom.om.OMElement omElementemailHeader535 = toOM(
					emailHeader535,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementemailHeader535, env);

		}

		// add the soap_headers only if they are not null
		if (allowFieldTruncationHeader536 != null) {

			org.apache.axiom.om.OMElement omElementallowFieldTruncationHeader536 = toOM(
					allowFieldTruncationHeader536,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementallowFieldTruncationHeader536, env);

		}

		// add the soap_headers only if they are not null
		if (disableFeedTrackingHeader537 != null) {

			org.apache.axiom.om.OMElement omElementdisableFeedTrackingHeader537 = toOM(
					disableFeedTrackingHeader537,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementdisableFeedTrackingHeader537, env);

		}

		// add the soap_headers only if they are not null
		if (streamingEnabledHeader538 != null) {

			org.apache.axiom.om.OMElement omElementstreamingEnabledHeader538 = toOM(
					streamingEnabledHeader538,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementstreamingEnabledHeader538, env);

		}

		// add the soap_headers only if they are not null
		if (allOrNoneHeader539 != null) {

			org.apache.axiom.om.OMElement omElementallOrNoneHeader539 = toOM(
					allOrNoneHeader539,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementallOrNoneHeader539, env);

		}

		// add the soap_headers only if they are not null
		if (debuggingHeader540 != null) {

			org.apache.axiom.om.OMElement omElementdebuggingHeader540 = toOM(
					debuggingHeader540,
					optimizeContent(new javax.xml.namespace.QName(
							"urn:partner.soap.sforce.com", "delete")));
			addHeader(omElementdebuggingHeader540, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {

					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.salesforce.soap.partner.DeleteResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback.receiveResultdelete((com.salesforce.soap.partner.DeleteResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrordelete(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap
										.containsKey(new org.apache.axis2.client.FaultMapKey(
												faultElt.getQName(), "delete"))) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"delete"));
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.reflect.Constructor constructor = exceptionClass
												.getConstructor(String.class);
										java.lang.Exception ex = (java.lang.Exception) constructor
												.newInstance(f.getMessage());
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(new org.apache.axis2.client.FaultMapKey(
														faultElt.getQName(),
														"delete"));
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m.invoke(
												ex,
												new java.lang.Object[] { messageObject });

										if (ex instanceof com.salesforce.soap.partner.UnexpectedErrorFault) {
											callback.receiveErrordelete((com.salesforce.soap.partner.UnexpectedErrorFault) ex);
											return;
										}

										callback.receiveErrordelete(new java.rmi.RemoteException(
												ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordelete(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordelete(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordelete(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordelete(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordelete(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordelete(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrordelete(f);
									}
								} else {
									callback.receiveErrordelete(f);
								}
							} else {
								callback.receiveErrordelete(f);
							}
						} else {
							callback.receiveErrordelete(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrordelete(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[31].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[31].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(
			org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
					.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// https://login.salesforce.com/services/Soap/u/25.0
	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Merge param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Merge.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.MergeResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.MergeResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.InvalidSObjectFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.fault.InvalidSObjectFaultE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.InvalidIdFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.fault.InvalidIdFaultE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.InvalidFieldFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.fault.InvalidFieldFaultE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.UnexpectedErrorFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.SessionHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.SessionHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.CallOptions param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.CallOptions.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.AssignmentRuleHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.AssignmentRuleHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.MruHeader param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.MruHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.AllowFieldTruncationHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.AllowFieldTruncationHeader.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DisableFeedTrackingHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DisableFeedTrackingHeader.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.StreamingEnabledHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.StreamingEnabledHeader.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DebuggingHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DebuggingHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.PackageVersionHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.PackageVersionHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.EmailHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.EmailHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DebuggingInfo param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DebuggingInfo.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetUserInfo param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.GetUserInfo.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetUserInfoResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.GetUserInfoResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeSoftphoneLayout param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeSoftphoneLayout.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Update param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Update.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.UpdateResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.UpdateResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.AllOrNoneHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.AllOrNoneHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.SetPassword param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.SetPassword.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.SetPasswordResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.SetPasswordResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.InvalidNewPasswordFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.fault.InvalidNewPasswordFaultE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Logout param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Logout.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.LogoutResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.LogoutResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Retrieve param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Retrieve.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.RetrieveResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.RetrieveResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.MalformedQueryFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.fault.MalformedQueryFaultE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.QueryOptions param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.QueryOptions.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.QueryAll param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.QueryAll.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.QueryAllResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.QueryAllResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetUpdated param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.GetUpdated.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetUpdatedResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.GetUpdatedResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Undelete param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Undelete.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.UndeleteResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.UndeleteResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Create param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Create.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.CreateResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.CreateResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.SendEmail param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.SendEmail.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.SendEmailResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.SendEmailResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Search param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Search.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.SearchResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.SearchResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.MalformedSearchFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.fault.MalformedSearchFaultE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Query param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Query.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.QueryResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.QueryResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetDeleted param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.GetDeleted.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetDeletedResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.GetDeletedResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Process param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Process.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.ProcessResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.ProcessResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeDataCategoryGroupStructures param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeDataCategoryGroupStructures.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.ResetPassword param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.ResetPassword.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.ResetPasswordResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.ResetPasswordResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeGlobal param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DescribeGlobal.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeGlobalResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeGlobalResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeLayoutE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DescribeLayoutE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeLayoutResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeLayoutResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeTabs param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DescribeTabs.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeTabsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DescribeTabsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeDataCategoryGroups param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeDataCategoryGroups.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetServerTimestamp param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.GetServerTimestamp.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.GetServerTimestampResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.GetServerTimestampResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.InvalidateSessions param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.InvalidateSessions.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.InvalidateSessionsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.InvalidateSessionsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeSObject param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DescribeSObject.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeSObjectResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeSObjectResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.LocaleOptions param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.LocaleOptions.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Login param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Login.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.LoginResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.LoginResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.fault.LoginFaultE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.fault.LoginFaultE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.LoginScopeHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.LoginScopeHeader.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.QueryMore param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.QueryMore.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.QueryMoreResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.QueryMoreResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeSObjects param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DescribeSObjects.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DescribeSObjectsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.DescribeSObjectsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.EmptyRecycleBin param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.EmptyRecycleBin.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.EmptyRecycleBinResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.EmptyRecycleBinResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Upsert param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Upsert.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.UpsertResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.UpsertResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.ConvertLead param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.ConvertLead.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.ConvertLeadResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.ConvertLeadResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.Delete param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.Delete.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.DeleteResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					com.salesforce.soap.partner.DeleteResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.salesforce.soap.partner.UserTerritoryDeleteHeader param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.salesforce.soap.partner.UserTerritoryDeleteHeader.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Merge param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.Merge.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.GetUserInfo param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.GetUserInfo.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeSoftphoneLayout param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.DescribeSoftphoneLayout.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Update param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Update.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.SetPassword param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.SetPassword.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Logout param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Logout.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Retrieve param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Retrieve.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.QueryAll param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.QueryAll.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.GetUpdated param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.GetUpdated.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Undelete param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Undelete.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Create param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Create.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.SendEmail param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.SendEmail.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Search param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Search.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Query param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.Query.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.GetDeleted param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.GetDeleted.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Process param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Process.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeDataCategoryGroupStructures param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.DescribeDataCategoryGroupStructures.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.ResetPassword param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.ResetPassword.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeGlobal param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.DescribeGlobal.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeLayoutE param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.DescribeLayoutE.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeTabs param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.DescribeTabs.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeDataCategoryGroups param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.DescribeDataCategoryGroups.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.GetServerTimestamp param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.GetServerTimestamp.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.InvalidateSessions param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.InvalidateSessions.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeSObject param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.DescribeSObject.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Login param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.Login.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.QueryMore param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.QueryMore.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.DescribeSObjects param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.DescribeSObjects.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.EmptyRecycleBin param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									com.salesforce.soap.partner.EmptyRecycleBin.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Upsert param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Upsert.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.ConvertLead param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.ConvertLead.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.salesforce.soap.partner.Delete param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							com.salesforce.soap.partner.Delete.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
			java.lang.Class type, java.util.Map extraNamespaces)
			throws org.apache.axis2.AxisFault {

		try {

			if (com.salesforce.soap.partner.Merge.class.equals(type)) {

				return com.salesforce.soap.partner.Merge.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.MergeResponse.class.equals(type)) {

				return com.salesforce.soap.partner.MergeResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AssignmentRuleHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AssignmentRuleHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.MruHeader.class.equals(type)) {

				return com.salesforce.soap.partner.MruHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmailHeader.class.equals(type)) {

				return com.salesforce.soap.partner.EmailHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetUserInfo.class.equals(type)) {

				return com.salesforce.soap.partner.GetUserInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetUserInfoResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.GetUserInfoResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeSoftphoneLayout.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeSoftphoneLayout.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeSoftphoneLayoutResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Update.class.equals(type)) {

				return com.salesforce.soap.partner.Update.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.UpdateResponse.class.equals(type)) {

				return com.salesforce.soap.partner.UpdateResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AssignmentRuleHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AssignmentRuleHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.MruHeader.class.equals(type)) {

				return com.salesforce.soap.partner.MruHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllOrNoneHeader.class.equals(type)) {

				return com.salesforce.soap.partner.AllOrNoneHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmailHeader.class.equals(type)) {

				return com.salesforce.soap.partner.EmailHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SetPassword.class.equals(type)) {

				return com.salesforce.soap.partner.SetPassword.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SetPasswordResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.SetPasswordResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidNewPasswordFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidNewPasswordFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Logout.class.equals(type)) {

				return com.salesforce.soap.partner.Logout.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.LogoutResponse.class.equals(type)) {

				return com.salesforce.soap.partner.LogoutResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Retrieve.class.equals(type)) {

				return com.salesforce.soap.partner.Retrieve.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.RetrieveResponse.class.equals(type)) {

				return com.salesforce.soap.partner.RetrieveResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.MalformedQueryFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.MalformedQueryFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryOptions.class.equals(type)) {

				return com.salesforce.soap.partner.QueryOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.MruHeader.class.equals(type)) {

				return com.salesforce.soap.partner.MruHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryAll.class.equals(type)) {

				return com.salesforce.soap.partner.QueryAll.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryAllResponse.class.equals(type)) {

				return com.salesforce.soap.partner.QueryAllResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.MalformedQueryFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.MalformedQueryFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryOptions.class.equals(type)) {

				return com.salesforce.soap.partner.QueryOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetUpdated.class.equals(type)) {

				return com.salesforce.soap.partner.GetUpdated.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetUpdatedResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.GetUpdatedResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Undelete.class.equals(type)) {

				return com.salesforce.soap.partner.Undelete.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.UndeleteResponse.class.equals(type)) {

				return com.salesforce.soap.partner.UndeleteResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllOrNoneHeader.class.equals(type)) {

				return com.salesforce.soap.partner.AllOrNoneHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Create.class.equals(type)) {

				return com.salesforce.soap.partner.Create.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CreateResponse.class.equals(type)) {

				return com.salesforce.soap.partner.CreateResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AssignmentRuleHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AssignmentRuleHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.MruHeader.class.equals(type)) {

				return com.salesforce.soap.partner.MruHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllOrNoneHeader.class.equals(type)) {

				return com.salesforce.soap.partner.AllOrNoneHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmailHeader.class.equals(type)) {

				return com.salesforce.soap.partner.EmailHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SendEmail.class.equals(type)) {

				return com.salesforce.soap.partner.SendEmail.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SendEmailResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.SendEmailResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Search.class.equals(type)) {

				return com.salesforce.soap.partner.Search.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SearchResponse.class.equals(type)) {

				return com.salesforce.soap.partner.SearchResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.MalformedSearchFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.MalformedSearchFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Query.class.equals(type)) {

				return com.salesforce.soap.partner.Query.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryResponse.class.equals(type)) {

				return com.salesforce.soap.partner.QueryResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.MalformedQueryFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.MalformedQueryFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryOptions.class.equals(type)) {

				return com.salesforce.soap.partner.QueryOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.MruHeader.class.equals(type)) {

				return com.salesforce.soap.partner.MruHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetDeleted.class.equals(type)) {

				return com.salesforce.soap.partner.GetDeleted.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetDeletedResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.GetDeletedResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Process.class.equals(type)) {

				return com.salesforce.soap.partner.Process.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.ProcessResponse.class.equals(type)) {

				return com.salesforce.soap.partner.ProcessResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeDataCategoryGroupStructures.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeDataCategoryGroupStructures.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeDataCategoryGroupStructuresResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.ResetPassword.class.equals(type)) {

				return com.salesforce.soap.partner.ResetPassword.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.ResetPasswordResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.ResetPasswordResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmailHeader.class.equals(type)) {

				return com.salesforce.soap.partner.EmailHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeGlobal.class.equals(type)) {

				return com.salesforce.soap.partner.DescribeGlobal.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeGlobalResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeGlobalResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeLayoutE.class.equals(type)) {

				return com.salesforce.soap.partner.DescribeLayoutE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeLayoutResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeLayoutResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeTabs.class.equals(type)) {

				return com.salesforce.soap.partner.DescribeTabs.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeTabsResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeTabsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeDataCategoryGroups.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeDataCategoryGroups.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeDataCategoryGroupsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetServerTimestamp.class
					.equals(type)) {

				return com.salesforce.soap.partner.GetServerTimestamp.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.GetServerTimestampResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.GetServerTimestampResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.InvalidateSessions.class
					.equals(type)) {

				return com.salesforce.soap.partner.InvalidateSessions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.InvalidateSessionsResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.InvalidateSessionsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeSObject.class.equals(type)) {

				return com.salesforce.soap.partner.DescribeSObject.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeSObjectResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeSObjectResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.LocaleOptions.class.equals(type)) {

				return com.salesforce.soap.partner.LocaleOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Login.class.equals(type)) {

				return com.salesforce.soap.partner.Login.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.LoginResponse.class.equals(type)) {

				return com.salesforce.soap.partner.LoginResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.LoginFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.LoginFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.LoginScopeHeader.class.equals(type)) {

				return com.salesforce.soap.partner.LoginScopeHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryMore.class.equals(type)) {

				return com.salesforce.soap.partner.QueryMore.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryMoreResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.QueryMoreResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidQueryLocatorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.QueryOptions.class.equals(type)) {

				return com.salesforce.soap.partner.QueryOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeSObjects.class.equals(type)) {

				return com.salesforce.soap.partner.DescribeSObjects.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DescribeSObjectsResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.DescribeSObjectsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.LocaleOptions.class.equals(type)) {

				return com.salesforce.soap.partner.LocaleOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmptyRecycleBin.class.equals(type)) {

				return com.salesforce.soap.partner.EmptyRecycleBin.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmptyRecycleBinResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.EmptyRecycleBinResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Upsert.class.equals(type)) {

				return com.salesforce.soap.partner.Upsert.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.UpsertResponse.class.equals(type)) {

				return com.salesforce.soap.partner.UpsertResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidSObjectFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidSObjectFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidIdFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidIdFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.InvalidFieldFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.InvalidFieldFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AssignmentRuleHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AssignmentRuleHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.MruHeader.class.equals(type)) {

				return com.salesforce.soap.partner.MruHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllOrNoneHeader.class.equals(type)) {

				return com.salesforce.soap.partner.AllOrNoneHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmailHeader.class.equals(type)) {

				return com.salesforce.soap.partner.EmailHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.ConvertLead.class.equals(type)) {

				return com.salesforce.soap.partner.ConvertLead.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.ConvertLeadResponse.class
					.equals(type)) {

				return com.salesforce.soap.partner.ConvertLeadResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.Delete.class.equals(type)) {

				return com.salesforce.soap.partner.Delete.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DeleteResponse.class.equals(type)) {

				return com.salesforce.soap.partner.DeleteResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.class
					.equals(type)) {

				return com.salesforce.soap.partner.fault.UnexpectedErrorFaultE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.SessionHeader.class.equals(type)) {

				return com.salesforce.soap.partner.SessionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.CallOptions.class.equals(type)) {

				return com.salesforce.soap.partner.CallOptions.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.PackageVersionHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.PackageVersionHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.UserTerritoryDeleteHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.UserTerritoryDeleteHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.EmailHeader.class.equals(type)) {

				return com.salesforce.soap.partner.EmailHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllowFieldTruncationHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.AllowFieldTruncationHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DisableFeedTrackingHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.DisableFeedTrackingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.StreamingEnabledHeader.class
					.equals(type)) {

				return com.salesforce.soap.partner.StreamingEnabledHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.AllOrNoneHeader.class.equals(type)) {

				return com.salesforce.soap.partner.AllOrNoneHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingHeader.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingHeader.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.salesforce.soap.partner.DebuggingInfo.class.equals(type)) {

				return com.salesforce.soap.partner.DebuggingInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
