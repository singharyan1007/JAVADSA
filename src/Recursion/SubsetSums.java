package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSums {
    public static void main(String[] args) {
//        int[] arr={2, 3};
//        ArrayList<Integer> sumList=new ArrayList<>();
//        ArrayList<ArrayList<Integer>> list=subSum(arr);
//        for(int i=0;i<list.size();i++){
//            int sum=0;
//            for(int j=0;j<list.get(i).size();j++){
//               sum+=list.get(i).get(j);
//                System.out.println(sum);
//
//            }
//            sumList.add(sum);
//
//        }
//        System.out.println(list);
//        System.out.println(sumList);
        int[] arr={2,3};
        sub(arr,0,new ArrayList<>());


    }
    static ArrayList<ArrayList<Integer>> subSum(int[] arr ){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();

        int sum=0;
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int j=0;j<n;j++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static void sum(int[] num,int sumVal, int ind,ArrayList < Integer > sumSubset){
        if(ind==num.length){
            sumSubset.add(sumVal);
            return;
        }
        sum(num,sumVal+num[ind],ind+1,sumSubset);
        sum(num,sumVal,ind+1,sumSubset);

    }
    static void sub(int[] num, int ind,ArrayList < Integer > sumSubset){
        if(ind==num.length){
            System.out.println(num[ind]);
            return;
        }
        sub(num,ind+1,sumSubset);
        sub(num,ind,sumSubset);

    }


}
