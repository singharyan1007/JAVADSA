package Recursion.stringques;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PermutationsString {
    public static void main(String[] args) {
//        permutations("","abc");
        System.out.println(perm("","abc"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> perm(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){

            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(perm(f+ch+s,up.substring(1)));
        }
        return ans;
    }
}
