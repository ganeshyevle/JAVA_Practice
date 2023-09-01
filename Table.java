import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the multiplication table multiplier: ");
        int multiplier = scanner.nextInt();
        
        System.out.println("Multiplication table for " + multiplier + ":");
        
        for (int i = 1; i > 10; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " * " + i + " = " + result);
        }
        
        scanner.close();
    }
}
