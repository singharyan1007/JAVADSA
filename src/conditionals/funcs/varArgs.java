package conditionals.funcs;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(5,6,7,8,9);
        mulfunc(10,20,"Aryan","Vanshika");
        //order of passing the values matters a lot
    }
    static void mulfunc(int a,int b,String ...c){
        System.out.println(Arrays.toString(c));
        System.out.println(a+b);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));//Just like destructuring in javascript
    }
}
