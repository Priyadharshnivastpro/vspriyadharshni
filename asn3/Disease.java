package edu.disease.asn3;



import java.io.Serializable;

import java.util.UUID;



		
	public abstract class Disease implements Serializable {
		    UUID diseaseId;
		    String Name;
		    
		    
		    /**
		     * Gets the UUID of the disease.
		     *
		     * @return The UUID of the disease.
		     */
			
			public UUID getDiseaseId() {
				return diseaseId;
			}
			/**
		     * Sets the UUID of the disease.
		     *
		     * @param diseaseId The UUID to set for the disease.
		     */
			public void setDiseaseId(UUID diseaseId) {
				this.diseaseId = diseaseId;
			}
			/**
		     * Gets the name of the disease.
		     *
		     * @return The name of the disease.
		     */
			public String getName() {
				return Name;
			}
			/**
		     * Sets the name of the disease.
		     *
		     * @param name The name to set for the disease.
		     */
			public void setName(String name) {
				Name = name;
			}
			/**
		     * Returns a hash code value for the Disease object.
		     *
		     * @return The hash code value.
		     */
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
				return result;
			}
			/**
		     * Indicates whether some other object is equal to this one.
		     *
		     * @param obj The reference object with which to compare.
		     * @return `true` if this object is the same as the obj argument; `false` otherwise.
		     */
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Disease other = (Disease) obj;
				if (diseaseId == null) {
					if (other.diseaseId != null)
						return false;
				} else if (!diseaseId.equals(other.diseaseId))
					return false;
				return true;
			}
			/**
		     * Returns a string representation of the object.
		     *
		     * @return A string representation of the object.
		     */
			@Override
			public String toString() {
	 	return "Disease [diseaseId=" + diseaseId + ", Name=" + Name + "]";
				
			
			}
			public abstract String[] GetExamples();
			
			
		}






