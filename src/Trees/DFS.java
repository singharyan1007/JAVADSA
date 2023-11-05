package Trees;
import java.util.*;
public class DFS {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public DFS() {

    }
    boolean findPath(Node root,int[] arr){
        if(root==null){
            return arr.length==0;
        }
       return helper(root,0,arr);

    }
    boolean helper(Node node, int index,int[] arr){
        if(node==null)return false;

        if(index>=arr.length || node.value!=arr[index]){
            return false;
        }
        //reaching the root node
        if(node.left==null && node.right==null && index==arr.length-1){
            return true;
        }
        return helper(node.left,index+1,arr)||helper(node.right,index+1,arr);

    }
}
