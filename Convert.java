import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in US Dollars: ");
        double dollars = scanner.nextDouble();
        scanner.close();
        
        double exrate = 82.65;
        double rupees = dollars * exrate;
        
        System.out.println(dollars + " USD is equal to " + rupees + " INR");
    }
}
