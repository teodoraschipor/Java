import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class Patient {
    private String name;
    private double age;
    ArrayList<String> prescriptions;
    private int numberOfPrescriptions;

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
        this.prescriptions = (ArrayList<String>) patient.prescriptions.clone();
    }


    public void addPrescription(String prescription) {
        this.numberOfPrescriptions += 1;
        this.prescriptions.add(prescription);
    }
    ///------------GETTERS AND SETTERS-------------

    public ArrayList<String> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<String> prescriptions) {
        this.prescriptions = (ArrayList<String>) prescriptions.clone();
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


    ///--------------DISPLAY PATIENT-------------

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Number of prescriptions=" + numberOfPrescriptions +
                ", prescriptions=" + prescriptions +
                '}';
    }
}