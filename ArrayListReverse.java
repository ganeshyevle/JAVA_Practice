import java.util.*;
public class ArrayListReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        
        System.out.println("Enter 5 values:");

        for (int i = 0; i < 5; i++) {
            arrayList.add(sc.nextInt());
        }

        sc.close();

        for(int i=arrayList.size()-1; i>=0; i--){
            
   // reversed ArrayList
        System.out.println("Reversed ArrayList: " + arrayList.get(i)+" ");
        }

        
    }
}
