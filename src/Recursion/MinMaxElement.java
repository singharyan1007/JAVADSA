package Recursion;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] arr={1,4,45,5,-50,10,2};
        int n=arr.length;
        System.out.println(minmax(arr,n));
    }

    static int minmax(int[] arr,int n){
        if(n==1)
            return arr[1];

        return Math.max(arr[n-1],minmax(arr,n-1));
    }

}
