package Recursion;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
//        System.out.println(dicelist("",4));
        int[] arr={2,3,4,6};
        System.out.println(dicelis("",7,arr));



    }
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> dicelist(String p, int target){
        if(target==0){
            ArrayList<String> alist=new ArrayList<>();
            alist.add(p);
            return alist;
        }
        ArrayList<String> alist=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            alist.addAll(dicelist(p+i,target-i));
        }
        return alist;
    }

    static ArrayList<String> dicelis(String p, int target,int[] arr){
        if(target==0){
            ArrayList<String> alist=new ArrayList<>();
            alist.add(p);
            return alist;
        }
        ArrayList<String> alist=new ArrayList<>();
        for(int i=1;i<arr.length && i<=target;i++){
            alist.addAll(dicelis(p+arr[i],target-arr[i],arr));
        }
        return alist;
    }
}
