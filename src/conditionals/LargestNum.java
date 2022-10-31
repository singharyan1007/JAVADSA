package conditionals;
//Largest among three numbers
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int large=0;
        if(a>b)
        {
            large=a;
            if(a>c){
                large=a;
            }
            else{
                large=c;
            }

        }
        else{
            large=b;
            if(b>c){
                large=b;
            }
            else{
                large=c;
            }

        }
        System.out.println(large);
        

    }
}
