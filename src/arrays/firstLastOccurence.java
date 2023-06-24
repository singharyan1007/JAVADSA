package arrays;

import java.util.Arrays;

public class firstLastOccurence {
    public static void main(String[] args) {
        int[]ms = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(ms,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] arr, int target,boolean searchOccurence){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(searchOccurence){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
