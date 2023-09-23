package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LongestStringChain {
    public static void main(String[] args) {
        String[] words={"a","b","ba","bca","bda","bdca"};
        System.out.println(lsc(words));
    }

    static int lsc(String[] str){
        Arrays.sort(str,(a,b)->a.length()-b.length());

        HashMap<String, Integer> sp=new HashMap<>();

        int ans=0;
        for(String s:str){
            sp.put(s,1);
            for(int i=0;i<s.length();i++){
                String st=s.substring(0,i)+s.substring(i+1);
                if(sp.containsKey(st)){
                    sp.put(s,Math.max(sp.get(s),sp.get(st)+1));
                }
            }
            ans=Math.max(ans,sp.get(s));
        }

        return ans;

    }
}
