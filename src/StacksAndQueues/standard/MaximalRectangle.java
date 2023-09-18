package StacksAndQueues.standard;

import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int max=0;
        int m=matrix.length;
        int n=matrix[0].length;

        int[] arr=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0'){
                    arr[j]=0;
                }else{
                    arr[j]+=1;
                }
            }
            max=Math.max(max,largestRectangle(arr));
        }

        return max;
    }

    static int largestRectangle(int[] arr){
        Stack<Integer> st=new Stack<>();

        int max=0;
        st.push(0);
        int n=arr.length;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                max=getMax(arr,st,i,max);
            }
            st.push(i);
        }
        int i=arr.length;
        while(!st.isEmpty()){
            max=getMax(arr,st,i,max);
        }
        return max;
    }

    static int getMax(int[] arr, Stack<Integer> st, int i, int max){
        int area=0;
        int popped=st.pop();
        if(!st.isEmpty()){
            area=arr[popped]*(i-1-st.peek());
        }else{
            area=arr[popped]*i;
        }
        return Math.max(max,area);
    }

}
