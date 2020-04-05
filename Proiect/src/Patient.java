import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class Patient {
    private String name;
    private int age;
    ArrayList<String> prescriptions;
    private int NumberOfPrescriptions;

    ///--------------CONSTRUCTORS---------------


    public Patient(String name, int age, int numberOfPrescriptions) {
        this.name = name;
        this.age = age;
        NumberOfPrescriptions = numberOfPrescriptions;
        if(numberOfPrescriptions < 0)
            throw new RuntimeException("ENTER A POSITIVE NUMBER!");
    }

    public Patient(Patient patient) {
        this.name = patient.name;
        this.age = patient.age;
        this.NumberOfPrescriptions = patient.NumberOfPrescriptions;
        this.prescriptions = (ArrayList<String>) patient.prescriptions.clone();
    }


    ///------------GETTERS AND SETTERS-------------

    public ArrayList<String> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<String> prescriptions) {
        this.prescriptions = (ArrayList<String>) prescriptions.clone();
    }

    public int getNumberOfPrescriptions() {
        return NumberOfPrescriptions;
    }

    public void setNumberOfPrescriptions(int numberOfPrescriptions) {
        NumberOfPrescriptions = numberOfPrescriptions;
    }

     public void addPrescription(String prescription) {
         this.NumberOfPrescriptions += 1;
         this.prescriptions.add(prescription);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    ///--------------DISPLAY PATIENT-------------

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", NumberOfPrescriptions=" + NumberOfPrescriptions +
                ", prescriptions=" + prescriptions +
                '}';
    }
}