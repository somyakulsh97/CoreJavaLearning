package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

//        int a = 34;
        //can we take the input from user in java?
        //to take input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        if(a%2 == 1){
            System.out.println("ODD number");
        }else{
            System.out.println("Even Number");
        }


    }
}
