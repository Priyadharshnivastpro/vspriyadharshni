package edu.disease.asn6;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Disease;
import edu.disease.asn3.InfectiousDisease;

class DiseaseFileRepositoryTest {
	List<Disease> diseases ;
	List<Patient> patients ;
	DiseaseFileRepository dfr;
	@Test
	public void testSave() throws IOException, ClassNotFoundException {
		dfr.save(diseases, patients);
		String folderPath="D:\\task";
		FileInputStream fis=new FileInputStream(folderPath+"diseases.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		List<Disease> disease=(List<Disease>) ois.readObject();
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testInit() throws ClassNotFoundException, IOException {
		Disease d1=new InfectiousDisease();
		d1.setDiseaseId(UUID.randomUUID());
		
		List<Disease> diseases=Arrays.asList(d1) ;
		
		String folderPath="D:\\task";
		
		FileOutputStream fos1=new FileOutputStream(folderPath+ "\\diseases.dat");
		ObjectOutputStream oos1=new ObjectOutputStream(fos1);
		oos1.writeObject(diseases);
		
		Patient p1=new Patient();
		p1.setPatientId(UUID.randomUUID());
		List<Patient> patient=Arrays.asList(p1);
		
		FileOutputStream fos2=new FileOutputStream(folderPath+"\\patients.dat");
		ObjectOutputStream oos2=new ObjectOutputStream(fos2);
		oos2.writeObject(patient);
		
		dfr=new DiseaseFileRepository();
	
		DiseaseAndPatient dap=dfr.init(folderPath);
		List<Disease> diseases1=dap.getDiseases();
		List<Patient> patient1=dap.getPatients();
		assertTrue(diseases1.get(0).equals(d1) && patient1.get(0).equals(p1));
		
	}
	@Test
	public void testInit2() throws ClassNotFoundException, IOException {
		String folderPath1=null;
		DiseaseFileRepository dfr=new DiseaseFileRepository();
		assertThrows(IllegalArgumentException.class,()->dfr.init(folderPath1));
	}
}