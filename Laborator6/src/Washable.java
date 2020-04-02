public interface Washable {
    //public static final
    int IMPERVIOUS = 0;
    int RESISTANT = 1;
    int FRAGILE = 2;
    int EXPLOSIVE = 3;

    //public abstract
    void wash();

    //public
    default boolean needsWashing(){//este mostenita de catre toate clasele din ierarhie
        System.out.println("by default, wash everything");
        return true;
    }
}
