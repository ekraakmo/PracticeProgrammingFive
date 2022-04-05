import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner userInput = new Scanner(System.in);

        int theNumber = randomizer.nextInt(-100,100) + 1;

        System.out.println("Guess a number between -100 & 100");
        int guess = userInput.nextInt();

        if (guess == theNumber) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (guess < theNumber) {
            System.out.println("Ha, nice try - too low! Try again");
            guess = userInput.nextInt();

            if (guess == theNumber) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (guess < theNumber) {
                System.out.println("Ha, nice try - too low! Try again");
            } else {
                System.out.println("Too bad, way too high.");
            }
        } else {
            System.out.println("Too bad, way too high. Try again!");
            guess = userInput.nextInt();

            if (guess == theNumber) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (guess < theNumber) {
                System.out.println("Ha, nice try - too low! Try again");
            } else {
                System.out.println("Too bad, way too high.");
            }
        }
        System.out.println("my number was " + theNumber);
    }
}