package lambda.ex1;

//functional interface

public interface Instrument {
    void play(); //abstract
    default void clean(){
        System.out.println("in default method");
    }
    static void inStatic(){
        System.out.println("static");
    }
}
