package arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        //Strings are immutable in Java while Arrays are.
        int[] num={1,2,3,4};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr ){
        arr[0]=100;
    }
}
