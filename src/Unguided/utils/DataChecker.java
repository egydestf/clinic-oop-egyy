/**
* Checks if the patient's diagnosis is sensitive and should be handled carefully.
* @param patient The patient whose diagnosis is being checked.
*/

package Unguided.utils;

import Unguided.entities.Patient;

public class DataChecker {
    public static void checkDiagnosis(Patient patient) {
        System.out.println("Diagnosis Info: ");
        if (patient.getDiagnosis().equalsIgnoreCase("Flu")) {
            System.out.println("The diagnosis is common and not sensitive.");
        } else {
            System.out.println("Sensitive diagnosis detected. Please handle with care!");
        }
        System.out.println("==============================================\n");
    }
}
