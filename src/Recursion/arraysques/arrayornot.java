package Recursion.arraysques;

public class arrayornot {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,9,12};
        System.out.println(ar(arr,0));

    }
    static boolean ar(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && ar(arr,index+1);
    }
}
