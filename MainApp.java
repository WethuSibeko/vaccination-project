package csi142.app;
import java.util.Scanner;

public class MainApp{
    public static void main (String[]args){
    Scanner in = new Scanner(System.in);
    int num;
    do{
         System.out.println("1)Register Patients 2)View Patients 3)add Vaccination Records 4)view Vaccination Records 0)Exit");
    num= in.nextInt();
    switch (num) {
        case 1:
            //call method to register patients
            addPatient();
            break;
        case 2:
            // call method to display patients
            viewPatients();
            break;
         case 3:
            //call method to add vaccination records
            addRecord();
            break;
         case 4:
            //call method to view vaccination records 
            viewRecord();
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
        System.out.print("Enter ID");
        String id = scanner.nextLine();

        System.out.print("Enter Name");
        String name = scanner.nextLine();

        System.out.print("Enter Age");
        int age = scanner.nextInt();
        scanner.nextLine();

        Patient p = new Patient(id, name, age);
        DataStore.patients.add(p);

        System.out.println("Patient added!");
    }

    public static void addRecord(){
        System.out.print("Enter Patient ID: ")
            String patientId= scanner.nextLine();

        System.out.print("Enter Vaccine Name");
        String vaccineName= scanner.nextLine();

        System.out.print("Enter Date:"):
            String date = scanner.nextLine();

        VaccinationRecord record = new VaccinationRecord(patinteId, vaccineName, date);
        DataStore.records.add(record);

        System.out.println("Record added!");
    }

    public static void viewPatients(){
        for (Patient p: DataStore.patients){
            System.out.println(p);
        }
    }

    public static void viewRecords(){
        for (VaccinationRecord r: 
             DataStore.records) {

            System.out.println(r);
        }
    }      
}
