package src.basics_01_9Dec;

public class Lab002 {
    public static void main(String[] args) {


//    keywords are in lower case.
//    we can't use keywords as variable
//        
        byte age = 10;  //Range of Byte -128 to 127
        age = 127 ; //out of Range
        System.out.println(age);
        System.out.println(age+1);
//        age = age + 1;    //we cant take like this because now age value is 128 that is out of range for byte.
        System.out.println(age);

        short _age = 128; // Range of short -32768 to 32767
        System.out.println(_age);

//        age and _age both are different variable name.
    }
}
