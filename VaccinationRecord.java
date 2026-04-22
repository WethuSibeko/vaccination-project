package csi142.model;

public class VaccinationRecord{
private int patientId;
private String vaccineName;
private String date;
  public void VaccinationRecord(int patientId, String vaccineName, String date){
    this.patientId=patientId;
    this.vaccineName=vaccineName;
    this.date=date;
  }   
    public int getPatientId(){
      return patientId
        }
    public String getVaccineName(){
      return vaccineName
        }
    public String getDate(){
      return date
        }
  public String detatils(){
    System.out.println(patientId+" "+ vaccineName+ " "+ date);
  }
