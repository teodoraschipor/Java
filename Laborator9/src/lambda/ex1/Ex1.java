package lambda.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        guitar.play();

        //clasa anonima
        Instrument piano = new Instrument() {
            @Override
            public void play() {
                System.out.println("playing piano");
            }
        };
        piano.play();

        Instrument i1 = () -> System.out.println("new instrument playing");//doar declar ca atunci cand voi folosi aceasta implementare de interfata, voi afisa...
        Instrument i2 = () -> System.out.println("stop playing");

        i1.play();
        i2.play();
    }
}
