package src.oops_concepts_07_30Dec;
import java.util.Scanner;
public class Lab116 {
    // can we have two function as main
    //we can create main function as many we want but JVM only recognize public static void main(string[], args)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        System.out.println(scanner.next());
    }
    public static void main(int a) {
        System.out.println("Another Main");
    }
    public static int main(int a,int c,int d) {
        return 99;
    }

    public static void main(int a,int b) {
        System.out.println("Another Main");
    }
}
