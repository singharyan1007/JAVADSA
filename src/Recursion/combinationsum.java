package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationsum {
    public static void main(String[] args) {
        int[] arr={2,3,4,6};
        List < List < Integer >> ans = new ArrayList < > ();
        comb(arr,0, ans,7, new ArrayList< >());

    }
    static void comb(int[] arr, int ind, List<List<Integer>> ans, int target, List<Integer> list){
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (list));
            }
            System.out.println(ans);
            return;
        }
        if(arr[ind]<=target){
            list.add(arr[ind]);
            comb(arr, ind,ans,target-arr[ind],list);
            list.remove(list.size()-1);
        }
        comb(arr,ind+1,ans,target,list);
    }
}
