package src.oops_07_06JAN.basics;

public class Lab130 {
    public static void main(String[] args) {
        //how to create string syntax
        String name = "Pramod"; // String constant Pool ....this syntax will create the string in the string constant pool.
        String name2 = new String("Pramod"); // Heap area.....this syntax will create the string in the Heap area.
        // Note : string are immutable in nature means once the string is created it will not delete.
        name = "Dutta";
        //if we reassign the value then a new string will be create and str1 pointing to the new string.
        String str1 = "Hello";
        str1  = str1.concat("Pramod");
        System.out.println(str1);

        // Interview Question : if we print str2. str2 is still pointing to Hello. Hello pramod is just created it is empty it is basically food for garbage collector.
        String str2 = "Hello";
        str2.concat("Pramod");
        System.out.println(str2);
    }
}
