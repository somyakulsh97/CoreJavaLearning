package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println("your score --> A");
        } if (score >= 80 && score <= 89){
            System.out.println("your score --> B");
        } if (score >= 70 && score <= 79) {
            System.out.println("your score --> C");
        } if (score >= 60 && score <= 69) {
            System.out.println("your score --> D");
        }if(score >= 0 && score <= 59){
            System.out.println("your score --> F");
        }
    }
}
