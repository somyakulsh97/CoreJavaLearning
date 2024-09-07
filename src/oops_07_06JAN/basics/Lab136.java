package src.oops_07_06JAN.basics;

public class Lab136 {
    public static void main(String[] args) {

        //program : to reverse the word using string builder.
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
