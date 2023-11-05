package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class balanced {
    public static void main(String[] args) {
//    int[] arr={-1,2,-2,1};
//        Arrays.sort(arr);
//        System.out.println(arr);
//    boolean[] ans=new boolean[arr.length];
//    Arrays.fill(ans,false);
//    for(int i=0;i<arr.length;i++){
//        for(int j=i+1;j<arr.length;j++){
//            if(arr[i]==arr[j]){
//                ans[i]=true;
//            }
//        }
//    }
//    for(int i=0;i<ans.length;i++){
//        if(ans[i]==false){
//            System.out.println(1);
//        }
//        else
//        {
//            System.out.println(0);
//        }
        System.out.println(app("aabeedccaaee"));
    }

    static String app(String str){
        int i=0;
        int j=0;

        int n=str.length();
        String res="";
        while(i<n && j<n){
            if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'){
                j++;

            }
            if(j-i>2){
                res=res+str.substring(i,j);
            }else if(j-i==2){
                res+=str.substring(i,j)+"$";
                i=j;
            }else{
                j++;
            }

        }
        return res;
    }





}
