package src.oops_07_06JAN.basics;

public class Lab131 {
    public static void main(String[] args) {
        String name = "Pramod";
        System.out.println(name.concat(" Dutta"));
        System.out.println(name + " Dutta");
        System.out.println(name.contains("a"));

        //Note: original string will remain same because of string are immutable in nature.
        System.out.println(name);    //output: Pramod


        String name2 = new String("Dutta");


        String expected_result = "password@123";
        String actual_result  = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }
    }
}
