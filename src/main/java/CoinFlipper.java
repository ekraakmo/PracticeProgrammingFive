import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        Random coinflip = new Random();

        double result = coinflip.nextDouble(1);

        System.out.println("Ready, Set, Flip...!!");
        if (result <=.5) {
            System.out.println("You got TAILS!");
        } else {
            System.out.println("You got HEADS!");
        }
    }
}
