package edu.disease.asn6;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import edu.disease.asn6.Patient;

public class PatientZeroTest {
@Test
public void testMethods() {
	PatientZero pz=new PatientZero();
	LocalDateTime dateTime=LocalDateTime.of(2023,9,26,29,00);
	pz.setExposureDateTime(dateTime);
	Patient zero=new Patient();
	pz.setPatient(zero);
	pz.setExposed(false);
	assertEquals(zero,pz.getPatient());
	assertEquals(dateTime,pz.getExposureDateTime());
	assertFalse(pz.isExposed());
}
}

