import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MedicalOffice office = new MedicalOffice("Regina Maria", "Bulevardul Constantin Brancoveanu, nr 29", 4);
        System.out.println(office);

        Assistant a1 = new Assistant(11, "Rusu Andrei");
        office.addEmployee(a1);
        Patient p1 = new Patient("Popescu Alexandru", 19, 20);
        Doctor d1 = new Doctor(01, "Popescu Laura", 1);
        d1.addPatient(p1);
        d1.setAssistant(a1);
        office.addEmployee(d1);
        System.out.println(office);

        Assistant a2 = new Assistant(12, "Ilisei Ana");
        office.addEmployee(a2);
        Doctor d2 = new Doctor(02, "Bandac Razvan", 1);
        d2.setAssistant(a2);
        office.addEmployee(d2);

        System.out.println(office);

    }
}
