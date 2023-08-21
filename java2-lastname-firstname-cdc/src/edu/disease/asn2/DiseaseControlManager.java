package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {
	
public Disease addDisease(String name,Boolean Infectious);
public Disease getDisease(UUID diseaseid);
public Patient addPatient(String firstname,String lastname,int Maxdiseases,int MaxExposure);
public Patient getPatient(UUID patient);
public void addDiseaseToPatient(UUID PatientId,UUID diseaseId);
public void ExposureToPatient(UUID PatientId,Exposure exposure);

}
