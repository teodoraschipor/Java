package polymorphism.zoo.Omnivor;

public class Caine extends Omnivor {
    public Caine(String nume, int varsta){
        super(nume, varsta);
        this.sunetSpecific = "latra";
    }

    @Override
    public void scoateSunet() {
        System.out.println("cainele" + this.sunetSpecific);
    }
}
