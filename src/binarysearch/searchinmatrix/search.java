package binarysearch.searchinmatrix;

import java.util.ArrayList;
import java.util.List;

public class search {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        comb(arr, 0, n, k, ans, new ArrayList<>());
        return ans;
    }


        static void comb(ArrayList<Integer> arr, int ind, int n,int target,ArrayList<ArrayList<Integer>> ans,  List<Integer> list){
            if(ind==n){
                if (target == 0) {
                    ans.add(new ArrayList < > (list));
                }

                return;
            }
            if(arr.get(ind)<=target){
                list.add(arr.get(ind));
                comb(arr,ind,n,target-arr.get(ind),ans,list);
                list.remove(arr.size()-1);
            }
            comb(arr,ind+1,n,target,ans,list);
        }

}
