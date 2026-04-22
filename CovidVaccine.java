package csi142.model;

public class CovidVaccine extends Vaccine {
    
    public CovidVaccine(String Vname, String vaccineID, double doseRequired, int doseIntevarls){
        super(Vname, vaccineID, doseRequired, doseIntevarls);
    }

    @override 
    public boolean safeForAge(int age) {
        return age >= 12;
    }

}