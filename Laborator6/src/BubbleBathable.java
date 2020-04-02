public interface BubbleBathable extends Soakable, Scrubbable {//va mosteni implicit metodele: scrub, soak, wash
    void takeBubbleBath();
//mosteneste wash din Soakable
    default void wash(){
        //Soakable.super.wash(); <-- pot face asta daca am nevoie
        System.out.println("default wash in bubble bathing");
    }
}
