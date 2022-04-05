import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {

        Random diceRoller = new Random();
        Scanner sides = new Scanner(System.in);

        System.out.println("Pick how many sides your dice will have.");

        int sidesNum = sides.nextInt();

        int rollResult = diceRoller.nextInt(sidesNum) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch!");
        } else if (rollResult == sidesNum) {
            System.out.println("You rolled a critical! Nice Job!");
        }
    }
}
