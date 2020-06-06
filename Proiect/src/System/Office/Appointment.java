package System.Office;

public class Appointment {
    private double appointmentTime;
    private int duration;
    private String appointmentType;

    public Appointment(double appointmentTime, int duration, String appointmentType) {
        this.appointmentTime = appointmentTime;
        this.duration = duration;
        this.appointmentType = appointmentType;
    }

    public double getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(double appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentTime='" + appointmentTime + '\'' +
                ", duration='" + duration + '\'' +
                ", appointmentType='" + appointmentType +'}';
    }
}
