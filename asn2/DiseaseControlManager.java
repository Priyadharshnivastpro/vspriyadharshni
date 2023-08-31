package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;



/**
 * Represents a Disease Control Manager interface for managing diseases and patients.
 */
public interface DiseaseControlManager {

	/**
     * Adds a disease with the given name and infectiosity status.
     *
     * @param name       The name of the disease.
     * @param Infectious Whether the disease is infectious (true) or not (false).
     * @return The created Disease instance.
     */
public Disease addDisease(String name,Boolean Infectious);
/**
 * Retrieves a disease based on its unique identifier.
 *
 * @param diseaseId The unique identifier of the disease.
 * @return The Disease instance corresponding to the given identifier.
 */
public Disease getDisease(UUID diseaseid);
/**
 * Adds a patient with the provided first name, last name, maximum number of diseases, and maximum exposure.
 *
 * @param firstname     The first name of the patient.
 * @param lastname      The last name of the patient.
 * @param Maxdiseases   The maximum number of diseases the patient can have.
 * @param MaxExposure   The maximum number of exposures the patient can have.
 * @return The created Patient instance.
 */

public Patient addPatient(String firstname,String lastname,int Maxdiseases,int MaxExposure);
/**
 * Retrieves a patient based on their unique identifier.
 *
 * @param patientId The unique identifier of the patient.
 * @return The Patient instance corresponding to the given identifier.
 */
public Patient getPatient(UUID patient);
/**
 * Adds a disease to a patient.
 *
 * @param PatientId The unique identifier of the patient.
 * @param diseaseId The unique identifier of the disease to be added.
 */
public void addDiseaseToPatient(UUID PatientId,UUID diseaseId);
/**
 * Adds an exposure to a patient.
 *
 * @param PatientId The unique identifier of the patient.
 * @param exposure  The exposure to be added.
 */ void ExposureToPatient(UUID PatientId,Exposure exposure);

}