package System.Office;


import Interface.SchedulesPatient;

import java.util.ArrayList;

public class Assistant extends Personnel implements SchedulesPatient {

    private boolean register = false;
    ArrayList<Appointment> appointments;


    ///----------CONSTRUCTORS------------
    public Assistant(int id, String name){
        if(id > 0){
            setId(id);
            setName(name);

        }else throw new RuntimeException("ENTER A POSITIVE NUMBER");

    }
    public Assistant(Assistant assistant){
        this(assistant.getId(), assistant.getName());
    }

//DE VAAAZZUUUUUTT!!!!!! PT FIECARE CAAAZZZ!!!!!! + CAZUL IN CARE CE VREAU SA INTRODUC ARE DURATA PREA MARE CA TRECE PESTE URMATOAREA PROGRAMARE
    public void addAppointment(Appointment appointment){
        int n = appointments.size();
        for(int i = 0; i < n-1; i ++)
            if(appointments.get(i).getAppointmentTime() > appointment.getAppointmentTime() + appointment.getDuration())
                appointments.add(i, appointment);
            else if(appointments.get(i).getAppointmentTime() == appointment.getAppointmentTime()) {
                System.out.println("AN APPOINTMENT AT THIS HOUR IS ALREADY REGISTERED!! CHANGE THE APPOINTMENT TIME!!");
                break;
            }
        if(appointments.get(n-1).getAppointmentTime() + appointments.get(n-1).getDuration() < appointment.getAppointmentTime())
            appointments.add(appointment);

    }
    ///-------------GETTERS AND SETTERS---------------
    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    ///-------------IMPLEMENTED METHODS FROM SCHEDULESPATIENT-------------
    @Override
    public void registerData() {
        if(this.register == false){
            this.register = true;
            work();
            System.out.println("THE ASSISTANT IS REGISTERING THE PATIENT IN SYSTEM...");
        }
        else
            System.out.println("THE PATIENT HAS ALREADY BEEN REGISTERED...");
    }

    @Override
    public void collectMoney() {
        if(this.register == true){
            this.register = false;
            work();
            System.out.println("THE ASSISTANT IS COLLECTING THE MONEY...");
        }
        else
            System.out.println("THE PATIENT HAS NOT BEEN REGISTERED...");

    }


    ///------------IMPLEMENTED METHOD FROM PERSONNEL-------------
    @Override
    public void work() {
        System.out.println("THE ASSISTANT IS WORKING: ");
    }


    ///------------DISPLAY ASSISTANT------------
    @Override
    public String toString() {
        return "Assistant{"+
                "appointments=" + appointments +
                '}';
    }
}
