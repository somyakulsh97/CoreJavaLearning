package src.basics_03_16Dec;

public class Lab021 {
    public static void main(String[] args) {
//        interview question - Relational operator
        System.out.println( 10 == 10);
        System.out.println( 10 >= 10);
        System.out.println( 10 <= 10);
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);

        System.out.println("---------");

//        character in sop is integer it is not possible in the assignment operator it is possible in only comparison operator.
//        System.out.println('A' = 65); it will give error.
        System.out.println('A' == 65);

//        interview question ....o/p of this line
        byte b = 65;
        System.out.println('A' == b);     //when we use b in the SOP statement it will become interger.
        System.out.println('A' == 65.0);     //output is true because the moment we use float in SOP statement it will become int.....it will possible in the comparison operator.
//        between two boolean there is no comparison operator.






    }
}
