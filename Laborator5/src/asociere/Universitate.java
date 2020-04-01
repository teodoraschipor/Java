package asociere;

import java.util.Arrays;

/*
* RELATIE DE COMPOZITIE: daca universitatea inceteaza sa mai existe =>
*                                           la fel se intampla si cu departamentul info
* */
public class Universitate {//has to has a//= e obligatoriu sa existe universitatea
    // ca obiectele de tip de =partament sa existe in continuare

    private String nume;
    private Departament[] departamente;

    public Universitate(String nume, Departament[] departamente) {
        this.nume = nume;
        this.departamente = Arrays.copyOf(departamente, departamente.length);
    }

    public String toString(){

        return "Universitate{nume = " + nume + "}" + ", departamente = " + Arrays.toString(departamente);
    }
}
