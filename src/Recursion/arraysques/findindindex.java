package Recursion.arraysques;

import java.util.ArrayList;

public class findindindex {
    // find all the index of the target
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=1;
        search(arr,target,0);
        System.out.println(alist);

//        System.out.println(findallindex(arr,target,0,new ArrayList<>()));

    }
    static ArrayList<Integer>alist=new ArrayList<>();
    static void search(int[] arr, int target, int index){
        if(index==arr.length)
            return;
        else if(arr[index]==target)
            alist.add(index);
        search(arr,target,index+1);
    }

    //Another approach
    static ArrayList<Integer> findallindex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index==arr.length)
            return list;
        if(arr[index]==target)
            list.add(index);
       return findallindex(arr,target,index+1,list);
    }
}
