package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab051_calculator {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // 1. Input from user
        // Score(Data type) -> int  -> Grade ( char or String)
        // DAA- Ask for the confirmation of the doubts


        // 2. Basic login or Brute force Logic write basic rough code
        // if score >= 90 && score  <=100 -> print A
        // else if score >= 80 && score  89 <= 100 -> print B


        // 3. Write the real code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println("your score --> A");
        }else if (score >= 80 && score <= 89){
            System.out.println("your score --> B");
        }else if (score >= 70 && score <= 79) {
            System.out.println("your score --> C");
        }else if (score >= 60 && score <= 69) {
            System.out.println("your score --> D");
        }else{
            System.out.println("your score --> F");
        }


    }
}
