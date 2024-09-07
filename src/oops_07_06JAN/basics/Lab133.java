package src.oops_07_06JAN.basics;

public class Lab133 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed) whenever we are trying to change them a new string will be created. but existed one cann't be changed.
        String s1 = "Pramod";
        String s2 = new String("Pramod");


//        StringBuffer sbuf4 = new StringBuffer("Pramod");

        // Mutable - that can be changed!!
        // sb3 : creates a new string Pramod Dutta older one is deleted. same as string buffer
        StringBuilder sb3 = new StringBuilder("Pramod");
        sb3.append(" Dutta");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
