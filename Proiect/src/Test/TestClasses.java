package Test;

import System.DataBase.DataBase;
import System.Office.Assistant;
import System.Office.Doctor;
import System.Office.MedicalOffice;
import System.Office.Patient;
import System.Services.Services;
import System.persistence.Audit;
import System.persistence.CSVReader;
import System.persistence.CSVWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClasses {

    private static final Services patientServices = new Services();
    private static List<Patient> patients = new ArrayList<Patient>();
    private static final Services doctorServices = new Services();
    private static List<Doctor> doctors = new ArrayList<Doctor>();

    private static void open() {
        DataBase.importDoctors();
        DataBase.importPatients();
        DataBase.importAssistants();
        DataBase.importPrescriptions();
    }
    public static void main(String[] args) {
/*
    //---------------------ETAPA I----------------------
        MedicalOffice office = new MedicalOffice("Regina Maria", "Bulevardul Constantin Brancoveanu, nr 29", 8);
        System.out.println(office);

        Assistant a1 = new Assistant(11, "Rusu Andrei");
        office.addEmployee(a1);
        Patient p1 = new Patient("Popescu Alexandru", 19);
        Doctor d1 = new Doctor(01, "Popescu Laura", 3);
        d1.addPatient(p1);
        d1.setAssistant(a1);
        office.addEmployee(d1);
        System.out.println(office);

        Assistant a2 = new Assistant(12, "Ilisei Ana");
        office.addEmployee(a2);
        Doctor d2 = new Doctor(02, "Bandac Razvan", 5);
        d2.setAssistant(a2);
        office.addEmployee(d2);

        Patient p2 = new Patient("Miron Andreea", 49);
        Patient p3 = new Patient("Schipor Radu", 27);
      /*  String prescription = new String("tfvygbhnj");
        try{
        p3.addPrescription(prescription);
        }catch (NullPointerException e){
            System.out.println(e);
        }*/
/*
        d2.addPatient(p2);
        d2.addPatient(p3);
        d2.displayPatients();

        if(office.removeEmployee(a2))
            System.out.println(a2 + " IS NO LONGER OUR EMPLOYEE");
        Assistant newAssistant = new Assistant(12, "Albu Tudor");
        d2.setAssistant(newAssistant);
        office.addEmployee(newAssistant);

        MedicalOffice[] allOffices = new MedicalOffice[3];
        allOffices[0] = office;
        MedicalOffice office2 = new MedicalOffice("Regina Maria", "Calea Vacaresti", 20);
        allOffices[1] = office2;
        MedicalOffice office3 = new MedicalOffice("Regina Maria", "Calea Floreasca", 22);
        allOffices[2] = office3;

        for(int i = 0; i < allOffices.length; i++)
            System.out.println(allOffices[i]);

*/

        //----------------------ETAPA II-----------------------
        open();

        try{

            boolean status = true; // the app is still running
            while(status) {
                System.out.println("\nSelect your action:\n" +
                        "0. Exit Program\n" +
                        "1. Insert a patient\n" +
                        "2. Delete a patient\n" +
                        "3. Insert a doctor\n" +
                        "4. Delete a doctor\n");
                System.out.print("Your choice: ");
                Scanner scan = new Scanner(System.in);
                int choice = scan.nextInt();
                switch (choice) {
                    case 0: {
                        status = false;
                        break;
                    }

                    case 1: {
                        System.out.println("Insert your info:");
                        System.out.print("Full Name: ");
                        scan.nextLine();
                        String name = scan.nextLine();
                        System.out.print("Age: ");
                        int age = scan.nextInt();
                        Patient currentPatient = new Patient(name, age);
                        patientServices.getDatabase().addPatient(currentPatient);
                        break;

                    }
                    case 2: {
                        System.out.println("Do you want to delete a patient from DataBase?");
                        System.out.println("Options: " + "1.Yes, " + "2.No");
                        System.out.print("Your selection: ");
                        int answer = scan.nextInt();
                        if(answer == 2)
                            break;
                        System.out.println("All the patients from DataBase:");
                        System.out.println(DataBase.getPatients());
                        System.out.println("Select a patient from the list (by entering his name)");
                        System.out.print("The patient you select is: ");
                        scan.nextLine();
                        String selection = scan.nextLine();
                        patientServices.getDatabase().deletePatientInsertion(selection);
                        break;
                    }
                    case 3: {
                        System.out.println("Insert your info:");
                        System.out.print("ID: ");
                        int id = scan.nextInt();
                        System.out.print("Full Name: ");
                        scan.nextLine();
                        String name = scan.nextLine();
                        Doctor currentDoctor = new Doctor(id, name);
                        doctorServices.getDatabase().addDoctor(currentDoctor);
                        break;

                    }
                    case 4: {
                        System.out.println("Do you want to delete a doctor from DataBase?");
                        System.out.println("Options: " + "1.Yes, " + "2.No");
                        System.out.print("Your selection: ");
                        int answer = scan.nextInt();
                        if(answer == 2)
                            break;
                        System.out.println("All the doctors from DataBase:");
                        System.out.println(DataBase.getDoctors());
                        System.out.println("Select a doctor from the list (by entering his name)");
                        System.out.print("The doctor you select is: ");
                        scan.nextLine();
                        String selection = scan.nextLine();
                        doctorServices.getDatabase().deleteDoctorInsertion(selection);
                        break;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DataBase.getAudit().closeFile();
        }
    }
}
