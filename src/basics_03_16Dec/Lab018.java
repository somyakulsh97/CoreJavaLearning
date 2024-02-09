package src.basics_03_16Dec;

public class Lab018 {
    public static void main(String[] args) {
    int a =10;
    int b = 45;
//   concatenation operator usage
        String name = "pramod";
        System.out.println(a+name);
        System.out.println(a+b);
        System.out.println(name+a);
//        famous interview question what is the output of
//        concatenation will only happen with string + other
        System.out.println(a+b+name);   //process is left to right so the output is 55pramod
//        all the + below are concatenation means if we are using + after string then will perform like concatenation.
        System.out.println(name+a+b);


    }
}
