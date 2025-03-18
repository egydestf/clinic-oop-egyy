package Unguided.entities;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    // Constructor
    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    // Getter doctor
    public Doctor getDoctor() {
        return doctor;
    }

    // Getter patient
    public Patient getPatient() {
        return patient;
    }

    // Getter appointment date
    public String getDate() {
        return date;
    }

    // Display the appointment details
    public void displayAppointmentDetails() {
        System.out.println("\n================ LIGMA CLINIC ================");
        System.out.println("Doctor   : " + doctor.getName() + " (Specialty: " + doctor.getSpecialty() + ")");
        System.out.println("Patient  : " + patient.getName() + " (Age: " + patient.getAge() + ")");
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        System.out.println("----------------------------------------------");
        System.out.println("Appointment Date: " + date);
        System.out.println("----------------------------------------------");
    }
}
