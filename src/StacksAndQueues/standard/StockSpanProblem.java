package StacksAndQueues.standard;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        //https://leetcode.com/problems/online-stock-span/
        //https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

    }
    static int ssp(int price){
        int span=1;
        Stack<int[]> st=new Stack<>();
        while(!st.isEmpty() && st.peek()[0]<=price){
            span+=st.pop()[1];
        }
        st.push(new int[] {price,span});
        return span;
    }
    public static int[] calculateSpan(int arr[], int n)
    {
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        ans[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])st.pop();
            if(st.isEmpty())ans[i]=i+1;
            else arr[i]=i-st.peek();

            st.push(i);
        }
        return ans;


    }
}
