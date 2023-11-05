package StacksAndQueues.standard;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Smallestnumberonleft {
    //Nearest smallest number on left



    // https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
    public static void main(String[] args) {

        int[] arr={1,3,2,4};
        System.out.println(leftSmaller(4,arr));
    }
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code
        List<Integer> alist=new ArrayList<>();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=a[i]){
                st.pop();
            }
            if(st.isEmpty())alist.add(-1);
            else{
                alist.add(st.peek());
            }
            st.push(a[i]);
        }
        return alist;
    }
}
