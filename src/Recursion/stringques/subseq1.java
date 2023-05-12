package Recursion.stringques;

import java.util.ArrayList;
import java.util.Collections;

public class subseq1 {
    public static void main(String[] args) {
//        sub("","abc");
//        Collections.sort(alist);
//        System.out.println(alist);
        ArrayList<String> ist=subRet("","abc");
        Collections.sort(ist);
        System.out.println(ist);

    }
    static void subs(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subs(p+ch,up.substring(1));
        subs(p,up.substring(1));

    }


    static ArrayList<String> alist=new ArrayList<>();
    static void sub(String p, String up){
        if(up.isEmpty()){
            if(!p.equals(""))
              alist.add(p);
            return;
        }
        char ch=up.charAt(0);
        sub(p,up.substring(1));
        sub(p+ch,up.substring(1));



    }

    static ArrayList<String> subRet(String p, String up){
        ArrayList<String> alist=new ArrayList<>();
        if(up.isEmpty()){
            if(!p.equals(""))
                alist.add(p);
            Collections.sort(alist);
            return alist;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subRet(p,up.substring(1));
        ArrayList<String> right=subRet(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }
}
