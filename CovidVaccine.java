package csi142.model;

public class CovidVaccine extends Vaccine{
    
    public CovidVaccine(String Vname, String vaccineID, int doseRequired, int doseIntervals){
        super(Vname, vaccineID, doseRequired, doseIntervals);
    }

    @Override 
    public boolean safeForAge(int age) {
        return age >= 12;
    }

}
