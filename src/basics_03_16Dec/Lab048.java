package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        //Take two input from user and give max of two number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a, b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is bigger than b");
        }else{
            System.out.println("b is bigger than a");
        }
    }
}
