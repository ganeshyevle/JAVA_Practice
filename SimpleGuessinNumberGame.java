import java.util.Scanner;

public class SimpleGuessinNumberGame {

    public static void main(String[] args) {
       
        int targetNumber = 10; //This is our target number 
        
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess the number (between 1 and 100):");

        while (!hasGuessedCorrectly) {
            int guessedNumber = scanner.nextInt();
            numberOfTries++;

            if (guessedNumber == targetNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! know you have guessed the number " + targetNumber + " in " + numberOfTries + " tries ....Well Done!....");
            } else if (guessedNumber < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        scanner.close();
    }
}
