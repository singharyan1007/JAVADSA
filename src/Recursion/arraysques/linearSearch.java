package Recursion.arraysques;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        int target=9;
        System.out.println(search(arr,0,target));
    }
    static boolean search(int[] arr,int index,int target){
        if(index==arr.length){
            return false;
        }


        return arr[index]==target || search(arr,index+1,target);
    }
}
