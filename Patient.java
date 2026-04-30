package csi142.model;

public class Patient{
private String id;
private String name;
private int age;
private String contact;

public Patient(String id, String name, int age, String contact ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
}
   public String getId(){
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
 @Override
   public String toString() {
    return "Patient ID: " + id +
           ", Name: " + name +
           ", Age: " + age +
           ", Contact: " + contact;
}
   }
