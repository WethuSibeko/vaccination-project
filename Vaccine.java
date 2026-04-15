package csi142.model;

public class Vaccine{
 private String name;
 private double doseRequired;
 private String vaccineID;
 
 public Vaccine(String name, String vaccineID, double doseRequired){
  this.name = name;
  this.vaccineID = vaccineID;
  this.doseRequired = doseRequired;
}
