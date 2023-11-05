package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class biweekly {
    public static void main(String[] args) {
        List<String> words = List.of("1","prev","2","prev","prev");
        List<Integer> result = lastVisitedIntegers(words);

        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 2 1 -1
    }
    public static List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> lastVisited = new ArrayList<>();
        int consecutivePrev = 0;
        List<Integer> integers = new ArrayList<>();

        for (String word : words) {
            if (word.equals("prev")) {
                consecutivePrev++;

                if (consecutivePrev <= integers.size()) {
                    lastVisited.add(integers.get(integers.size() - consecutivePrev));
                } else {
                    lastVisited.add(-1);
                    consecutivePrev-=1;
                }
            } else {
                int num = Integer.parseInt(word);
                integers.add(num);

            }
        }

        return lastVisited;
    }
}
