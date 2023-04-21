package Math;

import java.util.Arrays;

public class BinarySearchInForest {
    public static void main(String[] args) {
        int n = 5, k = 4;
       int[] tree = {2, 3, 6, 2, 4};
        System.out.println(search(tree,n,k));
    }
    static int search(int[] tree,int n,int k){
        Arrays.sort(tree);
        int h=-1;
        int s=0;
        int e=n-1;
        while(s<=e){
            int sum=0;
            int m=s+(e-s)/2;
            for(int i=m;i<n;i++){
                sum+=tree[i]-tree[m];
            }
            if(sum==k){
                return tree[m];
            }else if(sum<k){
                s=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}
