package StacksAndQueues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int end=0;
    int front=0;
    int size=0;


    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from empty Queue");
        }
        int removed=data[front++];

        //shifting the elements
        front=front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{

        if(isEmpty()){
            throw new Exception("Cannot remove from empty Queue");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty queue");
        }
        int i=front;
        do{
            System.out.print(data[i]+" <- ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("End");
    }









    public boolean isFull(){
        return size==data.length;
        //end is not data.length because it may come back to 0 and stuff

    }
    public boolean isEmpty(){
        return size==0;
    }
}
