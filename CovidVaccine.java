package csi142.model;

public class CovidVaccine extends Vaccine{
    
    public CovidVaccine(String vName, String vaccineID, int doseRequired, int doseIntervals){
        super(vName, vaccineID, doseRequired, doseIntervals);
    }

    @Override 
    public boolean safeForAge(int age) {
        return age >= 12;
    }

}
