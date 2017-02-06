package hackerearthtest;

import java.util.Scanner;

/**
 * Created by Duke on 2/4/2017.
 */
public class Summation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//
//        for (int i = 1; i <= t; i++) {
//            for (int j = 1; j <= t; j++) {
//                if (j + i > t) {
//                    System.out.print('#');
//                } else {
//                    System.out.print(' ');
//                }
//            }
//            System.out.println();
//        }
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s.nextInt();
        }

        System.out.print(sum);

        String s1 = null;

//        char[] c = "somthing";
        int[] i = new int[15];

        Foo f = new Foo();
        Foo.Bar b = f.new Bar();
    }

//    int methodA(byte x, double y) {
//        return (long) x / y * 2;
//    }
}

class Foo {
    class Bar{}
}
