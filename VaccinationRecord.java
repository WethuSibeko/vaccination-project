package csi142.model;

public class VaccinationRecord {
    private String patientId;
    private String vaccineName;
    private String date;

    public VaccinationRecord(String patientId, String vaccineName, String date) {
        this.patientId = patientId;
        this.vaccineName = vaccineName;
        this.date = date;
    }
    public String getPatientId(){
      return patientId;
        }
    public String getVaccineName(){
      return vaccineName;
        }
    public String getDate(){
      return date;
        }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
               ", Vaccine: " + vaccineName +
               ", Date: " + date;
    }
}
