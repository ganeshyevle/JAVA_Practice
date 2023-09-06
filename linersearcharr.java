import java.util.Scanner;

public class Linersearcharr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // we requird to get the length of the array from the user so we use..
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Then we can create an array of the specified length
        int[] array = new int[length];

        // It will get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // This is responsible for Get the value to search for from the user
        System.out.print("Enter the value to search for: ");
        int targetValue = scanner.nextInt();

        // we can perform linear search operation
        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (array[i] == targetValue) {
                found = true;
                break;
            }
        }

        // we can display the result using this
        if (found) {
            System.out.println("The target value " + targetValue + " was found in the array.");
        } else {
            System.out.println("The target value " + targetValue + " was not found in the array.");
        }
        scanner.close();
    }
}
