package edu.disease.asn1;

import java.util.UUID;

	
public class Disease {
	    UUID diseaseId;
	    String Name;
	    
	    
		public Disease(UUID diseaseId, String name) {
			super();
			this.diseaseId = diseaseId;
			Name = name;
		}
		public UUID getDiseaseId() {
			return diseaseId;
		}
		public void setDiseaseId(UUID diseaseId) {
			this.diseaseId = diseaseId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
			return result;
		}
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
		@Override
		public String toString() {
			return "Disease [diseaseId=" + diseaseId + ", Name=" + Name + "]";
		}
	}



