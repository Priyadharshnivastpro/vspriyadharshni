package edu.disease.asn3;

import java.util.UUID;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Scanner;



	public class Exposure implements Serializable{
		static Scanner s=new Scanner(System.in);
		private UUID patientId;
		private LocalDateTime time;
		private String exposureType;
		
		
		public Exposure(UUID patientId) {
		   this.patientId = patientId;
		}
		

		public LocalDateTime getTime() {
			return time;
		}
		public void setTime(LocalDateTime time) {
			this.time = time;
		}
		public String getExposure() {
			return exposureType;
		}
		public void setExposure(String exposureType) {
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
				}
			}
		
		public UUID getPatientId() {
			return patientId;
		}
		
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((exposureType == null) ? 0 : exposureType.hashCode());
			result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
			result = prime * result + ((time == null) ? 0 : time.hashCode());
			return result;
		}


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


		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		public void setPatientId( UUID patientId) {
			 this.patientId = patientId;
			
		}

	}

