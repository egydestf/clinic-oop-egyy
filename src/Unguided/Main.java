/**
 *
 * @author egydestf
 */

package Unguided;

import Unguided.entities.*;
import Unguided.utils.DataChecker;

public class Main {
    public static void main(String[] args) {
        // Creating clinic doctor and patient
        Doctor doctor = new Doctor("Dr. Wei Shen", "Cardiology");
        Patient patient = new Patient("James Hong", 60, "Flu");
        
        // Creating an appointment
        Appointment appointment = new Appointment(doctor, patient, "2025-03-16 10:00 AM");
        
        // Displaying appointment details
        appointment.displayAppointmentDetails();
        
        // Using the DataChecker utility
        DataChecker.checkDiagnosis(patient);
    }
}
