package conditionals.sw;

import java.util.Scanner;

public class NestedSw {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String ch=in.next();
        switch (num) {
            case 1 -> System.out.println("Aryan");
            case 2 -> {
                System.out.println("Vanshika");
                switch (ch) {
                    case "profession" -> System.out.println("Doctor");
                    case "age" -> System.out.println("21");
                    case "cllg" -> System.out.println("gsvm");
                    default -> System.out.println("Enter correct code");
                }
            }
            default -> System.out.println("Enter correct number");
        }
    }
}
