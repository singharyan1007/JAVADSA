package arrays;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    static int[] removeDuplicates(int[] nums){
        int pos=2;

        for(int i=2;i<nums.length;i++){

            if(nums[i]!=nums[pos-2]){
                nums[pos]=nums[i];
                pos++;
            }
        }
        return nums;
    }
}
