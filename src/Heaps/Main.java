package Heaps;

import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) throws Exception {
        basics<Integer> heap = new basics<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
//        heap.print();

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
