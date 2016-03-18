package ca.uhn.fhir.ctx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ca.uhn.fhir.context.BaseRuntimeChildDatatypeDefinition;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;

public class FhirContextDstu2Test {
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(FhirContextDstu2Test.class);

	private FhirContext ourCtx = FhirContext.forDstu2();
	
	@Test
	public void testQueryBoundCode() {
		RuntimeResourceDefinition patientType = ourCtx.getResourceDefinition(Patient.class);
		String childName = "gender";
		BaseRuntimeChildDatatypeDefinition genderChild = (BaseRuntimeChildDatatypeDefinition) patientType.getChildByName(childName);
		ourLog.trace(genderChild.getClass().getName());
		
		assertEquals(AdministrativeGenderEnum.class, genderChild.getBoundEnumType());
	}
	
	@Test
	public void testQueryBoundCodeableConcept() {
		RuntimeResourceDefinition patientType = ourCtx.getResourceDefinition(Patient.class);
		String childName = "maritalStatus";
		BaseRuntimeChildDatatypeDefinition genderChild = (BaseRuntimeChildDatatypeDefinition) patientType.getChildByName(childName);
		ourLog.trace(genderChild.getClass().getName());
		
		assertEquals(MaritalStatusCodesEnum.class, genderChild.getBoundEnumType());
	}

}
