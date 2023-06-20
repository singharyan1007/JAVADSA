package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupliateSubsets {
    public static void main(String[] args) {
        //We follow the same concept of accepting one vale and rejecting the same
//        int[] arr={1,2,3};
//        System.out.println(Dupsub(arr));
        int[] num={1,1,3};
        System.out.println(SubsetDup(num));

    }
    static List<List<Integer>> Dupsub(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int n=outer.size();
            //the above statement creates a copy of the outer list
            //then we can add each number to the outer list
            for(int i=0;i<n;i++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
              internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }


    static List<List<Integer>> SubsetDup(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
          start=0;
            //if previous and current element are same
            //start=end+1;
            //end becomes end index of outer list
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            //end becomes last element of outer list
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
