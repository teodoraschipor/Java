package polymorphism.zoo;

public class Zoo {
    /*static {
    }
    Blocuri initializare
    {
        nrMaxAnimale = 5;
    }*/
    private final int nrMaxAnimale;
    Animal[] animalezoo;
    private int indexCurent;

    public Zoo(int nrMaxAnimale) {
        if (nrMaxAnimale > 0) {
            this.nrMaxAnimale = nrMaxAnimale;
            this.animalezoo = new Animal[nrMaxAnimale];
        } else {
            throw new RuntimeException("Nu ati introdus un nr intreg pozitiv");
        }
    }
    public void adaugaAnimal(Animal animal){
        if(indexCurent < animalezoo.length){
            animalezoo[indexCurent] = animal;
            System.out.println("Adaugat animal" + animal.getClass().getSimpleName() + "la pozitia " + indexCurent++);
        }
    }
}
