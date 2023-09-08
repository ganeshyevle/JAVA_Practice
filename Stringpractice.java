public class Stringpractice {

    public static void main(String[] args) {
        String name1 = "Rahul"; //stack
        String name2 = new String("rahul"); //heap

        if (name1.equalsIgnoreCase(name2))
            System.out.println("match");
        else
            System.out.println("not match");
        // System.out.println(name.length());
        // System.out.println(name.charAt(5));
        // System.out.println(name.indexOf("R"));
        // System.out.println(name.substring(6, 9));
        // System.out.println(name.concat(" lived here"));
        // System.out.println(name + " lived here");
        // System.out.println(name.toUpperCase());

    }

}
