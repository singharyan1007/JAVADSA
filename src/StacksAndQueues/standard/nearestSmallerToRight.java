package StacksAndQueues.standard;

import java.util.Arrays;
import java.util.Stack;

public class nearestSmallerToRight {
    //Given an array of integers, find the closest (not considering distance, but value) smaller on right of every element.
    // If an element has no smaller on the right side, print -1. .
    public static void main(String[] args) {
        int[] arr={1,3,4,2};
        System.out.println(Arrays.toString(nsr(arr)));

    }
    static int[] nsr(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i])st.pop();

            if(!st.isEmpty())ans[i]=st.peek();
            else{
                ans[i]=-1;
            }
            st.push(arr[i]);
        }

        return ans;

    }
}
