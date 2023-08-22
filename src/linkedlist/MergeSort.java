package linkedlist;

public class MergeSort {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }




    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

//    ListNode getMid(ListNode head){
//        ListNode fast=head;
//        ListNode slow=head;
//
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        return slow;
//
//    }
        //gives stackOverflow error

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }



    // Flattening a linkedList
     ListNode flatten(ListNode head){
                if(head==null||head.next==null){
                    return head;
                }
                //Now we go to the second last head
                head.next=flatten(head.next);

                head=mergeTwoLists(head,head.next);

                return head;
    }

     ListNode mergeTwoLists(ListNode a, ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        //Merge two sorted lists
         while(a!=null && b!=null){
             if(a.val<b.val){
                 dummy.next=a;
                 dummy=dummy.next;
                 a=a.next;
             }else{
                 dummy.next=b;
                 dummy=dummy.next;
                 b=b.next;
             }

         }
         //add remaining elements
         dummy.next=(a!=null)?a:b;

         return res.next;

    }



    class ListNode{
        int val;
        ListNode next;

        public ListNode(){}

        ListNode(int x){
            val=x;
            next=null;
        }
    }


}
