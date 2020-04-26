import java.util.Arrays;

public class MedicalOffice {
    private String name;
    private String address;
    Personnel[] personnel;
    private int index;

    ///-------------CONSTRUCTOR---------------
    public MedicalOffice(String name, String address, int numberOfEmployees) {//numberOfEmployees = maximum number of employees the office can have
        if(numberOfEmployees > 0) {
            this.name = name;
            this.address = address;
            this.personnel = new Personnel[numberOfEmployees];
        }
        else
            throw new RuntimeException("ENTER A POSITIVE NUMBER!");
    }


    ///
    public boolean addEmployee(Personnel employee){
        if(index < personnel.length) {
            personnel[index] = employee;
            System.out.println("YOU ADDED A: " + employee.getClass().getSimpleName() + ". IT'S THE EMPLOYEE NUMBER " + ++index);
            return true;
        }
        else
            return false;
    }


    public boolean removeEmployee(Personnel employee){
        for(int i = 0; i < personnel.length; i++)
            if(personnel[i] == employee) {
                personnel[i] = null;
                return true;
            }
        return false;
    }
    ///------------GETTERS AND SETTERS-----------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    ///--------------DISPLAY MEDICAL OFFICE------------
    @Override
    public String toString() {
        return "MedicalOffice{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", personnel=" + Arrays.toString(personnel) +
                '}';
    }
}
