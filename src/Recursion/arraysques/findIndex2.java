package Recursion.arraysques;

import java.util.ArrayList;

public class findIndex2 {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9,7,1};
        int target=1;
        System.out.println(find(arr,target,0));
    }
    static ArrayList<Integer> find(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        //this adds the value of the present function call
        if(arr[index]==target){
            list.add(index);
        }
        //this contains the value of the functions called form below
        ArrayList<Integer> alist=find(arr,target,index+1);
        list.addAll(alist);
        return list;
    }
}
