public class Stack1 {

    int stack[] =new int[50];
    int top =-1;

    boolean isEmpty(){

        return top==-1;
    }

    void push(int data){

        if(isEmpty()){

          stack[++top]=data;

        }

        stack[++top]=data;



    }

    void pop(){

        if(isEmpty()){
            System.out.println("Stack is underflow ");
        }

        stack[top--]=0;

    }

    int  peek(){

        return stack[top];

    }

    void printStack(){
       for(int i=0;i<top;i++){
        System.out.print(stack[i]+" ");
       }
       System.out.println();

    
    }


    public static void main(String[] args) {
        
        Stack stack =new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        stack.printStack();

        stack.pop();

        stack.printStack();

        System.out.println(stack.peek());

    }  
}
