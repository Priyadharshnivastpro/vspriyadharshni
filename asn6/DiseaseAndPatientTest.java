package edu.disease.asn6;



import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import edu.disease.asn3.Disease;
public class DiseaseAndPatientTest {
     
	private List<Disease> diseases;
	private List<Patient> patients;
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
