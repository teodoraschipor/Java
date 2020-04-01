package imutabilitate;

public class Main {
    public static void main(String[] args){



        Adresa domiciliu = new Adresa("Timisoara", "4A");
        System.out.println(domiciliu);
        Persoana persoana = new Persoana("teo", 1, domiciliu);
        String numePersoana = persoana.getNume().toUpperCase();//nu se modifica obiectul
        System.out.println(persoana);
        System.out.println(numePersoana);

        String stradaUpperCase = domiciliu.getStrada().toUpperCase();
        domiciliu.setStrada(stradaUpperCase);//s-ar fi modificat in obiect DACA in constructor NU aveam:  Adresa copieAdresa = new Adresa(adresa.getStrada(), adresa.getNumar());
        System.out.println(persoana);

        Adresa adresaDomiciliu = persoana.getAdresa();//obtinem o referinta la obiectul creat de noi
        adresaDomiciliu.setStrada(adresaDomiciliu.getStrada().toUpperCase());
        System.out.println(persoana);


    }
}
