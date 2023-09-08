import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the user's input as a string
        String userInput = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Use a for loop to reverse the string
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedString += userInput.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}
