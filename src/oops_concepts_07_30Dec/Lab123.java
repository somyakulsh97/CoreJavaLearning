package src.oops_concepts_07_30Dec;
import java.util.Scanner;

public class Lab123 {
    //Program : another way to swap the number but this method is not work when one var valure is 0.
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the a");
            int a = sc.nextInt();
            System.out.println("Enter the b");
            int b = sc.nextInt();

            a = a * b;
            b = a / b;
            a = a / b;


            System.out.println("Value of a -> " + a);
            System.out.println("Value of b -> " + b);

        } catch (Exception e) {
            System.out.println("Not Possible zero");
        }




//        // bitwise xor
//        a = a ^ b; // BINARY AND XOR GATE
//        b = a ^ b;
//        a = a ^ b;



    }
}
