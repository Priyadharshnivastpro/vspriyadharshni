package edu.disease.asn3;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
public class DiseaseAndPatientTest {
     
	Disease[] diseases=new Disease[8];
	Patient[] patients=new Patient[8];
	@Test
	public void testgetDisease() {
		DiseaseAndPatient t=new DiseaseAndPatient(diseases, patients);
		assertNotNull(t.getDiseases());
	}
	@Test
	public void testsetDisease() {
		DiseaseAndPatient t=new DiseaseAndPatient(diseases, patients);
		t.setDiseases(diseases);
	}
	@Test
	public void testgetPatient() {
		DiseaseAndPatient t=new DiseaseAndPatient(diseases, patients);
		assertNotNull(t.getPatients());
	}
	@Test
	public void testsetPatients() {
		DiseaseAndPatient t=new DiseaseAndPatient(diseases, patients);
		t.setPatients(patients);
	}
	DiseaseAndPatient t=new DiseaseAndPatient();
}
