package Bitwise;

import java.util.Arrays;

public class XORoperationinarray {
    public static void main(String[] args) {
        int n=5;
        int start=0;
        System.out.println(xorOperation(n,start));


    }
    static int xorOperation(int n, int start) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
        }
        System.out.println(Arrays.toString(nums));
        int sum=nums[0];
        for(int j=0;j<n-1;j++){
            sum^=nums[j+1];
        }
        return sum;

    }
}
