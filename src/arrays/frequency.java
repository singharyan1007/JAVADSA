package arrays;

public class frequency {
    public static void main(String[] args) {
        int[] arr={1, 7, 4, 3, 4, 8, 7};
        System.out.println(freq(arr,2));

    }
    static int freq(int[] arr,int k){
        int[] f=new int[201];
        for(int i=0;i<arr.length;i++){
            System.out.println(f[arr[i]]);
            f[arr[i]]++;
            System.out.println(f[arr[i]]);
            if(f[arr[i]]==k){
                return arr[i];
            }
        }
        return -1;
    }
}
