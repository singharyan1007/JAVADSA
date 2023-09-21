package Strings;

public class reverseSprecialString {
    public static void main(String[] args) {
        String s="A&x#B";
        char[] str=s.toCharArray();
      char[] temp=new char[str.length];
      int x=0;
      for(int i=0;i<str.length;i++){
          if(str[i]>='a' && str[i]<='z'|| str[i]>='A' && str[i]<='Z'){
              temp[x]=str[i];
              x++;
          }
      }

      rev(temp,0,x);
      x=0;
      for(int i=0;i<str.length;i++){
          if(str[i]>='a' && str[i]<='z'|| str[i]>='A' && str[i]<='Z'){
              str[i]=temp[x];
              x++;
          }
      }
      String rev=new String(str);

        System.out.println(rev);
    }

    private static void rev(char[] temp, int l, int x) {
        for(int i=l;i<x/2;i++){
            char t=temp[i];
            temp[i]=temp[x-l-1];
            temp[x-l-1]=t;

        }
    }
}
