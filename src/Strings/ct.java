package Strings;

import java.util.Arrays;

public class ct {
    public static void main(String[] args) {
        String str="0110";
        System.out.println(maximumOddBinaryNumber(str));
    }

    public static String maximumOddBinaryNumber(String s) {
        int one = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '1'){
                one++;
            }
        }
        char[] t = new char[s.length()];
        Arrays.fill(t, '0');
        t[t.length-1] = '1';
        for(int i = 0;i < one-1;i++){
            t[i] = '1';
        }
        return new String(t);
    }
}
