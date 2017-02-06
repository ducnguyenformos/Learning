package hackerearthtest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class TestClass {
    static Map<Character, Integer> costMap = new HashMap<Character, Integer>();
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int result[] = new int[N];
        int total = 0;
        String input = null;
        int aCost, bCost;
        for (int k = 0; k < N; k++) {
            input = br.readLine();
            aCost = Integer.parseInt(br.readLine());
            bCost = Integer.parseInt(br.readLine());
            costMap.put('a', aCost);
            costMap.put('b', bCost);
            total = 0;
            try {
                for ( int i = 0, j = input.length() - 1; i < input.length()/2; i++, j--) {
                    total += getCheapCostToPalindrome(input.charAt(i), input.charAt(j));
                }
                System.out.println( (total > 0 ? total : "-1") );
            } catch ( Exception e) {
                System.out.println("-1");
            }
            total = 0;
        }
    }

    private static int getCheapCostToPalindrome(char literal, char mirrorLiteral) throws Exception {
        if ( literal == '/') {
            if ( mirrorLiteral != '/') // single '/'
                return costMap.get(mirrorLiteral);
            else { // double '/'
                if ( costMap.get('a') <= costMap.get('b') )
                    return (2 * costMap.get('a'));
                else
                    return (2 * costMap.get('b'));
            }
        } else if ( mirrorLiteral == '/' ) {
            return costMap.get(literal);
        } else if ( literal == mirrorLiteral )
            return 0;
        else
            throw new Exception("Can Never Be A Palindrome");
    }
}