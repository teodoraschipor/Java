import java.util.Arrays;

public class Assistant extends Personnel implements SchedulesPatient{

    private boolean register = false;


    ///----------CONSTRUCTORS------------
    public Assistant(int id, String name){
        setId(id);
        setName(name);
    }
    public Assistant(Assistant assistant){
        this(assistant.getId(), assistant.getName());
    }


    ///-------------GETTERS AND SETTERS---------------
    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
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
        return "Assistant{" +
                "id="+ getId() + ", name=" + getName() + '}';
    }
}
