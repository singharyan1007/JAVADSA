package conditionals.funcs;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//       String nm= hello();
//        System.out.println(nm + " is the best");
        int add=sum3(20,30);
        System.out.println(add);
    };
//    static String hello(){
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter  name");
//        String stg=in.next();
////        System.out.println(sg + "is the best friend");
//        return stg;
//
//    }
//    static void sum(){
//        Scanner in=new Scanner(System.in);
//        int num1,num2,sum;
//        System.out.print("Enter a number :");
//        num1=in.nextInt();
//        System.out.print("Enter next number :");
//        num2=in.nextInt();
//        sum=num1+num2;
//        System.out.println(sum);
//    }

    //passing the parameters while calling the function
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;

    }
}
