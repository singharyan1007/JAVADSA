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

    // Merge Lists

//     static LeetcodeLL mergeTwoLists(LeetcodeLL list1, LeetcodeLL list2) {
//        LeetcodeLL dummyHead=new LeetcodeLL();
//        LeetcodeLL node=dummyHead;
//        while(list1!=null && list2!=null){
//            if(list1.value<list2.value){
//                node.next=list1;
//                list1=list1.next;
//
//
//            }else{
//                node.next=list2;
//                list2=list2.next;
//
//
//            }
//            node=node.next;
//        }
//        node.next=list1==null?list2:list1;
//
//        return dummyHead.next;
//
//    }



    //3. Detecting the startint node of the Cycle
    // KUNAL!=SOLUTION
    public Node detectCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                fast=head;
                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                }
                if(fast==slow){
                    return slow;
                }
            }
        }
        return null;
    }

    //KUNAL==SOLUTION

























    //4.  https://leetcode.com/problems/reverse-linked-list/
    //reversing a singly linkedlist in-place

    public void  reverse(){
        if(size<2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node second=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=second;
            while(second.next!=null){
                second=second.next;
            }
        }
        head=prev;
    }

    // Reversing a LinkdeList using Recursion
    public static Node RecurReverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=RecurReverse(head.next);
        //This will basically go to the last element
        // Node when we will come out of the function call
        // then we will be reversing the list
        head.next.next=head;
        //then we will break the link
        head.next=null;

        return newHead;
    }


    //5. https://leetcode.com/problems/reverse-linked-list-ii/

    public Node reverseBetween(Node head,int left, int right){
        if(left==right){
            return head;
        }
        Node prev=null;
        Node current=head;
        for(int i=0;current!=null && i<left-1;i++){
            prev=current;
            current=current.next;
        }

        Node last=prev;
        Node newEnd=current;


        //Now perform reversal between the left and right
        Node next=current.next;
        for(int i=0;current!=null && i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;

    }


    //6. PALINDROMIC LIST https://leetcode.com/problems/palindrome-linked-list/

//    public boolean isPalindrome(ListNode head) {
//        ListNode mid = middleNode(head);
//        ListNode headSecond = reverseList(mid);
//        ListNode rereverseHead = headSecond;
//
//        // compare both the halves
//        while (head != null && headSecond != null) {
//            if (head.val != headSecond.val) {
//                break;
//            }
//            head = head.next;
//            headSecond = headSecond.next;
//        }
//        reverseList(rereverseHead);
//
//        return head == null || headSecond == null;
//
//    }
//
//    static  ListNode middleNode(ListNode head) {
//        ListNode s = head;
//        ListNode f = head;
//
//        while (f != null && f.next != null) {
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//    static ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode prev = null;
//        ListNode present = head;
//        ListNode next = present.next;
//
//        while (present != null) {
//            present.next = prev;
//            prev = present;
//            present = next;
//            if (next != null) {
//                next = next.next;
//            }
//        }
//        return prev;
//    }
//






























    //6. https://leetcode.com/problems/linked-list-cycle/
    //Concept of fast and slow pointer
    //fast -> jumps two nodes ata time. So if loop is present then
    //slow and fast pointer will surely meet

    public boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }
    static int cycleLength(Node head){
        //Count the length of the cycle
        Node fast=head;
        Node slow=head;
        int count=0;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                //calculate the length
                Node temp=slow;
                //wont work if using while so use do...while
                do{
                    temp=temp.next;
                    count++;
                }while(temp!=slow);
                return count;
            }
        }
        return 0;
    }

        //7. Google: https://leetcode.com/problems/happy-number
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findSqaure(slow);
            fast=findSqaure(findSqaure(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;

    }

    private int findSqaure(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }




    // 8. https://leetcode.com/problems/middle-of-the-linked-list/
    public static Node middleNode(Node head) {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    //Bubble sort on linkedLists using the pattern approach
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node first=get(col);
            Node second=get(col+1);

            if(first.value>second.value){
                //swap
                //Now there are three cases
                //1. First at HEAD
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }else if(second==null){
                    //2. Second is at tail
                    Node prev=get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=null;

                }else{
                    //3. The first and second are in the mid
                    Node prev=get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;

                }
                bubbleSort(row,col+1 );
            }else{
                bubbleSort(row-1,0);
            }

        }
    }


























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
