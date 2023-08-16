package linkedlist;


public class LL {
    private Node head;
    private Node tail;
    //benefit of taking this extra variable is that if we want to add a node at last we can do so in constant time complexity
    private int size;

    public LL(){
        this.size=0;
    }
    //Inserting an element
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    // Inserting @ last position
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    // Inserting at a particular position
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        //We begin our traversal from the head
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }
    //Deleting a node(first)
    //To do so we move the positions of the head
    //If only single element then  put head and tail both as null
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //Deleting the last node
    // *****MY SOLUTION*******
    public Node deleteLast(){
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
        return temp;
    }
    //****KUNAL METHOD*****
    public int deleteLAST(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        System.out.println(size);
        int val= tail.value;;
        tail=secondLast;
        tail.next=null;
        return val;
    }


    //deleting a particular node
    public int deleteElement(int index){
        if(index==0)
            return deleteFirst();
        if(index==size-1)
            return deleteLAST();

        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

//    Finding a value
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val)
                return node;

            node=node.next;
        }

        return null ;
    }



    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

















//    Displaying the linkedlist
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }





    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
