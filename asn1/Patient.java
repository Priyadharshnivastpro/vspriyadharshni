package edu.disease.asn1;


import java.util.Arrays;
import java.util.UUID;
/**
 * Represents a patient with associated exposures and disease IDs.
 */
public class Patient {
	UUID patientId;
	String firstName;
	String lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;
	int count=0 ,count1=0;
	
	/**
     * Constructs a Patient instance with the specified maximum number of diseases and exposures.
     *
     * @param maxDiseases    The maximum number of disease IDs that can be associated with the patient.
     * @param maxExposures   The maximum number of exposures that can be associated with the patient.
     */
	public Patient(int maxDiseases,int maxexposures) {
		if(maxDiseases<=0 && maxexposures<=0) {
			try {
				throw new IllegalArgumentException();
			}catch(IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		exposures=new Exposure[maxexposures];
		diseaseIds=new UUID[maxDiseases];
	}

	/**
     * Adds a disease ID to the patient's list of associated disease IDs.
     *
     * @param diseaseId The UUID of the disease to be added.
     */
 public void addDiseasId(UUID diseasesid) {
	if(count==diseaseIds.length)
	{
		try {
			throw new IndexOutOfBoundsException();
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		}
	diseaseIds[count]=diseasesid;
	count++;
	}
 
 /**
  * Adds an exposure to the patient's list of exposures.
  *
  * @param exposure The exposure to be added.
  */
 
public void addExposure(Exposure exposure) {
	if(count1==exposures.length)
	{
		try {
			throw new IndexOutOfBoundsException();
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		}
	exposures[count1]=exposure;
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

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
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
	return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", exposures="
			+ (exposures != null ? Arrays.asList(exposures) : null) + ", diseaseIds="
			+ (diseaseIds != null ? Arrays.asList(diseaseIds) : null) + ", count=" + count + ", count1=" + count1
			+ ", getPatientId()=" + getPatientId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
			+ getLastName() + ", hashCode()=" + hashCode() + "]";
}




}