package csi142.model;

public abstract class Vaccine{
 private String Vname;
 private double doseRequired;
 private String vaccineID;
 private int doseIntervals;
 
 public Vaccine(String Vname, String vaccineID, double doseRequired, int doseIntervals){
  this.Vname = Vname;
  this.vaccineID = vaccineID;
  this.doseRequired = doseRequired;
  this.doseIntervals = doseIntervals;
}
public String getvaccineID(){
    return vaccineID;
}
public String getVname(){
    return Vname;
}
public double getDoseRequired(){
    return doseRequired;
}
public int getDoseIntervals(){
    return doseIntervals;
}
 public abstract boolean safeForAge(int age);
 
public void Vdetails(){
    System.out.println(vaccineID + " " + Vname + "Dose required: " + doseRequired + " Booster every " + doseIntervals + "days");
}

}

