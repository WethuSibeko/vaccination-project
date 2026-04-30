package csi142.model;

public abstract class Vaccine{
 private String Vname;
 private int doseRequired;
 private String vaccineID;
 private int doseIntervals;
 
 public Vaccine(String Vname, String vaccineID, int doseRequired, int doseIntervals){
  this.Vname = Vname;
  this.vaccineID = vaccineID;
  this.doseRequired = doseRequired;
  this.doseIntervals = doseIntervals;
}
public String getVaccineID(){
    return vaccineID;
}
public String getVname(){
    return Vname;
}
public int getDoseRequired(){
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

