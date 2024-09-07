package src.oops_07_06JAN.oops;

public class Lab141 {
    public static void main(String[] args) {
        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept

        Person p = new Person();
        p.name = "Amit";
        System.out.println(p.name);

        Person p2 = new Person();
        p2.name = "Pramod";
        System.out.println(p2.name);


        new Person(); // object -> new Object
        // Person(); -> Method or Function
        Person p3 = null;
        System.out.println("End of the Program");

        // here there are three object are created.
        // p,p2 and p3 - Ref -
        // p -> Amit , p2 -> Pramod, p3 -> null

    }
}
