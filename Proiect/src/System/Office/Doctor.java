package System.Office;

import Interface.TreatsPatient;

import java.util.ArrayList;
import java.util.Arrays;

public class Doctor extends Personnel implements TreatsPatient {
    Patient[] patients;
    Assistant assistant;
    private boolean consult = false;
    private int index;
    ArrayList<Appointment> appointments;
    private static String csvDoctors = "Doctors.csv";


    ///----------CONSTRUCTOR-----------
    public Doctor(int id, String name, int numberOfPatients) {//numberOfPatients = maximum number of patients the doctor can have
        if(numberOfPatients > 0 && id > 0) {
            setId(id);
            setName(name);
            this.patients = new Patient[numberOfPatients];
        }
        else
            throw new RuntimeException("ENTER POSITIVE NUMBERS!");
    }

    public boolean addPatient(Patient patient){
        if(index < patients.length) {
            patients[index] = patient;
            System.out.println("YOU ADDED PATIENT NUMBER :" + ++index);
            return true;
        }
        else
            return false;
    }

    public void displayPatients(){
        for(int i = 0; i < patients.length; i++)
            System.out.println(patients[i]);
    }


    ///-----------GETTERS AND SETTERS-----------
    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public Assistant getAssistant() {
        return new Assistant(assistant);
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = new Assistant(assistant);
    }

    public boolean isConsult() {
        return consult;
    }

    public void setConsult(boolean consult) {
        this.consult = consult;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    ///-------------IMPLEMENTED METHODS FROM TREATSPATIENT------------
    @Override
    public void consult() {
        if(this.consult == false){
            this.consult = true;
            work();
            System.out.println("THE DOCTOR IS CONSULTING THE PATIENT...");
        }
        else
            System.out.println("THE PATIENT HAS ALREADY BEEN CONSULTED...");

    }

    @Override
    public void diagnose() {
        if(this.consult == true){
            this.consult = false;
            work();
            System.out.println("THE DOCTOR IS DIAGNOSING THE PATIENT AND WRITING THE PRESCRIPTION...");

        }
        else
            System.out.println("THE PATIENT HAS NOT BEEN CONSULTED...");

    }


    ///------------IMPLEMENTED METHOD FROM PERSONNEL-----------
    @Override
    public void work() {
        System.out.println("THE DOCTOR IS WORKING: ");
    }


    ///----------DISPLAY DOCTOR------------
    @Override
    public String toString() {
        return "Doctor{" +
                "patients=" + Arrays.toString(patients) +
                ", assistant=" + assistant +
                ", consult=" + consult +
                ", number of patients=" + index +
                ", appointments=" + appointments +
                '}';
    }

    public String toStringCsv(){
        return "" + getId() + "," + getName() + "," + getIndex();
    }
}