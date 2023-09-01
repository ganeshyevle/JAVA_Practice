import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Decimal Number as you convert into binary : ");
        int decimalNumberto = scanner.nextInt();
        
        String binary = "";
        while (decimalNumberto > 0) {
            int remainder1 = decimalNumberto % 2;
            binary = remainder1 + binary;
            decimalNumberto /= 2;
        }
        
        System.out.println("Binary representation of: " + binary);
        
        scanner.close();
    }
}
