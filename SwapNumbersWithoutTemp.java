// Swap Numbers WithoutTemp Program

public class SwapNumbersWithoutTemp {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 10;
        
//Before swapping

        System.out.println("<<<<<<<<<<<<<<Before swapping>>>>>>>>>>>>>>");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

//After swapping
        System.out.println("<<<<<<<<<<<<After swapping>>>>>>>>>>>>>");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
    }
}
