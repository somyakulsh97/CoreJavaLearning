package src.oops_07_06JAN.basics;

public class Lab134 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the String builder, string buffer OR String
        // ans is string buider or stirng buffer.

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append(" Dutta");
        System.out.println(password2);

    }
}
