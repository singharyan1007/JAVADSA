package Recursion;

public class NoOfSteps {
    public static void main(String[] args) {

        System.out.println(num(123,0));
    }
    static int num(int n,int steps){
        if(n<1){
            return steps;
        }
        if(n%2==0){
            return num(n/2,steps+1);
        }else{
            return num(n-1,steps+1);
        }
        //if even then divide by two otherwise subtract 1 from it


    }

}
