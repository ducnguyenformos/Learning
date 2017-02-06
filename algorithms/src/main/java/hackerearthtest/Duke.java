package hackerearthtest;

import java.util.Scanner;

/**
 * Created by Duke on 2/4/2017.
 */
public class Duke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        int[] rets = new int[numberOfTests];
        for (int i = 0; i < numberOfTests; i++) {
            String str = scanner.next().trim();
            int aCost = scanner.nextInt();
            int bCost = scanner.nextInt();

            rets[i] = calculatePalindrome(str, aCost, bCost);
        }

        for (int i = 0; i < numberOfTests; i++) {
            System.out.println(rets[i]);
        }
    }

    private static int calculatePalindrome(String str, int aCost, int bCost) {
        char[] s = str.toCharArray();
        int minCost = (aCost > bCost) ? bCost : aCost;

        int totalCost = 0;
        for (int i = 0; i < s.length/2; i++) {
            if (s[i] == 'a') {
                if (s[s.length - 1 - i] == '/') {
                    totalCost += aCost;
                } else if (s[s.length - 1 - i] == 'b') {
                    return -1;
                }
            } else if (s[i] == 'b') {
                if (s[s.length - 1 - i] == '/') {
                    totalCost += bCost;
                } else if (s[s.length - 1 - i] == 'a') {
                    return -1;
                }
            } else if (s[i] == '/') {
                totalCost += s[s.length - 1 - i] == 'a' ? aCost : s[s.length - 1 - i] == 'b' ? bCost : 2 * minCost;
            }
        }
        return totalCost;
    }
}
