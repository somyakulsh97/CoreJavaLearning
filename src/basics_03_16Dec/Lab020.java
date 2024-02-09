package src.basics_03_16Dec;

public class Lab020 {
    public static void main(String[] args) {
//        Relational operator
        int age_aryan = 30;
        int age_arvi = 34;
        boolean result = age_arvi > age_aryan;
        System.out.println(result);
//    >, <, >=, <=, ==, =/=(!=);

        int a = 10;
        int b = 10;
        boolean c = (a==b);

        boolean c1 = (a>b);
//        in case of int it will check for value.
//        in case of string it will check for references.
        System.out.println(c);
        System.out.println(c1);

    }
}
