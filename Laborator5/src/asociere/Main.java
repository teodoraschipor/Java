package asociere;

import imutabilitate.Persoana;

public class Main {
        public static void main(String[] args){
            Profesor profesorPrincipalMate = new Profesor(1,  "Popescu");
            Profesor profesorSecundarMate = new Profesor( 2,  "Ionescu");
            Profesor profesorInfo = new Profesor(3, "Anghel");
            Profesor profesorMateSiInfo = new Profesor(4, "Petrescu");
            Profesor profesorInfoSiMate = new Profesor(5, "Andrei");

            Departament departamentInfo = new Departament("info");
            departamentInfo.setProfesori(new Profesor[]{profesorInfo, profesorInfoSiMate, profesorMateSiInfo});
            Departament departamentMate = new Departament("mate");
            departamentMate.setProfesori(new Profesor[]{profesorPrincipalMate, profesorSecundarMate, profesorInfoSiMate, profesorMateSiInfo});

            Universitate unibuc = new Universitate("UNIBUC", new Departament[]{departamentInfo, departamentMate});

            System.out.println(unibuc);

         //   departamentInfo = null;//nu se modifica obiectul universitate pt ca in constructor, nu primeste referinta
            //ramane in memorie obiectul, dar nu mai poate fi folosit/nu mai e referentiat de nicio variabila
         //   System.out.println(unibuc);

            System.out.println(departamentMate);
            profesorSecundarMate = null;
            System.out.println(departamentMate);


        }
}
