package Trees;

public class AVL {
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

    public AVL() {

    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        //new node is created only when no node is present on left or right
        //of the current node for which function is called

        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        //if already a node is present no new node is created,
        //current node is returned

        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        //after every function call, the current node is being returned
        //not the node.left or the node.right, only the current node

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }



    //--------------------------------------ROTATE----------------------------------
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            //Now there are two sub cases
            if(height(node.left.left)-height(node.left.right)>0){
                //left-left case
                return rotateRight(node);
            }

            if(height(node.left.left)-height(node.left.right)<0){
                //left-right case
                node.left=rotateLeft(node.left);
                return rotateRight(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            // right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // right right case
                return rotateLeft(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // left right case
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }
        }

        return node;

    }

    public Node rotateRight(Node p){
        Node child=p.left;
        Node item=child.right;

        child.right=p;
        p.left=item;
        p.height=Math.max(height(p.left),height(p.right)+1);
        child.height=Math.max(height(child.left),height(child.right)+1);
        return child;
    }
    public Node rotateLeft(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);



        return p;
    }





    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    //inserting a sorted array
    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

}
