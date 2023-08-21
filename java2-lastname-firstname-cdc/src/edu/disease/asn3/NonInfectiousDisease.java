package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn2.Disease;

public class NonInfectiousDisease extends Disease {

	String []  s={"Heart Disease","Diabetes","Thyroid disease","Hypothyroidism","Infectious mononucleosis"};
		
		@Override
		public String[] GetExamples() {
			// TODO Auto-generated method stub
			return s;
		} 
		public  NonInfectiousDisease(UUID diseaseId,String name) {
			super(diseaseId,name);
			
		}
		

	}