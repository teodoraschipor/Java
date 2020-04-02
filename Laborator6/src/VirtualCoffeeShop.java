public class VirtualCoffeeShop {
    public static void prepareCup(Cup cup){//declaram metodele care se vor a fi utilitare
        cup.wash();
    }

    //static polymorphism
    //dynamic polymorphism
    public static void main(String[] args) {

        Cup cup = new Cup();
        prepareCup(cup);

        Cup coffeeCup = new CoffeCup();
        prepareCup(coffeeCup);

        //dynamic polymorphism
        Cup teaCup = new TeaCup();
        prepareCup(teaCup);
    }
}
