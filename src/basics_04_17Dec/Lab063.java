package src.basics_04_17Dec;

public class Lab063 {
    public static void main(String[] args) {
        // JDK > 13
        // ->
        //        advanced switch case

        int itemCode = 005;
        switch (itemCode) {
            //in this case we are not using break it will  automatically add break

            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
