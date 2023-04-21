package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        //GeeksForGeeks
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2={1, 2, 3};
        System.out.println(findUnion(arr1,arr2,arr1.length,arr2.length));

    }
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m)
    {
        // add your code here
        ArrayList<Integer> alist=new ArrayList<>();
        int[] k=new int[m+n];
        for(int i=0;i<arr1.length;i++){
            k[i]=arr1[i];

        }
        System.out.println(Arrays.toString(k));
        int ptr=0;
        for(int i=arr1.length;i<k.length;i++){
            k[i]=arr2[ptr];
            ptr++;

        }
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
        for(int i=0;i<k.length;i++){
            if(!alist.contains(k[i])){
                alist.add(k[i]);
            }
        }

        return alist;
    }
}
