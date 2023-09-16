package StacksAndQueues.standard;

import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
    int[] arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int max=0;
        int n=heights.length;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                max=getMax(heights,st,i,max);
            }
            st.push(i);
        }
        int i=heights.length;
        while(!st.isEmpty()){
            max=getMax(heights,st,i,max);
        }
        return max;
    }

    static int getMax(int[] heights, Stack<Integer> st, int i, int max){
        int area=0;
        int popped=st.pop();
        if(st.isEmpty()){
            area=heights[popped]*i;
        }else{
            area=heights[popped]*(i-st.peek()-1);
        }

        return Math.max(max,area);
    }

}
