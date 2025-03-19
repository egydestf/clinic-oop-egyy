# <h1 align="center">Clinic Management System - Java OOP Assignment</h1>

<p align="center">Egy Destiar Firmandani</p>
<p align="center">2311110061</p>

## 📌 Project Overview
The **Clinic Management System** is a Java-based project implementing **Encapsulation, Packages, and Class Relationships**. This project simulates a clinic management system where hospital staff can securely handle patient, doctor, and appointment data.

## 📂 Project Structure
```
clinic-oop-egyy/
├── src/
│   └── Guided/
│   └── Unguided/           # Root package
│   |   └── entities/       # Core classes
│   |   |   ├── Doctor.java
│   |   |   ├── Patient.java
│   |   |   └── Appointment.java
|   |   └── utils/          # Utility classes
|   |       └── DataChecker.java
|   └── Main.java           # Entry point program 
└── README.md               # Documentatiton
```

## 🔎 Class Preview
### 1️⃣ Entities
- **Doctor.java**
```java
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
```

- **Patient.java**
```java
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
```

- **Appointment.java**
```java
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
```

### 2️⃣ Utils
- **DataChecker.java**
```java
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
```

### 🈁 Main Program
- **Main.java**
```java
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
```

## 🔥 Features
- **Encapsulation**:
  - The `Patient` class has private fields for personal data (e.g., name, age, and diagnosis) and provides controlled access methods (getters and setters).
  - The `Doctor` class maintains private attributes such as name and specialty, ensuring controlled access.
  - Sensitive data such as diagnoses are protected using encapsulation principles.
  
- **Packages**:
  - The project follows a structured package implementation with `Unguided.entities` for core classes and `Unguided.utils` for utility functions.
  - This modular structure ensures scalability and maintainability.
  
- **Class Relationships**:
  - The `Appointment` class establishes an association between `Doctor` and `Patient`, linking them together.
  - The `DataChecker` class acts as a verification tool to validate the patient's diagnosis and enhance data integrity.
  
## 🛠️ Installation & Usage
### 1️⃣ Clone Repository
```sh
git clone https://github.com/yourusername/clinic-oop-egyy.git
cd clinic-oop-egyy/src
```
### 2️⃣ Compile & Run
```sh
javac -d . Unguided/entities/*.java Unguided/utils/*.java Main.java
java Main
```

## 📜 Expected Output
![Image](https://github.com/user-attachments/assets/9d26969c-7edd-4b01-a2c0-85100ce24f4e)

## 📖 Author
- **Egy Destiar** - [GitHub Profile](https://github.com/egydestf)

## 🐉 Bonus Content
- **Dr. Wei Shen pict**
![Image](https://github.com/user-attachments/assets/c9ed2653-3340-4175-bf02-b9784bc712a1)

- **James Hong (Uncle Po) pict**
![Image](https://github.com/user-attachments/assets/31e5c585-0913-48d1-b666-f51aa849aeaf)
