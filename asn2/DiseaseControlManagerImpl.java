package edu.disease.asn2;

	import java.util.UUID;


	import edu.disease.asn1.Exposure;

	
	/**
	 * Implementation of the DiseaseControlManager interface for managing diseases and patients.
	 */
	public  class DiseaseControlManagerImpl implements DiseaseControlManager {
		
		private static Disease[] diseases;
		private static Patient[] patients;
		int maxDiseases;
		int maxPatients;
		int diseasearraycount =0;
		int patientarraycount =0;
		
		 /**
	     * Constructs a DiseaseControlManagerImpl instance with the maximum number of diseases and patients.
	     *
	     * @param maxDiseases The maximum number of diseases.
	     * @param maxPatients The maximum number of patients.
	     */
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
		/**
	     * Adds a disease with the given name and infectiosity status.
	     *
	     * @param name       The name of the disease.
	     * @param Infectious Whether the disease is infectious (true) or not (false).
	     * @return The created Disease instance.
	     * @throws IllegalStateException If no more diseases can be added.
	     */
		public Disease addDisease(String name, Boolean Infectious) {
			if (maxDiseases < maxDiseases) {
				if (Infectious) {
					return diseases[maxDiseases++] = new InfectiousDisease();
				} else {
					return diseases[maxDiseases++] = new NonInfectiousDisease();
				}
			} else {
				throw new IllegalStateException("No more Disease can be Added !");
			}
		}
		/**
	     * Retrieves a disease based on its unique identifier.
	     *
	     * @param diseaseid The unique identifier of the disease.
	     * @return The Disease instance corresponding to the given identifier, or null if not found.
	     */
		public Disease getDisease(UUID diseaseid) {
			for (int i = 0; i < maxDiseases; i++) {
				if ((diseases[i].getDiseaseId()).equals(diseaseid)) {
					return diseases[i];
				}
			}
			return null;
		}
		/**
	     * Adds a patient with the provided first name, last name, maximum number of diseases, and maximum exposure.
	     *
	     * @param firstname   The first name of the patient.
	     * @param lastname    The last name of the patient.
	     * @param Maxdiseases The maximum number of diseases the patient can have.
	     * @param MaxExposure The maximum number of exposures the patient can have.
	     * @return The created Patient instance.
	     * @throws IllegalStateException If no more patients can be added.
	     */	
		public Patient addPatient(String firstname, String lastname, int Maxdiseases, int MaxExposure) {
			if (maxPatients<=patientarraycount) {
				throw new IllegalStateException("No more Patients can be added");
			} else {
				patients[patientarraycount]=new Patient(maxDiseases, MaxExposure);
				patients[patientarraycount].lastName=lastname;
				patients[patientarraycount].firstName=firstname;
				return patients[patientarraycount++];
			}	
		}

		public Patient getPatient(UUID patient) {

			for(Patient p: patients) {
				p.patientId=patient;
					return p;
				}
			
			return null;
		}

		/**
	     * Adds a disease to a patient.
	     *
	     * @param PatientId The unique identifier of the patient.
	     * @param diseaseId The unique identifier of the disease to be added.
	     * @throws IllegalArgumentException If the patient or disease with the given identifiers are not found.
	     */
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

		/**
	     * Adds an exposure to a patient.
	     *
	     * @param PatientId The unique identifier of the patient.
	     * @param exposure  The exposure to be added.
	     * @throws IllegalArgumentException If the patient is not found.
	     */
		public void ExposureToPatient(UUID PatientId, Exposure exposure) {
			int count=0;
			Patient patientt=null;
			for (Patient p : patients) {
				if (p.getPatientId() == PatientId) {
					patientt=p;
					count=1;
				}
			}
			if(count==0)
			{
				throw new IllegalArgumentException("Patient not Found");
			}
			else {
				patientt.addExposure(exposure);
			}
			
		}
		
		}



