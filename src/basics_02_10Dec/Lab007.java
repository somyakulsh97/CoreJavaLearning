package src.basics_02_10Dec;

public class Lab007 {
    public static void main(String[] args) {
/*
* Author : Somya Kulshreshtha
* Program : showcase differentiate between println and print
*
* */
        System.out.print("hello world");
        System.out.println("somya");

        int age = 34;
        char ch = 'A';
        String s = "somya";
        float x = 2.3f;


//        %d = any integer --> int, short , long, byte.
        System.out.printf("my age is %d", age);

        System.out.println();


//        %c = char
        System.out.printf("c value is --> %c",ch);

        System.out.println();


//        %s = String
        System.out.printf("s value is --> %s", s);

        System.out.println();

//        %f = float;
        System.out.printf("x value is --> %f", x);
    }
}
