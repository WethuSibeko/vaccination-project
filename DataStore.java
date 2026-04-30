package csi142.data;

import java.util.ArrayList;
import java.util.List;
import csi142.model.Patient;
import csi142.model.VaccinationRecord;

public class DataStore {

    private static List<Patient> patients = new ArrayList<Patient>();
    private static List<VaccinationRecord> records = new ArrayList<VaccinationRecord>();

    public static void addPatient(Patient patient) {
        patients.add(patient);
    }

    public static List<Patient> getPatients() {
        return patients;
    }

    public static void addRecord(VaccinationRecord record) {
        records.add(record);
    }

    public static List<VaccinationRecord> getRecords() {
        return records;
    }
}
