package StacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws Exception {
//        CustomStack stack=new CustomStack(5);
          DynamicStack stack=new DynamicStack(5);
        stack.push(34);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(1007);
        stack.push(04);

        System.out.println(stack.pop());
        //LIFO


    }
}
