import java.util.Arrays;

public class Doctor extends Personnel implements TreatsPatient{
    Patient[] patients;
    Assistant assistant;
    private boolean consult = false;
    private int index;


    ///----------CONSTRUCTORS-----------
    public Doctor(int id, String name, int numberOfPatients) {
        if(numberOfPatients > 0) {
            setId(id);
            setName(name);
            this.patients = new Patient[numberOfPatients];
        }
        else
            throw new RuntimeException("ENTER A POSITIVE NUMBER!");

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
    public String toString() {//DO NOT DISPLAY THE PATIENTS
        return "Doctor{" +
                "id="+ getId() + ", name=" + getName() +
                ", number of patients="  + index+ "assistant's id=" + assistant.getId()+
        '}';
    }
}