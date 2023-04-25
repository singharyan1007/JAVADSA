package Recursion.arraysques;

import java.util.ArrayList;

public class findindindex {
    // find all the index of the target
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9,7,1};
        int target=1;
        search(arr,target,0);
        System.out.println(alist);

    }
    static ArrayList<Integer>alist=new ArrayList<>();
    static void search(int[] arr, int target, int index){
        if(index==arr.length)
            return;
        else if(arr[index]==target)
            alist.add(index);
        search(arr,target,index+1);
    }
}
