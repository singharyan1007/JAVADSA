package StacksAndQueues.standard;

import java.util.Arrays;
import java.util.Stack;
// Given an array of integers, find the closest (not considering distance, but value) greater on left of every element.
// If an element has no greater on the left side, print -1 .
public class nextGreaterToLeft {
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        System.out.println(Arrays.toString(ngl(arr)));

    }
    static int[] ngl(int[] arr){
        int[] ng=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i])st.pop();
            if(st.isEmpty())ng[i]=-1;
            else{
                ng[i]=st.peek();
            }

            st.push(arr[i]);
        }
        return ng;
    }
}
