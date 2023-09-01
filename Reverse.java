import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        int originalNumber = number;
        
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
       
        int sumOfDigits = 0;
        number = originalNumber;
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reversedNumber);
        System.out.println("Sum of digits: " + sumOfDigits);
        
        scanner.close();
    }
}
