package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {
	
	private static Disease[] diseases;
	private static Patient[] patients;
	int maxDiseases;
	int maxPatients;
	int diseasearraycount =0;
	int patientarraycount =0;
	
	public DiseaseControlManagerImpl() {
		
	}
	public DiseaseControlManagerImpl(int maxDiseases,int maxPatients) {
		if(maxDiseases<=0 && maxPatients<=0) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				System.out.println("Please enter the correct input");
			}
		}else {
			this.maxDiseases = maxDiseases;
			this.maxPatients = maxPatients;
			diseases = new Disease[maxDiseases];
			patients = new Patient[maxPatients];
		}
	}
	
	public Disease addDisease(String name, Boolean Infectious) {
		if (maxDiseases < maxDiseases) {
			if (Infectious) {
				return diseases[maxDiseases++] = new InfectiousDisease();
			} else {
				return diseases[maxDiseases++] = new NonInfectionDisease();
			}
		} else {
			throw new IllegalStateException("No more Disease can be Added !");
		}
	}

	public Disease getDisease(UUID diseaseid) {
		for (int i = 0; i < maxDiseases; i++) {
			if ((diseases[i].getDiseaseId()).equals(diseaseid)) {
				return diseases[i];
			}
		}
		return null;
	}
		
	public Patient addPatient(String firstname, String lastname, int Maxdiseases, int MaxExposure) {
		if (maxPatients<=patientarraycount) {
			throw new IllegalStateException("No more Patients can be added");
		} else {
			patients[patientarraycount]=new Patient(maxDiseases, maxExposures);
			patients[patientarraycount].lastname=lastName;
			patients[patientarraycount].firstname=fistName;
			return patients[patientarraycount++];
		}	
	}

	public Patient getPatient(UUID patient) {

		for(Patient p: patients) {
			p.patientId==patient{
				return p;
			}
		}
		return null;
	}

	public void addDiseaseToPatient(UUID PatientId, UUID diseaseId) {
		Patient patient = getPatient(PatientId);
		Disease disease = getDisease(diseaseId);
		if (patient == null) {
			throw new IllegalArgumentException("Invalid Patient Id !");
		}
		if (disease == null) {
			throw new IllegalArgumentException("Invalid Disease Id !");
		}
		patient.addDiseasId(disease.getDiseaseId());
		
	}

	public void addExposureToPatient(UUID PatientId, Exposure exposure) {
		int count=0;
		Patient patientt=null;
		for (Patient p : patient) {
			if (p.patientId == patientld) {
				patientt=p;
				count=1;
			}
		}
		if(count==0)
		{
			throw new IllegalArgumentException("Patient not Found");
		}
		else {
			ps.addExposure(exposure);
		}
	}
		
	}

}
