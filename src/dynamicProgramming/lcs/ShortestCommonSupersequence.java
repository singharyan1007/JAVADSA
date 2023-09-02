package dynamicProgramming.lcs;

public class ShortestCommonSupersequence {
    public static void main(String[] args) {
        String s1 = "brute";
        String s2 = "groot";

        System.out.println("The Longest Common Supersequence is "+shortestCommonSupersequence(s1,s2));
    }

    public static String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] t = new int[n + 1][m + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }


        int len = t[n][m];
        int i = n;
        int j = m;
        int index = len - 1;
        String str = "";

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                str += str1.charAt(i - 1);
                index--;
                i--;
                j--;
            } else {
                if (t[i - 1][j] > t[i][j - 1]) {
                    str += str1.charAt(i - 1);
                    i--;
                } else {
                    str += str2.charAt(j - 1);
                    j--;
                }
            }
        }
        while (i > 0) {
            str += str1.charAt(i - 1);
            i--;
        }
        while (j > 0) {
            str += str2.charAt(j - 1);
            j--;
        }

        String ans2 = new StringBuilder(str).reverse().toString();

        return ans2;

    }
}
