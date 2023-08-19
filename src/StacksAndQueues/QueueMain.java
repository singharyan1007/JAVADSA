package StacksAndQueues;

public class QueueMain  {
    public static void main(String[] args) throws Exception{
//        CustomQueue qu=new CustomQueue(5);
//          CircularQueue qu=new CircularQueue(5);
        DynamicQueue qu=new DynamicQueue(5);
        qu.insert(10);
        qu.insert(0);
        qu.insert(1);
        qu.insert(11);
        qu.insert(12);
        qu.insert(13);
        qu.insert(1704);
        qu.display();
        qu.remove();
        qu.display();
        qu.insert(1007);
        qu.display();

//        System.out.println(qu.front());



    }
}
