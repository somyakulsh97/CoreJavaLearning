package src.basics_05_23Dec;
import java.util.Scanner;
public class Lab095 {

    public static void main(String[] args) {
        // Sum of Digit = 5+4+3+2+1


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        long fact = 0;

        for (int j = 1; j <= number ; j++) {
            fact = fact+j;
        }

        System.out.println("sum --> "+ fact);


        sc.close();
    }}
