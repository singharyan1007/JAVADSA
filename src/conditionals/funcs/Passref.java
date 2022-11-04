package conditionals.funcs;

import java.util.Arrays;

public class Passref {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
        //to print an array we use this Arrays.toString(array)

    }
    static void change(int[] num ){
     num[0]=9;//if you make a change to this object via a reference variable , same object will be changed
    }
}
