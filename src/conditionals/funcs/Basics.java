package conditionals.funcs;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
       String nm= hello();
        System.out.println(nm + " is the best");
    };
    static String hello(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter  name");
        String sg=in.next();
//        System.out.println(sg + "is the best friend");
        return sg;

    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter a number :");
        num1=in.nextInt();
        System.out.print("Enter next number :");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println(sum);
    }
}
