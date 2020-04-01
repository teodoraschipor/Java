package imutabilitate;

public final class Persoana {
    private final String nume;
    private final int id;
    private final Adresa adresa;

    public Persoana(String nume, int id, Adresa adresa) {
        this.nume = nume;
        this.id = id;
        //varianta1:Adresa copieAdresa = new Adresa(adresa.getStrada(), adresa.getNumar());
        //this.adresa = copieAdresa;

       //varianta2: String numeStrada = adresa.getStrada();
       // String numarStrada = adresa.getNumar();
       // Adresa copieAdresa = new Adresa(numeStrada, numarStrada);
       // this.adresa = copieAdresa;

        //varianta3:
        this.adresa = new Adresa(adresa);
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }

    public Adresa getAdresa() {//obtinem o referinta la obiect!!!
        //String numeStrada = adresa.getStrada();
        //String numarStrada = adresa.getNumar();
        //Adresa copieAdresa = new Adresa(numeStrada, numarStrada);
       // return copieAdresa;
        return new Adresa(adresa);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", id=" + id +
                ", adresa=" + adresa +
                '}';
    }
}
