package polymorphism.zoo;

import polymorphism.zoo.Carnivor.Leu;
import polymorphism.zoo.Carnivor.Pisica;
import polymorphism.zoo.Erbivor.Cal;
import polymorphism.zoo.Erbivor.Elefant;
import polymorphism.zoo.Omnivor.Caine;
import polymorphism.zoo.Omnivor.Urs;

import java.util.Scanner;

public class ZooTest {
    public static void main(String[] args) {
        Integer nrAnimaleZoo = Integer.valueOf(args[0]);
        System.out.println(nrAnimaleZoo);
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Precizati numarul maxim de animale ce pot fi gazduite la zoo: ");
        int nrAnimaleZoo = scanner.nextInt();
        scanner.close();*/

        /*Zoo zooBucuresti = new Zoo(nrAnimaleZoo);
        adaugaAnimaleLaZoo(zooBucuresti);
        for(int i = 0; (i < zooBucuresti.animaleZoo.length) && (zooBucuresti.animaleZoo[i] != null); ++i) {
            Animal animal = zooBucuresti.animaleZoo[i];
            animal.afiseazaDetalii();
            animal.seHraneste();
            animal.scoateSunet();
        }
        Pisica pisica = new Pisica("Tom", 2);
        Pisica pisica1 = new Pisica("Tom", 2);
        System.out.println(pisica.equals(pisica1));*/
    }

    public static void adaugaAnimaleLaZoo(Zoo zooBucuresti) {
        Leu leu = new Leu("Simba", 7);
        zooBucuresti.adaugaAnimal(leu);
        Elefant elefant = new Elefant("Eli", 10);
        zooBucuresti.adaugaAnimal(elefant);
        Urs urs = new Urs("Fram", 4);
        zooBucuresti.adaugaAnimal(urs);
        Pisica pisica = new Pisica("Tom", 2);
        zooBucuresti.adaugaAnimal(pisica);
        Caine caine = new Caine("Toto", 3);
        zooBucuresti.adaugaAnimal(caine);
        Cal cal = new Cal("Thunder", 3);
        zooBucuresti.adaugaAnimal(cal);

    }
}
