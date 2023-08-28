//Swaping Number Program

public class SwapNumbers {
    public static void main(String[] args) {
       
        int num1 = 10;
        int num2 = 20;
        
        System.out.println("<<<<<<<<Before swapping>>>>>>");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("<<<<<<<<After swapping>>>>>>");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
    }
}
