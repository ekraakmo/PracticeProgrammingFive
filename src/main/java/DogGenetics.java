import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random percentage = new Random();

        int husky = percentage.nextInt(20) + 1;
        int chihuahua = percentage.nextInt(20) + 1;
        int labrador = percentage.nextInt(20) + 1;
        int great = percentage.nextInt(20) + 1;
        int kachow = 100 - husky - chihuahua - labrador - great;

        System.out.print("What is your dog's name? ");
        String dogName = userInput.nextLine();

        System.out.println(dogName + "'s ancestry report is: ");
        System.out.println(husky + "% Husky");
        System.out.println(chihuahua + "% Chihuahua");
        System.out.println(labrador + "% Labrador");
        System.out.println(great + "% Great Pyraneese");
        System.out.println(kachow + "% Kachow!");

        System.out.println("Wow, how the fuck does that add up?");
    }
}
