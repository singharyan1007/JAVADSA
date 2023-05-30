package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combination2 {
    public static void main(String[] args) {
        int[] arr={2,3,4,6};
        List < List < Integer >> ans = new ArrayList< >();
//        comb(arr,0, ans,7, new ArrayList< >());
    }
    static void comb(int[] arr, int ind, int target, List<List<Integer>> ans, List<Integer> list){
        if(target==0){
            ans.add(list);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>target) break;
            list.add(arr[i]);

            comb(arr,i+1,target-arr[i],ans,list);
            list.remove(list.size()-1);
        }

    }
}
