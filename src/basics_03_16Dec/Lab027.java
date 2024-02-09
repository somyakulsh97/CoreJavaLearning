package src.basics_03_16Dec;

public class Lab027 {
    public static void main(String[] args) {
//        Type casting....casting means to mold the something.
        byte b = 10;
        int a = b; //....byte have small container and int has big container so there is no need of casting it is automatically done by JVM and this type is called implicit casting.
//        int a = (int)b; // both lines are same....7 and 8.
//
//        when you basically put a smaller version into a bigger version then itt is called Widening


        // let's do reverse
        int a1 = 300;
//        byte b1 = a1;     //overflow will happens......implicit narrowing is not allowed by the JVM.
//        when you do reverse it is called Narrowing
        byte b1 = (byte)a1;   //EXPLICIT CASTING
        System.out.println(b1);

    }
}
