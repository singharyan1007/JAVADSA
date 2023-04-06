package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersinArray {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int leader=arr[n-1];
        arr1.add(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i-1]){
                leader=arr[i];
                arr1.add(leader);
            }
        }
        Collections.reverse(arr1);
        return arr1;


    }

}
