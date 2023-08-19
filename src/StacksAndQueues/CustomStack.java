package StacksAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    //WHEN NO SIZE IS GIVEN
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    //SIZE IS GIVEN
    public CustomStack(int size) {
        this.data = new int[size];
    }
    // PUSHING AN ITEM
    public boolean push(int item){
        //but if the array is already full, so it should throw an error
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        //first we increase the pointer and then insert the value
        ptr++;
        data[ptr]=item;
        return true;
    }
    // POPPING AN ITEM
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
//        return data[ptr--];
        int removed=data[ptr];
        //first removed then pointer decremented
        ptr--;
        return removed;
    }


    //PEEKING A DATA
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from empty stack");
        }
        return data[ptr];
    }






   public boolean isFull(){
        return ptr == data.length-1;
        //pointing at the last data;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

}
