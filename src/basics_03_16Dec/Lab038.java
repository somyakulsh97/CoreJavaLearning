package src.basics_03_16Dec;

public class Lab038 {
    public static void main(String[] args) {
        //ternary operator
        int a = 10;
        int b = 20;
        int c = 12;
        int max = (a>b) ? ((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}
