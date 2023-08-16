package linkedlist;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){this.size=0;};

    //Inserting at First position
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    //Insert @ last position

    public void insertLast(int val){
        Node node=new Node(val);

        Node last=head;
        node.next=null;

        if(head==null){
            //empty list
            node.prev=null;
            head=node;
            return;
        }

        //traversal
        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
    }

//    public void addLast(int val){
//
//        if(tail==null){
//            insertFirst(val);
//            return;
//        }
//        Node node=new Node(val);
//        tail.next=node;
//        tail=node;
//
//    }

    //finding  a value
    public Node find(int val){

        Node node=head;
        while(node!=null){
            if(node.val==val)
                return node;
            node=node.next;

        }
        return null;
    }

    //Inserting at a position
    public void insert(int val, int after){

       Node p=find(after);
       if(p==null){
           System.out.println("Doesnt exist");
           return;
       }
       Node node=new Node(val);
       node.next=p.next;
       p.next=node;
       node.prev=p;
       if(node.next!=null){
           //edge cases like the tail
           node.prev.next=node;
       }

    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }



    private class Node{
        int val;
        Node next;
        Node prev;


        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
