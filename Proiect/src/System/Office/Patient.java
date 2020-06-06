package System.Office;

import java.util.ArrayList;

public class Patient {
    private String name;
    private double age;
    ArrayList<Prescription> prescriptions = new ArrayList<Prescription>();
    private int numberOfPrescriptions;
    private String appointmentTime;
    private static String csvPatient = "Patients.csv";


    ///--------------CONSTRUCTORS---------------

    public Patient(String name, double age) {
        if(age > 0){
        this.name = name;
        this.age = age;
        this.numberOfPrescriptions = 0;
        }
        else throw new RuntimeException("ENTER A POSITIVE NUMBER!");
    }

    public Patient(Patient patient) {
        this.name = patient.name;
        this.age = patient.age;
        this.numberOfPrescriptions = patient.numberOfPrescriptions;
        this.prescriptions = (ArrayList<Prescription>) patient.prescriptions.clone();
    }


 /*   public void addPrescription(String prescription) {
        this.numberOfPrescriptions += 1;
        this.prescriptions.add(prescription);
    }*/
    ///------------GETTERS AND SETTERS-------------

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = (ArrayList<Prescription>) prescriptions.clone();
    }

    public int getNumberOfPrescriptions() {
        return numberOfPrescriptions;
    }

    public void setNumberOfPrescriptions(int numberOfPrescriptions) {
        this.numberOfPrescriptions = numberOfPrescriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    // USED WHEN THE ASSISTANT IS SCHEDULING THE PATIENT
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    ///--------------DISPLAY PATIENT-------------
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", prescriptions=" + prescriptions +
                ", numberOfPrescriptions=" + numberOfPrescriptions +
                ", appointmentTime='" + appointmentTime + '\'' +
                '}';
    }

    public String toStringCsv(){
        return "" + getName() + "," + getAge(); //+ "," + getAppointmentTime();
    }
}