package ex1;

public class C1 implements Interface1, Interface2 {
    @Override //La override NU am voie sa folosesc un specificator de acces mai restrictiv
    public void m1(){
        Interface1.super.m1();
    }
}
