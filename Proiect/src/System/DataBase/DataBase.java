package System.DataBase;

import System.Office.*;
import System.persistence.CSVReader;
import System.persistence.CSVWriter;
import org.omg.CORBA.INTERNAL;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DataBase {
    private static String PatientsCSV = "Patients.csv";
    private static String DoctorsCSV = "Doctors.csv";
    private static String PrescriptionsCSV = "Prescriptions.csv";
    private static String MedicalOfficesCSV = "MedicalOffices.csv"; // ??

    private static List<Patient> patients = new ArrayList<Patient>();
    private static List<Doctor> doctors = new ArrayList<Doctor>();
    private static List<Prescription> prescriptions = new ArrayList<Prescription>();
    private static List<MedicalOffice> medicalOffices = new ArrayList<MedicalOffice>();

    public static void importPatients(){
        CSVReader csvReader = new CSVReader(PatientsCSV);
        csvReader.readCSV();
        for(String[] line: csvReader.getData()){
            if(line.length != 0){
                patients.add(new Patient(line[0], Double.parseDouble(line[1])));
            }
        }
    }
    public static void savePatients(){
        CSVWriter csvWriter = new CSVWriter(PatientsCSV);
        for(Patient temp: patients){
            csvWriter.write(temp.toStringCsv());
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }

    public static List<Patient> getPatients() {
        return patients;
    }
   /* public int addPatient(Patient patient){

        return 1;
    }*/



    public static void importDoctors(){
        CSVReader csvReader = new CSVReader(DoctorsCSV);
        csvReader.readCSV();
        for(String[] line: csvReader.getData()){
            if(line.length != 0){
               doctors.add(new Doctor(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2])));
            }
        }
    }
    public static void saveDoctors(){
        CSVWriter csvWriter = new CSVWriter(PatientsCSV);
        for(Doctor temp: doctors){
            csvWriter.write((temp.toStringCsv()));
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }

    public static List<Doctor> getDoctors() {
        return doctors;
    }
   /* public int addPatient(Patient patient){

        return 1;
    }*/



    public static void importPrescriptions(){
        CSVReader csvReader = new CSVReader(PrescriptionsCSV);
        csvReader.readCSV();
        for(String[] line: csvReader.getData()){
            if(line.length != 0){
                prescriptions.add(new Prescription(line[0], line[1], line[2], line[3], line[4]));
            }
        }
    }
    public static void savePersonnel(){
        CSVWriter csvWriter = new CSVWriter(PatientsCSV);
        for(Prescription temp: prescriptions){
            csvWriter.write((temp.toStringCsv()));
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }

    public static List<Prescription> getPersonnel() {
        return prescriptions;
    }
   /* public int addPatient(Patient patient){

        return 1;
    }*/



    public static void importMedicalOffices(){
        CSVReader csvReader = new CSVReader(MedicalOfficesCSV);
        csvReader.readCSV();
        for(String[] line: csvReader.getData()){
            if(line.length != 0){
                medicalOffices.add(new MedicalOffice(line[0], line[1], Integer.parseInt(line[2])));
            }
        }
    }
    public static void saveMedicalOffices(){
        CSVWriter csvWriter = new CSVWriter(MedicalOfficesCSV);
        for(MedicalOffice temp: medicalOffices){
            csvWriter.write((temp.toStringCsv()));
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }

    public static List<MedicalOffice> getMedicalOffices() {
        return medicalOffices;
    }
   /* public int addPatient(Patient patient){

        return 1;
    }*/

}
