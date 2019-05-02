package patient;

import java.util.ArrayList;
import java.util.List;

public abstract class Queue {
    //If you have Patients you can create an abstract Queue class. It will hold the patients waiting for treatment.
    protected List<Patient> patients = new ArrayList<>();

    //It should have a method to add Patients to the queue.
    public void addPatient(Patient newPatient) {
        patients.add(newPatient);
    }

    // I have moved this here so that all children can reach it
    // because both of them need it

    public void removeHealthyPatients() {
        List<Patient> helthyPatients = new ArrayList<>();

        // Collect all the healthy patients:
        for (Patient patient : patients) {
            if (patient.getDiseaseSeverity() == 0) {
                helthyPatients.add(patient);
            }
        }
        //remove all healthy patients from the original list
        for (Patient healthyOne : helthyPatients) {
            patients.remove(healthyOne);
        }
    }

    public abstract Patient getNextPatient();
}

