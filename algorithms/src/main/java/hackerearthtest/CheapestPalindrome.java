package hackerearthtest;

import java.util.Scanner;

/**
 * Created by Duke on 2/4/2017.
 */
public class CheapestPalindrome {
    public static void main(String[] args) {
        int aCost = 72;
        int bCost = 23;
        String str = "baba//aaa/ab//";
        System.out.println(findCost(str, aCost, bCost));
    }

    private static int findCost(String source, int aCost, int bCost) {
        int cost = 0;
        if (isPalindrome(source) && !source.contains("/")) {
            return cost;
        } else if (source.contains("/")) {
            String first = source.substring(0, source.length() / 2);
            String second = reverse(source.substring(source.length() / 2));
            System.out.println(first);
            System.out.println(second);
            for (int i = 0; i < first.length() - 1; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (first.charAt(i) != '/') {
                        cost += cost(first.charAt(i), aCost, bCost);
                    } else {
                        cost += cost(second.charAt(i), aCost, bCost);
                    }
                } else if (first.charAt(i) == '/' && second.charAt(i) == '/') {
                    cost += aCost < bCost ? aCost : bCost;
                }
            }
        }
        return cost;
    }

    private static int cost(char charAt, int aCost, int bCost) {
        if (charAt == 'a') {
            return aCost;
        } else if (charAt == 'b') {
            return bCost;
        } else {
            return 0;
        }
    }

    private static boolean isPalindrome(String source) {
        String reverse = reverse(source);
        return reverse.equals(source);
    }

    private static String reverse(String source) {
        String reverse = "";
        if (source != null && source != "") {
            for (int i = source.length() - 1; i >= 0; i--) {
                reverse = reverse + source.charAt(i);
            }
        }
        return reverse;
    }

}
