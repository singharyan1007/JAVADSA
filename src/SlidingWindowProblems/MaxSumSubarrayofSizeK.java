package SlidingWindowProblems;

public class MaxSumSubarrayofSizeK {
    public static void main(String[] args) {
        int[] arr={5,2,1,8,9,1};
        int k=3;
        System.out.println(sum(arr,k));

    }
    static int sum(int[] arr, int k){
        int i=0,j=0,sum=0,res=0;
        while(j<arr.length){
            sum=sum+arr[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                res=Math.max(res,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return res;
    }
}
