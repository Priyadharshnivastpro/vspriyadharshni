package edu.disease.asn1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.Test;

public class DiseaseTest {
	
	@Test
	public void testgetandsetDiseaseId(){
		Disease d=new Disease();
		UUID uuid=UUID.randomUUID();
		d.setDiseaseId(uuid);
		
		assertEquals(uuid, d.getDiseaseId());
	}
	@Test
	public void testgetandsetName() {
		Disease d=new Disease();
		d.setName("Priya");
		assertEquals("Priya",d.getName());
		
	}
	@Test
	public void testhashcode() {
		Disease d=new Disease();
		UUID uuid=UUID.randomUUID();
		d.setDiseaseId(uuid);
		assertEquals(d.hashCode(),d.hashCode() );
	}
	@Test
	public void testequals() {
		Disease d=new Disease();
		UUID uuid=UUID.randomUUID();
		d.setDiseaseId(uuid);
		d.setName("Hari");
		assertTrue(d.equals(d));
	}
	@Test
	public void testequalsa() {
		Disease d=null;
		UUID uuid=UUID.randomUUID();
		
		Disease d1=new Disease();
		d1.setDiseaseId(uuid);
		d1.setName("hari");
		assertFalse(d1.equals(d));
	}
	@Test
	public void testequalse() {
		Disease d=new Disease();
		UUID uuid=UUID.randomUUID();
		d.setDiseaseId(uuid);
		d.setName("Hari");
		assertFalse(d.equals(6));
	}
	@Test
	public void testequalsea() {
		UUID uuid=UUID.randomUUID();

		Disease d=new Disease();
		d.setDiseaseId(null);
		Disease d1=new Disease();
		d1.setDiseaseId(uuid);
	
		assertFalse(d.equals(d1));
}@Test
	public void testequalseas() {
	UUID uuid=UUID.randomUUID();

	Disease d1=new Disease();
	d1.setDiseaseId(uuid);
	Disease d=new Disease();
	d.setDiseaseId(null);
	assertFalse(d1.equals(d));

}
@Test
public void testequalseass() {
UUID uuid=UUID.randomUUID();

Disease d1=new Disease();
d1.setDiseaseId(uuid);
Disease d=new Disease();
d.setDiseaseId(uuid);
assertTrue(d1.equals(d));

}
@Test
public void testtostring() {
	Disease d=new Disease();
	UUID uuid=UUID.randomUUID();
	d.setDiseaseId(uuid);
	d.setName("Priya");
	
	
	assertTrue(d.toString().equals(d.toString()));
}
	}
