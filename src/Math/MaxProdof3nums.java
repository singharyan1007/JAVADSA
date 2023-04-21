package Math;

import java.util.Arrays;

public class MaxProdof3nums {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        Arrays.sort(nums);
        int prod=1;
        for(int i=nums.length-1;i>=nums.length-3;i--){
            prod*=nums[i];

        }
        System.out.println(prod);
    }
    }

