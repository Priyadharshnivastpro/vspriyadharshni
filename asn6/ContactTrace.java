package edu.disease.asn6;




import java.util.List;

import edu.disease.asn3.Exposure;

public class ContactTrace {
	static DiseaseControlManager diseaseControlManager;
	public static PatientZero findPatientZero(Patient patient) 
	{
		if(patient.getExposures().size()==0) {
			PatientZero patientZero=new PatientZero();
			patientZero.setPatient(patient);
			patientZero.setExposed(false);
			return patientZero;
		}
		
		List<Exposure> exposures=patient.getExposures();
		Exposure earliestExposure=exposures.get(0);
		for(int i=1;i<exposures.size();i++) {
			if(earliestExposure.getTime().isAfter(exposures.get(i).getTime())) {
				earliestExposure=exposures.get(i);
			}
		}
		Patient earliestPatient=diseaseControlManager.getPatient(earliestExposure.getPatientId());
		return findPatientZero(earliestPatient);
	}
	
	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.diseaseControlManager = diseaseControlManager;
	}

}