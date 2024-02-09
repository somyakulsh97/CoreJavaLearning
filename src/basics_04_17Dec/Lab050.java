package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
//we have three types of if-else condition
        //1. if-else
        if(true){
            System.out.println("true");
        }
        else{
            System.out.println("flase");
        }

        //2. only if
        if(true){
            System.out.println("only if");
        }

        //3. there are multiple if-else conditions
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number>20){
            System.out.println("number is > 20");
        }else if (number > 10){
            System.out.println("number is > 10");

        }else{
            System.out.println("number is < 20");
        }
    }
}
