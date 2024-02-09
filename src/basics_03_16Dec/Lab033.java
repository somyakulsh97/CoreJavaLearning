package src.basics_03_16Dec;

public class Lab033 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";       //this is store in the string constant pool.
        String name2 = new String("The Testing Academy");   //this type of string store in OBJECT AREA or we can say that it will store in heap area.
//        how many string : total 2 string because string name and name1 have same value.

        System.out.println(name==name1);     //comparison operator checks for reference so its output is true.
        System.out.println(name.equals(name1));        // equals check for value
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
