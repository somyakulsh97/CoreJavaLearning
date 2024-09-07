package src.oops_07_06JAN.basics;

public class Lab132 {
    public static void main(String[] args) {
        //Important interview question :
        String s1 = "Pramod";           // this will create in SCP
        String s2 = new String("Pramod");          // this will create in heap area. thats why s1==s2 are not equal.
        String s3 = new String("pramod");
        System.out.println(s1 == s2);     //are they equal : no
        System.out.println(s1.equals(s2));     //they are equal because it check for contents means value.


        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
