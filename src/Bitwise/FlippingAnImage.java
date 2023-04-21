package Bitwise;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        flip(image);
        for(int i=0;i<image.length;i++){
            System.out.println(Arrays.toString(image[i]));
        }

    }
    static void flip(int[][] image){
        int n=(image[0].length + 1) / 2;
//        System.out.println(n);
        for(int[] row:image){
            //reverse each row
            //invert it

            for (int i = 0; i < (image[0].length + 1) / 2; i++) {

                int temp = row[i] ^ 1;
                System.out.println(row[image[0].length-i-1]);
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;

            }

        }

    }
}
