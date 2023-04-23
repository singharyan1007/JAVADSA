package Recursion;

public class fibonacciFormula {
    public static void main(String[] args) {
        System.out.println(fiboformula(656));

    }
    static int fiboformula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }


}
