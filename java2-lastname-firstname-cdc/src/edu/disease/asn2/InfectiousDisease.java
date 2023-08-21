package edu.disease.asn2;

import java.util.UUID;

public class InfectiousDisease extends Disease{
	
		
		
		String []  s1={"Cancer","Obesity","Cold","Chickenpox","Allergies"};

		@Override
		public String[] GetExamples() {
			// TODO Auto-generated method stub
			return s1;
		}
		public InfectiousDisease(UUID diseaseId,String name) {
			super(diseaseId,name);
			
		}
		
		


	}


