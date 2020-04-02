public class Car implements BubbleBathable {
    @Override
    public void wash(){//mosteneste indirect metoda wash din soakable care mosteneste din washable
        System.out.println("washing a car");
    }
    @Override
    public void soak(){
        System.out.println("soaking the car");
    }

    @Override
    public void takeBubbleBath() {

    }

    @Override
    public void scrub() {
        System.out.println("soft scrub");
    }
}
