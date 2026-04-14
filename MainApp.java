package csi142.app;
import java.util.Scanner;

public class MainApp{
    public static void main (String[]args){
    Scanner in= new Scanner(System.in);
    int num;
    do{
         System.out.println("1)Register Patients 2)View Patients 3)add Vaccination Records 4)view Vaccination Records 0)Exit");
    num= in.nextInt();
    switch (num) {
        case 1:
            //call method to register
            break;
        case 2:
            // call method to display patients
            break;
         case 3:
            //call method to add vaccination records
            break;
         case 4:
            //call method to view vaccination records 
            break;
         case 0:
            System.out.println("Bye");
            break;
        default:
            System.out.println("Please enter one of the number options");
      }
    } while(num !=0);
}
}