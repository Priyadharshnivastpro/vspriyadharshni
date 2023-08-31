package edu.disease.asn6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import edu.disease.asn3.Exposure;



public class PatientTest {
	private Patient patient;
	
	private static final String FIRST_NAME = "firstName";
	
	private static final String LAST_NAME = "lastName";
	
	private Exposure exposure;
	
	@Before
	public void setUp() {
		final UUID uuid = UUID.randomUUID();
		exposure = new Exposure(uuid);
		exposure.setTime(LocalDateTime.now());
		exposure.setExposure("D");
		patient = new Patient();
		patient.setDiseaseIds(Arrays.asList(UUID.randomUUID(), UUID.randomUUID()));
		patient.setExposures(Arrays.asList(exposure));
		patient.setFirstName(FIRST_NAME);
		patient.setLastName(LAST_NAME);
		patient.setPatientId(uuid);
	}
	
	@Test
	public void testPatientPostiveScenario()
	{
		assertNotNull(patient.toString());
		assertNotNull(patient.getDiseaseIds());
		assertNotNull(patient.getExposures());
		assertNotNull(patient.getFirstName());
		assertNotNull(patient.getLastName());
		assertNotNull(patient.hashCode());
		assertNotNull(patient.getPatientId());
		final Patient patientObj = patient;
		assertTrue(patient.equals(patientObj));
		assertTrue(patient.equals(patient));
		assertFalse(patient.equals(null));
		final Patient patientObjEquals = new Patient();
		patientObjEquals.setPatientId(patient.getPatientId());
		assertTrue(patient.equals(patientObjEquals));
		assertFalse(patient.equals(null));
		patientObjEquals.setPatientId(null);
		assertFalse(patient.equals(patientObjEquals));
		
	}
	
	@Test
	public void testAddDisease()
	{
	    final Patient patientTest = new Patient();
	    patientTest.addDiseaseId(UUID.randomUUID());
	    patientTest.addDiseaseId(UUID.randomUUID());
	    patientTest.addDiseaseId(UUID.randomUUID());
	    System.out.println(patientTest.getDiseaseIds().get(0));
		assertEquals(3, patientTest.getDiseaseIds().size());
	}
	
	@Test
	public void testAddExposure()
	{
	    final Patient patientTest = new Patient();
	    patientTest.addExposure(exposure);
	    patientTest.addExposure(exposure);
	    patientTest.addExposure(exposure);
	    System.out.println(patientTest.getExposures().get(0));
		assertEquals(3, patientTest.getExposures().size());
	}
	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddDiseaseException()
	{
		patient.addDiseaseId(UUID.randomUUID());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddExposureException()
	{
		patient.addExposure(exposure);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionPatient()
	{
		Patient patientTest = new Patient();
		
	}
}