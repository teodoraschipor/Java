package asociere;

import java.util.Arrays;

public class Departament { //has-a
    //"avem o relatie de agregare"

    private String nume;
    private Profesor[]profesori;

    public Departament(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Profesor[] getProfesori() {
        return profesori;
    }

    public void setProfesori(Profesor[] profesori) {
        this.profesori = profesori;
    }

    @Override
    public String toString() {//returns the string representation of the object.
        return "Departament{" +
                "nume='" + nume + '\'' +
                ", profesori=" + Arrays.toString(profesori) +
                '}';
    }
}
