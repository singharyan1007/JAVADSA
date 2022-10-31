package conditionals;



public class Occurence {
    public static void main(String[] args) {
        int k=13589398;
        int count=0;

        while(k>0){
           int rem=k%10;
            if(rem == 3){
                count++;
            }
            k=k/10;
        }
        System.out.println(count);
    }
}
