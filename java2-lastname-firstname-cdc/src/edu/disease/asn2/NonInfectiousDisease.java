package edu.disease.asn2;

import java.util.UUID;

public class NonInfectiousDisease extends Disease {

	String []  s={"Heart Disease","Diabetes","Thyroid disease","Hypothyroidism","Infectious mononucleosis"};
		
		@Override
		public String[] GetExamples() {
			// TODO Auto-generated method stub
			return s;
		} 
		public NonInfectiousDisease(UUID diseaseId,String name) {
			super(diseaseId,name);
			
		}
		

	}

