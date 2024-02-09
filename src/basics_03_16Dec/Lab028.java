package src.basics_03_16Dec;

public class Lab028 {
    public static void main(String[] args) {
//        real world example
        int course = 100;
        float GST = 0.1845f;
        float total = course + GST*course;
        System.out.println(total);
//        int has smaller container than float so in the total we took float otherwise we will loss the data.
    }
}
