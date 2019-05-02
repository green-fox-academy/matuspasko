package patient;

import java.util.Random;

public class Patient {
    private int diseaseSeverity;

    //The severity is a random number between 1 and 10, you can set it in the constructor or at the field declaration. Keep in mind, the severity cannot go below 0
    public Patient() {
        Random random = new Random();
        diseaseSeverity = random.nextInt(10) + 1; // 1 - 10
    }

    //One to retrieve the severity of the disease.
    public int getDiseaseSeverity() {   // pouzil som na toto getter s cmd + n
        return diseaseSeverity;
    }

    //One to treat the patient, it must decrease the severity by 1.
    public void treatPatient() {
        if (diseaseSeverity > 0) {
            diseaseSeverity -= 1;
        }
    }
}
