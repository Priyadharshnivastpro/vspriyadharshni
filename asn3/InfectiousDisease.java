package edu.disease.asn3;








/**
 * Represents an infectious disease, a subclass of the Disease class.
 */
public class InfectiousDisease extends Disease {
	
		
	 /**
     * An array containing examples of infectious diseases.
     */
		String []  s1={"Cancer","Obesity","Cold","Chickenpox","Allergies"};
		/**
	     * Retrieves an array of examples of infectious diseases.
	     *
	     * @return An array of strings containing examples of infectious diseases.
	     */
		@Override
		public String[] GetExamples() {
			
			return s1;
		}
		/**
	     * Constructs a new InfectiousDisease instance.
	     */
    	public InfectiousDisease() {
			// Constructor implementation
			
		}
		


	}

