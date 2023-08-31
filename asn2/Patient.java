package edu.disease.asn2;

	import java.util.Iterator;

	import java.util.TreeSet;
	import java.util.UUID;

	import edu.disease.asn1.Exposure;
	
	/**
	 * Represents a patient with associated exposures and disease IDs.
	 */
	public class Patient implements Comparable<Patient> {
		UUID patientId;
		String firstName;
		String lastName;
		Exposure[] exposures;
		UUID[] diseaseIds;
		int count = 0, count1 = 0;

		
		// Constructors, getters, setters, and compareTo method
		public static void main(String[] args) {

			Patient p = new Patient();
			p.setLastName("Malar");
			p.setFirstName("Vel");
			Patient p1 = new Patient();
			p1.setLastName("kumari");
			p1.setFirstName("Anjali");
			Patient p2 = new Patient();
			p2.setLastName("G");
			p2.setFirstName("Naren");
			Patient p3 = new Patient();
			p3.setLastName("Hari");
			p3.setFirstName("Haran");
			
			TreeSet<Patient> list =new TreeSet<Patient>();
			list.add(p);
			list.add(p1);
			list.add(p2);
			list.add(p3);
			
			
			Iterator<Patient> iter=list.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}

		}
		/**
	     * Constructs a Patient instance with the specified maximum number of diseases and exposures.
	     *
	     * @param maxDiseases    The maximum number of disease IDs that can be associated with the patient.
	     * @param maxExposures   The maximum number of exposures that can be associated with the patient.
	     */
		public Patient(int maxDiseases, int maxexposures) {
			if (maxDiseases <= 0 && maxexposures <= 0) {
				try {
					throw new IllegalArgumentException();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}
			}
			exposures = new Exposure[maxexposures];
			diseaseIds = new UUID[maxDiseases];
		}

		public Patient() {
			
		}
		/**
	     * Adds a disease ID to the patient's list of associated disease IDs.
	     *
	     * @param diseaseId The UUID of the disease to be added.
	     */
	 

		public void addDiseasId(UUID diseasesid) {
			if (count == diseaseIds.length) {
				try {
					throw new IndexOutOfBoundsException();
				} catch (IndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}
			diseaseIds[count] = diseasesid;
			count++;
		}
		/**
		  * Adds an exposure to the patient's list of exposures.
		  *
		  * @param exposure The exposure to be added.
		  */
		public void addExposure(Exposure exposure) {
			if (count1 == exposures.length) {
				try {
					throw new IndexOutOfBoundsException();
				} catch (IndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}
			exposures[count1] = exposure;
			count1++;
		}

		//Getters and setters for patient ID, first name, last name, exposures, and disease IDs
		public UUID getPatientId() {
			return patientId;
		}

		public void setPatientId(UUID patientId) {
			this.patientId = patientId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Exposure[] getExposures() {
			return exposures;
		}

		public void setExposures(Exposure[] exposures) {
			this.exposures = exposures;
		}

		public UUID[] getDiseaseIds() {
			return diseaseIds;
		}

		public void setDiseaseIds(UUID[] diseaseIds) {
			this.diseaseIds = diseaseIds;
		}

		/**
		 * Returns a hash code value for the Patient object.
		 *
		 * @return The hash code value.
		 */
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
			return result;
		}
		/**
		 * Indicates whether some other object is equal to this one.
		 *
		 * @param obj The reference object with which to compare.
		 * @return `true` if this object is the same as the obj argument; `false` otherwise.
		 */
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Patient other = (Patient) obj;
			if (patientId == null) {
				if (other.patientId != null)
					return false;
			} else if (!patientId.equals(other.patientId))
				return false;
			return true;
		}

		/**
		 * Returns a string representation of the object.
		 *
		 * @return A string representation of the object.
		 */
		public String toString() {
			return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName;
					
		}
		
		/**
		 * Compares this Patient object with another Patient object for order based on last name and first name.
		 * 
		 * @param o The Patient object to be compared.
		 * @return A negative integer, zero, or a positive integer as this Patient is less than, equal to, or greater than the specified Patient.
		 */

		public int compareTo(Patient o) {
			// Compare last names ignoring case
			int isEqual=this.lastName.compareToIgnoreCase(o.lastName);
			
			if(isEqual!=0) {
				return isEqual;
			}
			else {
				// If last names are equal, compare first names ignoring case
				return this.firstName.compareToIgnoreCase(o.firstName);
			}
		}

		

		

	
}
