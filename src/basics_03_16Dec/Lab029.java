package src.basics_03_16Dec;

public class Lab029 {
    public static void main(String[] args) {
//        New operator : help you to create new object for the class

        String s1 = "Somya";  //this string is created in string constant pool. SCP/ string pool

        String s2 = new String("Somya");    //this string is created in object area or we can say that heap area

//        s1==s2 comparison operator checks reference ....references are not equals
//        s1.equals(s2) .....equal to method check for the value. they are equal

        System.out.println(s2);
//        System.out.println(new String(original: "Somya"));
    }
}
