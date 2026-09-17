import doctor.Doctor;
import patient.Patient;

public class Main {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Dr. Ravi", "Cardiology", 800);
        Doctor d2 = new Doctor(2, "Dr. Priya", "Dermatology", 600);

        Patient p1 = new Patient(101, "Arun", "Heart Problem", 45);
        Patient p2 = new Patient(102, "Kumar", "Skin Allergy", 30);
        Patient p3 = new Patient(103, "Rahul", "Heart Problem", 50);

        int d1Patients = 0;
        int d2Patients = 0;

        System.out.println("===== PATIENT DETAILS =====");

        System.out.println("\nPatient 1:");
        p1.display();

        if (p1.getDisease().equals("Heart Problem")) {
            System.out.println("Doctor Treating: " + d1.getName());
            d1Patients++;
        }

        System.out.println("\nPatient 2:");
        p2.display();

        if (p2.getDisease().equals("Skin Allergy")) {
            System.out.println("Doctor Treating: " + d2.getName());
            d2Patients++;
        }

        System.out.println("\nPatient 3:");
        p3.display();

        if (p3.getDisease().equals("Heart Problem")) {
            System.out.println("Doctor Treating: " + d1.getName());
            d1Patients++;
        }

        double total1 = d1Patients * d1.getConsultationFee();
        double total2 = d2Patients * d2.getConsultationFee();

        System.out.println("\n===== DOCTOR DETAILS =====");

        d1.display();
        System.out.println("Patients Assigned : " + d1Patients);
        System.out.println("Total Fee         : Rs." + total1);

        System.out.println();

        d2.display();
        System.out.println("Patients Assigned : " + d2Patients);
        System.out.println("Total Fee         : Rs." + total2);
    }
}