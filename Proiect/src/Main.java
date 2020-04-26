import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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

    }
}
