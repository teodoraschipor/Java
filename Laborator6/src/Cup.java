public class Cup implements BubbleBathable{

    double volume;
    String color;

    public int getLevelOfFragility(){
        return Washable.FRAGILE;
    }

    @Override
    public boolean needsWashing(){
        return false;
    }
    @Override
    public void wash(){
        needsWashing();//se apeleaza metoda suprascrisa, adica cea de mai sus
        System.out.println("washing a cup");
    }

    @Override
    public void takeBubbleBath() {
        System.out.println("doesn't need bubble bathing");
    }

    @Override
    public void scrub() {

    }

    @Override
    public void soak() {

    }
}
