package edu.disease.asn6;


	import java.time.LocalDateTime;
	import java.util.UUID;

	import org.junit.jupiter.api.Test;

	import edu.disease.asn3.Disease;
	import edu.disease.asn6.DiseaseControlManagerImpl;
	import edu.disease.asn3.Exposure;
	import edu.disease.asn6.Patient;

	public class ContactTraceTest {

	@Test
	public void testContactTrace() {
		DiseaseControlManagerImpl d=new DiseaseControlManagerImpl();
		Disease corona =d.addDisease("corona", true);
		UUID coronaId=corona.getDiseaseId();
		
		Patient A=d.addPatient("Malar", "M", 1, 0);
		UUID Aid=A.getPatientId();
		
		Patient B=d.addPatient("Viji", "k", 1, 1);
		UUID Bid=B.getPatientId();
		
		Patient C=d.addPatient("Jeevi", "A", 1, 2);
		UUID Cid=C.getPatientId();
		
		d.addDiseaseToPatient(Aid,coronaId);
		d.addDiseaseToPatient(Bid,coronaId);
		d.addDiseaseToPatient(Cid, coronaId);
		
		Exposure B_A=new Exposure(Aid);
		LocalDateTime dateTimeB_A=LocalDateTime.of(2023,8,25,22,00);
		B_A.setTime(dateTimeB_A);
		B_A.setExposure("D");
		
		Exposure C_A=new Exposure(Cid);
		LocalDateTime dateTimeC_A=LocalDateTime.of(2023,8,27,22,00);
		C_A.setTime(dateTimeC_A);
		C_A.setExposure("D");
		
		Exposure C_B=new Exposure(Cid);
		LocalDateTime dateTimeC_B=LocalDateTime.of(2023,8,27,22,00);
		C_B.setTime(dateTimeC_B);
		C_B.setExposure("D");
		
		C.addExposure(C_A);
		C.addExposure(C_B);
		
		B.addExposure(B_A);
		
		ContactTrace ct=new ContactTrace(d);
	
		PatientZero zero=ct.findPatientZero(C);
		
		System.out.println(zero.getPatient().getFirstName());
   }

	}

