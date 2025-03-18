package Unguided.entities;

public class Doctor {
    private String name;
    private String specialty;

    // Constructor
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Getter doctor name
    public String getName() {
        return name;
    }

    // Getter doctor specialty
    public String getSpecialty() {
        return specialty;
    }
}