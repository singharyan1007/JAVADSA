package Trees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BinaryTrees tree=new BinaryTrees();
        tree.populate(scan);
        tree.prettyDisplay();


    //Binary search tree
//     BST tree = new BST();
//     int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//     Arrays.sort(nums);
////     tree.populate(nums);
//        tree.populatedSorted(nums);
//     tree.display();
    }
}
