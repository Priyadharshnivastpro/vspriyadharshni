package edu.disease.asn2;

	import java.util.Arrays;
	import java.util.Iterator;
	import java.util.TreeSet;
	import java.util.UUID;

	import edu.disease.asn1.Exposure;

	public class Patient implements Comparable<Patient> {
		UUID patientId;
		String firstName;
		String lastName;
		Exposure[] exposures;
		UUID[] diseaseIds;
		int count = 0, count1 = 0;

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
			//System.out.println(list);
			
			Iterator iter=list.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}

		}

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
			// TODO Auto-generated constructor stub
		}

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

		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
			return result;
		}

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

		public String toString() {
			return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName;
					
		}

		public int compareTo(Patient o) {
			int isEqual=this.lastName.compareToIgnoreCase(o.lastName);
			if(isEqual!=0) {
				return isEqual;
			}
			else {
				return this.firstName.compareToIgnoreCase(o.firstName);
			}
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

		

	
}
