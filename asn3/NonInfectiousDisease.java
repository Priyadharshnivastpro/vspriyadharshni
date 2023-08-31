package edu.disease.asn3;









/**
 * Represents a non-infectious disease, a subclass of the Disease class.
 */
public class NonInfectiousDisease extends Disease {

	
	/**
     * An array containing examples of non-infectious diseases.
     */
	String []  s={"Heart Disease","Diabetes","Thyroid disease","Hypothyroidism","Infectious mononucleosis"};
		
	
	/**
     * Retrieves an array of examples of non-infectious diseases.
     *
     * @return An array of strings containing examples of non-infectious diseases.
     */
		@Override
		public String[] GetExamples() {
			// TODO Auto-generated method stub
			return s;
		} 
		
		/**
	     * Constructs a new NonInfectiousDisease instance.
	     */
		public NonInfectiousDisease() {
			// Constructor implementation
			
		}
		

	}