package csi142.app;
import csi142.data.DataStore;
import csi142.model.Patient;
import csi142.model.VaccinationRecord;
import java.util.Scanner;

public class MainApp{
    static Scanner in = new Scanner(System.in);
    public static void main (String[]args){
    
    int num;
    do{
         System.out.println("1)Register Patients 2)View Patients 3)add Vaccination Records 4)view Vaccination Records 0)Exit");
    num= in.nextInt();
    in.nextLine();

    switch (num) {
        case 1:
            addPatient();
            break;
        case 2:
            viewPatients();
            break;
         case 3:
            addRecord();
            break;
         case 4:
            viewRecords();
            break;
         case 0:
            System.out.println("Goodbye");
            break;
        default:
            System.out.println("Error: Please enter one of the number options");
      }
    } while(num !=0);
}
    public static void addPatient(){
        System.out.println("Enter ID");
        String id = in.nextLine();

        System.out.println("Enter Name");
        String name = in.nextLine();

        System.out.println("Enter Age");
        int age = in.nextInt();
        in.nextLine();

        System.out.println("Enter Contact");
        String contact = in.nextLine();

        Patient p = new Patient(id, name, age, contact);
        DataStore.addPatient(p);

        System.out.println("Patient added!");
    }

    public static void addRecord(){
        System.out.println("Enter Patient ID: ");
        String patientID = in.nextLine();

        System.out.println("Enter Vaccine Name");
        String vaccineName= in.nextLine();

        System.out.println("Enter Date:");
        String date = in.nextLine();

        VaccinationRecord r = new VaccinationRecord(patientID, vaccineName, date);
        DataStore.addRecord(r);

        System.out.println("Record added!");
    }

    public static void viewPatients(){
        for (Patient p : DataStore.getPatients()){
            System.out.println(p);
        }
    }

    public static void viewRecords(){
        for (VaccinationRecord r : DataStore.getRecords()) {
            System.out.println(r);
        }
    }      
}
