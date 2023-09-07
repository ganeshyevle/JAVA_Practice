import java.util.*;

public class ArrayListCombine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> surnames = new ArrayList<>();
            ArrayList<String> combine = new ArrayList<>();

            // for names
            for (int i = 1; i <= 5; i++) {
                System.out.println("-------Enter your " + i + " Name ------- ");
                String name = sc.nextLine();
                names.add(name);
            }

            // for surnames

            for (int i = 1; i <= 5; i++) {
                System.out.println("--------Enter your " + i + " Sername ------- ");
                String surname = sc.nextLine();
                surnames.add(surname);
            }

            // Combine names and surnames
            for (int i = 0; i < 5; i++) {
                String fullName = names.get(i) + " " + surnames.get(i);
                combine.add(fullName);
            }

            // Display combined list
            System.out.println("---------Combined List is:---------");
            for (String fullName : combine) {
                System.out.println(fullName);
            }
            sc.close();
        }
    }

}
