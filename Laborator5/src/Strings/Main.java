package Strings;

public class Main {
    static String membruClasa;
    public static void main(String[] args) {

        String s1 = "";
        String s2 = "abc";
        System.out.println(s2);//abc
        s2.toUpperCase();
        System.out.println(s2);//abc //string pool
        //isBlank()
       // s2 = s2.toUpperCase();//Se creeaza in zona de memorie reutilizabila un alt string
        //System.out.println(s2);//ABC; s2 isi pierde referinta catre valoarea initiala

        String s3 = new String("abc"); //heap
        System.out.println(s2 == s3);//->false....  compara referintele. Obiectele sunt create in zone de memorie diferite
        String s4 = "abc"; //nu se va creea zona noua..nu se aloca memorie din nou..pentru variabila aceasta pt ca a fost deja definita valoarea => reutilizez memoria, nu aloc un spatiu suplimentar
        System.out.println(s3 == s4);//->false
        System.out.println(s2 == s4);//->true... Acelasi obiect
        System.out.println(s2.equals(s3));//->true... compara valorile
        s3 = s3.intern();//valoarea din heap ajunge in string pool
        System.out.println(s2 == s3);//->true


        String adresa = s1 + s2 + s3.toUpperCase() +s4.length();
        //StringBuilder - nu face atat de multe operatii costisitoare ca mai sus la String adresa, dar nu e imutabil
        StringBuilder sb = new StringBuilder(adresa);
        sb.append(1234);
        System.out.println(sb);

        //StringBuilder - threadsafe, dar lent
        StringBuffer sbf = new StringBuffer(adresa);
        StringBuffer sbf1 = new StringBuffer(sb);
        StringBuilder sb1 = new StringBuilder(sbf);

    }
}
