package Unguided.entities;

public class Patient {
    private String name;
    private int age;
    private String diagnosis;

    // Constructor
    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getter patient name
    public String getName() {
        return name;
    }

    // Getter patient age
    public int getAge() {
        return age;
    }

    // Getter patient diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }
}