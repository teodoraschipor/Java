package polymorphism.zoo.Omnivor;

import polymorphism.zoo.Animal;

public abstract class Omnivor extends Animal {
    public Omnivor(String nume, int varsta){
        super(nume,  varsta);
        tipHrana = "carne + vegetatie";
    }
    @Override
    public void seHraneste(){
        System.out.println(this + " se hraneste cu " + this.tipHrana);
    }
}
