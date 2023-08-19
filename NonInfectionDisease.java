package edu.disease.asn2;

public class NonInfectionDisease extends Disease{

	Disease diseaseid;
	public NoninfectionDisease() {

	}
	
	public NoninfectionDisease(UUID disid,String name) {
		
		super(disid,name);
		

	}
	String []s= {"Heart disease","Stroke","Cancer","Diabetes"};
	@Override
	public String[] getExamples() {

		
		return s;
	}
}
