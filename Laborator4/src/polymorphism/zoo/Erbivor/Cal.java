package polymorphism.zoo.Erbivor;

public class Cal extends Erbivor {
    public Cal(String nume, int varsta){
        super(nume, varsta);
        this.sunetSpecific = "necheaza";
    }

    @Override
    public void scoateSunet() {
        System.out.println("Calul " + this.sunetSpecific);
    }
}
