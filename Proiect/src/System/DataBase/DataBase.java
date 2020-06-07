package System.DataBase;

import System.Office.*;
import System.persistence.Audit;
import System.persistence.CSVReader;
import System.persistence.CSVWriter;
import org.omg.CORBA.INTERNAL;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;

public class DataBase {
    private static String PatientsCSV = "Patients.csv";
    private static String DoctorsCSV = "Doctors.csv";
    private static String PrescriptionsCSV = "Prescriptions.csv";
    private static String AssistantsCSV = "Assistants.csv"; // ??
    private static final Audit audit = new Audit();

    private static ArrayList<Patient> patients = new ArrayList<Patient>();
    private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private static ArrayList<Prescription> prescriptions = new ArrayList<Prescription>();
    private static ArrayList<Assistant> assistants = new ArrayList<Assistant>();

    // PATIENTS
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
        CSVWriter csvWriter = new CSVWriter(PatientsCSV, false);
        for(Patient temp: patients){
            csvWriter.write(temp.toStringCsv());
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }
    public Optional<Patient> getPatientByName(String name){
       // System.out.println(patients.stream().filter(patients -> patients.getName().equals(name)).findFirst());
        return patients.stream().filter(patients -> patients.getName().equals(name)).findFirst();
    }
    public static void addPatient(Patient patient){
        patients.add(new Patient(patient.getName(), patient.getAge()));
        savePatients();
        audit.insertAction(patient.toString(), PatientsCSV);
    }

    //public int updatePatientByName(String name, Patient patient) {
    //    patients.toArray();
      //  return patients.map(patients -> {
        //    int indexPatientToUpdate = patients.;
           // if(indexOfSaleToUpdate >= 0) {
                //patients.set(indexOfSaleToUpdate, new Patient(sale.getTicket(), client));
            //    return 1;
           // }
//        }).orElse(0);
  //  }
    public void deletePatientInsertion(String patientName) {
        Optional<Patient> patientToDelete = getPatientByName(patientName);
       // System.out.println(patientToDelete.get());
        try{
            patients.remove(patientToDelete.get());
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }

       // System.out.println(patients);
        savePatients();
        audit.deleteAction(patientName.toString(), PatientsCSV);
    }
    public static List<Patient> getPatients() {
        return patients;
    }



    // DOCTORS
    public static void importDoctors(){
        CSVReader csvReader = new CSVReader(DoctorsCSV);
        csvReader.readCSV();
        for(String[] line: csvReader.getData()){
            if(line.length != 0){
               doctors.add(new Doctor(Integer.parseInt(line[0]), line[1]));
            }
        }
    }
    public static void saveDoctors(){
        CSVWriter csvWriter = new CSVWriter(DoctorsCSV, false);
        for(Doctor temp: doctors){
            csvWriter.write((temp.toStringCsv()));
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }
    public Optional<Doctor> getDoctorByName(String name) {
        return doctors.stream().filter(doctors -> doctors.getName().equals(name)).findFirst();
    }

    public static void addDoctor(Doctor doctor){
        doctors.add(new Doctor(doctor.getId(), doctor.getName()));
        saveDoctors();
        audit.insertAction(doctor.toString(), DoctorsCSV);
    }
    public void deleteDoctorInsertion(String doctorName) {
        Optional<Doctor> doctorToDelete = getDoctorByName(doctorName);
        try{
            doctors.remove(doctorToDelete.get());
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        saveDoctors();
        audit.deleteAction(doctorName.toString(), DoctorsCSV);
    }
    public static List<Doctor> getDoctors() {
        return doctors;
    }


    // PRESCRIPTIONS
    public static void importPrescriptions(){
        CSVReader csvReader = new CSVReader(PrescriptionsCSV);
        csvReader.readCSV();
        for(String[] line: csvReader.getData()){
            if(line.length != 0){
                prescriptions.add(new Prescription(line[0], line[1], line[2], line[3], line[4]));
            }
        }
    }
    public static void savePrescriptions(){
        CSVWriter csvWriter = new CSVWriter(PrescriptionsCSV, false);
        for(Prescription temp: prescriptions){
            csvWriter.write((temp.toStringCsv()));
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }

    public Optional<Prescription> getPrescriptionByDate(String date) {
        return prescriptions.stream().filter(prescriptions -> prescriptions.getDate().equals(date)).findFirst();
    }

    public static void addPrescription(Prescription prescription){
        prescriptions.add(new Prescription(prescription.getDate(), prescription.getDiagnostic(), prescription.getMedication(), prescription.getAnalysis(), prescription.getOtherInvestigations()));
        savePrescriptions();
        audit.insertAction(prescription.toString(), PrescriptionsCSV);
    }
    public void deletePrescriptionInsertion(String prescriptionDate) {
        Optional<Prescription> prescriptionToDelete = getPrescriptionByDate(prescriptionDate);
        try{
            prescriptions.remove(prescriptionToDelete.get());
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        savePrescriptions();
        audit.deleteAction(prescriptionDate.toString(), PrescriptionsCSV);
    }


    public static List<Prescription> getPrescriptions() {
        return prescriptions;
    }



    // ASSISTANTS
    public static void importAssistants(){
        CSVReader csvReader = new CSVReader(AssistantsCSV);
        csvReader.readCSV();
        for(String[] line: csvReader.getData()){
            if(line.length != 0){
                assistants.add(new Assistant(Integer.parseInt(line[0]), line[1]));
            }
        }
    }
    public static void saveAssistants(){
        CSVWriter csvWriter = new CSVWriter(AssistantsCSV, false);
        for(Assistant temp: assistants){
            csvWriter.write((temp.toStringCsv()));
            csvWriter.write("\n");
        }
        csvWriter.closeFile();
    }
    public Optional<Assistant> getAssistantByName(String name) {
        return assistants.stream().filter(assistants -> assistants.getName().equals(name)).findFirst();
    }

    public static void addAssistant(Assistant assistant){
        assistants.add(new Assistant(assistant.getId(), assistant.getName()));
        saveAssistants();
        audit.insertAction(assistant.toString(), AssistantsCSV);
    }
    public void deleteAssistantInsertion(String assistantName) {
        Optional<Assistant> assistantToDelete = getAssistantByName(assistantName);
        try{
            assistants.remove(assistantToDelete.get());
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        saveAssistants();
        audit.deleteAction(assistantName.toString(), AssistantsCSV);
    }

    public static List<Assistant> getAssistants() {
        return assistants;
    }


   // AUDIT
    public static Audit getAudit() {
        return audit;
    }

}
