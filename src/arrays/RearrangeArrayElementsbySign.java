package arrays;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] nums={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
//        rearrange(nums);
        rearrange1(nums);
    }
//    static void rearrange(int[] nums){
//
//
//    }
    static void rearrange1(int[] nums){
        int pos=0;
        int neg=1;
        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                ans[pos]=nums[i];
                pos+=2;
            }else{
                ans[neg]=nums[i];
                neg+=2;
            }

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
