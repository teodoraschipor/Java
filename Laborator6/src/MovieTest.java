import java.util.Arrays;
//COMPARABLE = folosit pt situatii in care vrem sa definim o sortare naturala pentru obiectele de tipul clasei noastre
//COMPARATOR = folosit pt situatii in care vrem sa definim mai multe tipuri de comparare pentru o clasa in functie de nevoile aplicatiei noastre
public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = {new Movie("Breaking bad", 2014, 9.4),
        new Movie("Star Wars", 1977, 8.8),
        new Movie("Die hard", 1990, 8),
        new Movie("Terminator", 1994, 7.5)};
        System.out.println(Arrays.toString(movies));
        Arrays.sort(movies);
        System.out.println(Arrays.toString(movies));

        Arrays.sort(movies, new MovieRatingComparator());
        System.out.println(Arrays.toString(movies));

        Arrays.sort(movies, new MovieNameComparator());
        System.out.println(Arrays.toString(movies));
    }
}
