package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Decompress {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(decompress(nums)));

    }
    static int[] decompress(int[] nums) {
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2){
            for(int j=0;j<nums[i];j++){
                alist.add(nums[i+1]);
            }
        }
        int[] arr=new int[alist.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=alist.get(i);
        }
        return arr;
    }
}
