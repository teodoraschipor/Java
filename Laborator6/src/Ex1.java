public class Ex1 {
    public static void main(String[] args) {
        //interfetele pot fi declarate ca variabile
       // Washable washable;//nu creem un obiect; avem o referinta washable de tip Washable
        //washable = new Washable(); //cannot be directly instantiated

        Washable washable = new Car();
        washable.wash();//by default compilatorul verifica sa existe metoda wash in tipul referintei specificat (interfata Washable)
                        //la runtime are loc polimorfismul dinamic (acest comportament e invocat pe tipul de obiect concret creat) => apeleaza wash din Car

        Washable dog = new Dog();
        if(dog.needsWashing()){//needsWashing e mostenita din Washable
            dog.wash();
        }
        Washable car = new Car();
        car.wash();
    }
 }
