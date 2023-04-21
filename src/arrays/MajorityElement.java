package arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majority(arr));

    }
    static int majority(int[] arr){
        int[] f=new int[201];
        for(int i=0;i<arr.length;i++){
            System.out.println(f[arr[i]]);
            f[arr[i]]++;
            System.out.println(f[arr[i]]);
            if(f[arr[i]]==(arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    }
}
