package polymorphism.zoo.Erbivor;

import polymorphism.zoo.Animal;

public abstract class Erbivor extends Animal {
    public Erbivor(String nume, int varsta){
        super(nume, varsta);
        tipHrana = "vegetatie";
    }
    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu " + this.tipHrana);
    }
}
