package hackerearthtest;

import java.util.Scanner;

/**
 * Created by Duke on 2/4/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            for (int j = 1; j <= n; j++) {
                if (j % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (j % 3 == 0) {
                    System.out.println("Fizz");
                } else if (j % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(j);
                }
            }
        }
    }
}
