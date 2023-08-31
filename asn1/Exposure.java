 package edu.disease.asn1;
	
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Represents an exposure event for a patient.
 */
public class Exposure {
     	static Scanner s=new Scanner(System.in);
		private UUID patientId;
		private LocalDateTime time;
		private String exposureType;
		
		 /**
	     * Constructs an Exposure instance with the given patient ID.
	     *
	     * @param patientId The UUID of the patient associated with the exposure.
	     */		
		public Exposure(UUID patientId) {
		   this.patientId = patientId;
		}
		
		/**
	     * Gets the time of the exposure event.
	     *
	     * @return The LocalDateTime of the exposure event.
	     */
		public LocalDateTime getTime() {
			return time;
		}
		/**
	     * Sets the time of the exposure event.
	     *
	     * @param time The LocalDateTime of the exposure event.
	     */
		public void setTime(LocalDateTime time) {
			this.time = time;
		}
		 /**
	     * Gets the type of exposure.
	     *
	     * @return The exposure type.
	     */
		public String getExposure() {
			return exposureType;
		}
		/**
	     * Sets the type of exposure.
	     * If the provided exposure type is not valid, an exception is thrown.
	     *
	     * @param exposureType The exposure type ("D" for direct, "I" for indirect).
	     */
		public void setExposure(String exposureType) {
			if(exposureType!=null) {
			this.exposureType = exposureType;
			if(exposureType.equalsIgnoreCase("D")) {
				this.exposureType="D";
			} else if(exposureType.equals("I")) {
				this.exposureType="I";
			} else {
				try {
					throw new IllegalArgumentException();
				} catch(IllegalArgumentException e) {
					e.printStackTrace();
				}
			}}
				
			
		}
		 /**
	     * Gets the UUID of the patient associated with the exposure.
	     *
	     * @return The UUID of the patient.
	     */
		
		public UUID getPatientId() {
			return patientId;
		}
		
		/**
	     * Returns a hash code value for the Exposure object.
	     *
	     * @return The hash code value.
	     */
		
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((exposureType == null) ? 0 : exposureType.hashCode());
			result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
			result = prime * result + ((time == null) ? 0 : time.hashCode());
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
			Exposure other = (Exposure) obj;
			if (exposureType == null) {
				if (other.exposureType != null)
					return false;
			} else if (!exposureType.equals(other.exposureType))
				return false;
			if (patientId == null) {
				if (other.patientId != null)
					return false;
			} else if (!patientId.equals(other.patientId))
				return false;
			if (time == null) {
				if (other.time != null)
					return false;
			} else if (!time.equals(other.time))
				return false;
			return true;
		}

		/**
	     * Returns a string representation of the object.
	     *
	     * @return A string representation of the object.
	     */
		
		public String toString() {
			
			return super.toString();
		}
		/**
	     * Sets the patient ID associated with the exposure.
	     *
	     * @param patientId The UUID of the patient.
	     */
		public void setPatientId( UUID patientId) {
			 this.patientId = patientId;
			
		}

	}

