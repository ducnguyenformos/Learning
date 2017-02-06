package hackerearthtest;

import java.util.Scanner;

/**
 * Created by Duke on 2/4/2017.
 */
public class Palindrome
{
    public static int t;
    private static Scanner sca;
    public static int[] re;
    public static int Process(String s, int a, int b)
    {
        int cost = 0;
        int n = s.length();
        char[] str = s.toCharArray();
        for(int fi = 0 ; fi < n; fi++)
        {
            if(str[fi] == '/')
            {
                if(str[n - 1 - fi] == '/')
                    if(a < b)
                    {
                        str[fi] = str[n - 1 - fi] = 'a';
                        cost += 2 * a;
                    }
                    else
                    {
                        str[fi] = str[n - 1 - fi] = 'b';
                        cost += 2 * b;
                    }
                else
                {
                    str[fi] = str[n - 1 - fi];
                    if(str[n - 1 - fi] == 'a')
                        cost += a;
                    else
                        cost += b;
                }
            }
            else
            {
                if(str[fi] == 'a')
                    if(str[n - 1 - fi] == 'b')
                        return -1;
                    else if(str[n - 1 - fi] == '/')
                    {
                        str[n - 1 - fi] = 'a';
                        cost += a;
                    }
                if(str[fi] == 'b')
                    if(str[n - 1 - fi] == 'a')
                        return -1;
                    else if(str[n - 1 - fi] == '/')
                    {
                        str[n - 1 - fi] = 'b';
                        cost += b;
                    }
            }
        }
        return cost;
    }
    public static void main(String[] args)
    {
        sca = new Scanner(System.in);
        t = sca.nextInt();
        re = new int[t];
        for(int fi = 0; fi < t; fi++)
        {
            String s;
            int a, b;
            s = sca.next();
            //System.out.println(s);
            a = sca.nextInt();
            b = sca.nextInt();
            re[fi] = Process(s, a, b);
        }
        for(int fi = 0; fi < t; fi++)
            System.out.println(re[fi]);
    }
}