package csi142.model;

public class Patient{
private String id;
private String name;
private int age;
private String contact;
   public void Patient(String id, String name, int age, String contact ){
        this.id=id;
        this.name=name;
        this.age=age;
        this.contact=contact;
}
   public String getID(){
      return id;
   }
   public String getName(){
      return name;
   }
   public String getContact(){
      return contact;
   }
   public int getAge(){
      return age;
   }
   public String details() { 
       System.out.println(patientID + " " + patientName + " " + patientAge);
    }
