package sorting;

import java.util.Arrays;

public class bubblesort {
    //basic sorting method
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4,4,15,1,1,100,8,8,11,7,112};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapped;

        //run the no of steps
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each step, max item will come at last respective index
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                //if for a particular value of i, you did not swap , that means the array is sorted; so break
                if(!swapped)
                    break;
                //
            }
        }
    }
}
