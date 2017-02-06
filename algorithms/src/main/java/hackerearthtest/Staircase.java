package hackerearthtest;

import java.util.Scanner;

/**
 * Created by Duke on 2/4/2017.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                if (j + i > t) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
