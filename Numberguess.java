import java.util.Random;
import java.util.Scanner;

public class Numberguess{

    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess the number (between 1 and 100):");

        while (!hasGuessedCorrectly) {
            int guessedNumber = scanner.nextInt();
            numberOfTries++;

            if (guessedNumber == targetNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + numberOfTries + " tries.");
            } else if (guessedNumber < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        scanner.close();
    }
}
