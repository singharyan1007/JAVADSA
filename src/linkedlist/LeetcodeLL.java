package linkedlist;

public class LeetcodeLL {
    private LeetcodeLL.Node head;
    private LeetcodeLL.Node tail;
    //benefit of taking this extra variable is that if we want to add a node at last we can do so in constant time complexity
    private int size;

    public LeetcodeLL(){
        this.size=0;
    }

    // 1. https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                //else we simply traverse the list
                node=node.next;
            }
        }
        //whenwe reach the last node we assign the tail to it
        tail=node;
        tail.next=null;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;

        }
        size++;
    }

    public void insertLast(int val){

        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    // 2. https://leetcode.com/problems/merge-two-sorted-lists/description/

    public static LeetcodeLL sortLists(LeetcodeLL first, LeetcodeLL second ){

        Node f=first.head;
        Node s=second.head;
        LeetcodeLL ans=new LeetcodeLL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;

        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }

        return ans;
    }


    //3.  https://leetcode.com/problems/reverse-linked-list/
    //reversing a singly linkedlist in-place





























    //4. https://leetcode.com/problems/linked-list-cycle/


























    private class Node{
        private int value;
        private LeetcodeLL.Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, LeetcodeLL.Node next){
            this.value=value;
            this.next=next;
        }
    }
}
