package StacksAndQueues.standard;

import java.util.*;

public class nge {
    //THIS IS NEXT GREATER TO RIGHT
    //https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        Stack<Long> st = new Stack<>();
        long[] res = new long[n];
        for(int i=n-1;i>=0;i--){
            long val=arr[i];

            while(!st.isEmpty() && st.peek()<=val)st.pop();

            long num=st.isEmpty()?-1:st.peek();

            res[i]=num;
            st.push(val);


        }

        return res;
    }




}
