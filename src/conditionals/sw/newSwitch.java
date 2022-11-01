package conditionals.sw;

import java.util.Scanner;

public class newSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String ch=in.next();
        switch (ch) {
            case "mango" -> System.out.println("King of fruits");
            case "orange" -> System.out.println("Citrus fruits");
            default -> System.out.println("Get valid fruit");
        }
    }

}
