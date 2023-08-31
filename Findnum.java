import java.util.Scanner;

public class Findnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month 1 - 12: ");
        int month = scanner.nextInt();
        scanner.close();
        
        int days = 0;
        
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
            days = 31;
            break;
                
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
            days = 30;
            break;
                
            case 2: // February is a leap year
            days = 28; // it's for a leap year
                break;
                
            default:
                System.out.println("Invalid month entered.");
                System.exit(0);
        }
        
        System.out.println("Number of days in month " + month + " is: " + days);
    }
}
