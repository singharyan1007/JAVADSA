package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinations {
    public static void main(String[] args) {
        System.out.println(paint(5,2));
    }


      static int paint(int input1, int input2) {
        List<Integer> temp = new ArrayList<>();
        dfs(1, input1, input2, temp);
        return ans.size()%7;
    }
    private static List<List<Integer>> ans = new ArrayList<>();

     static void dfs(int i, int n, int k, List<Integer> temp) {
        if (k == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (i > n) return;
        dfs(i + 1, n, k, temp);
        temp.add(i);
        dfs(i + 1, n, k - 1, temp);
        temp.remove(temp.size() - 1);
    }
}
