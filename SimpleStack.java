import java.util.Scanner;

public class SimpleStack {
    private static final int MAX_SIZE = 5;
    private int top = -1;
    private int[] stack = new int[MAX_SIZE];

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stack[++top] = value;
            System.out.println("Your Pushed value is: " + value);
        } 
        else {
            System.out.println("Stack is full. We annot push know " + value);
        }
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("Popped: " + stack[top--]);
        } 
        else {
            System.out.println("Stack is empty. Know we cannot pop.");
        }
    }

    public int peek() {
        if (top >= 0) {
            return stack[top];
        } 
        else {
            System.out.println("Stack is empty. We cannot peek.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleStack stack = new SimpleStack();

        while (true) {
            System.out.println("1. Push any value:");
            System.out.println("2. Pop any value:");
            System.out.println("3. Peek of your Stack");
            System.out.println("4. Is Empty");
            System.out.println("5. Is Full");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int peekValue = stack.peek();
                    if (peekValue != -1) {
                        System.out.println("Peeked: " + peekValue);
                    }
                    break;
                case 4:
                    System.out.println("Your Stack is empty: " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Your Stack is full: " + stack.isFull());
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Your choice is Invalid . Please choice/enter a valid option.");
            }
        }
    }
}
