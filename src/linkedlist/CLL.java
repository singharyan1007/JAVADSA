package linkedlist;

public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head=null;
        this.tail=null;
    }

    // Inserting an element at the tail
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            //condition of the empty list or no elements
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }


    // Deleting a node
    public void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }

        do{
            Node n =node.next;
            if(n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);



    }



    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.val+" -> " );
                if(node.next!=null){
                    node=node.next;
                }

            }while(node!=head);
        }
        System.out.println("HEAD");

    }







    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }
}
