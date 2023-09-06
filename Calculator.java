/**
* This program defines a simple Calculator class that can perform basic arithmetic operations
* such as addition, subtraction, multiplication, division, and modulo on integers.
* It includes methods for each operation and a main method for testing these methods.
*/
public class Calculator {
   // Constructor
   public Calculator() {
       // Constructor content is empty
   }
   public int add(int a, int b){
     return a+b;
      }
   public int subtract(int a, int b){
     return a-b;
     }
     public int multiply(int a, int b){
     return a*b;
     }
     public int divide(int a, int b){
     return a/b;
     }
     public int modulo(int a, int b){
     return a%b;
     }
     public static void main(String[] args){
       Calculator myCalculator=new Calculator();
int result = myCalculator.add(5,7);
System.out.println("Addition:" + result);
result = myCalculator.subtract(45,11);
System.out.println("Subtract:" + result);
result = myCalculator.multiply(5,7);
System.out.println("Multiply:" + result);
result = myCalculator.divide(5,7);
System.out.println("Divide:" + result);
result = myCalculator.modulo(5,7);
System.out.println("Modulo:" + result);
     }
} 


