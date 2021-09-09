import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // Type casting,(winding)
        // Storing one variable into another variable of different datatypes

        /*
         * byte n1 = 20; // byte is of less size as comapre to int so will be store
         * easily int n2 = n1; System.out.println(n1);
         */

        // storing long data type into short

        /*
         * int n1 = 10; byte n2 = (byte) n1; System.out.println(n1);
         */
        // Relational operator using string without creating object

        /*
         * String name1 = "areej"; String name2 = "Areej";
         * System.out.println(name1.equals(name2));
         */
        // Control statments
        // if else statment
        /*
         * int age = 20; if (age > 18) System.out.println("can drive"); else
         * System.out.println("cannot");
         */
        // if and else if ladder
        /*
         * int marks = 55; if (marks < 50) { System.out.println("fail"); } else if
         * (marks >= 50 && marks < 60) { System.out.println("D grade");
         * 
         * } else if (marks >= 80 && marks < 90) { System.out.println("A");
         * 
         * } else { System.out.println("invalid"); }
         */

        // switch statment
        /*
         * int n = 20; switch (n) {
         * 
         * case 1:
         * 
         * System.out.println("This is Case1"); break; case 20:
         * 
         * System.out.println("This is case20"); break; default:
         * System.out.println("invalid"); }
         */

        // Loop

        // int i;
        // for (i = 0; i < 5; i++) {
        // System.out.println("this is me");
        // }

        /*
         * int i = 0; while (i < 5) { System.out.println("Hello"); i++; }
         */
        // Arrays string
        /*
         * ArrayList<String> ns = new ArrayList<>(); ns.add("a"); ns.add("b");
         * ns.add("c"); System.out.println(ns);
         */

        // Array Linklist
        LinkedList<String> n = new LinkedList<String>();
        n.add("b");
        n.add("v");
        n.add("b");
        System.out.println(n);
        n.add(0, "c");
        System.out.println(n);
        // creating new link list and merge inti the old linklisk
        LinkedList<String> m = new LinkedList<String>();
        m.add("b");
        m.add("v");
        m.add("b");

        n.addAll(m);
        System.out.println(n);

    }
}
