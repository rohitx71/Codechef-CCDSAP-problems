package Recursion;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GSJANB {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        BigInteger diff;
        diff = new BigInteger("0");

        while (t-- > 0) {
           diff=BigInteger.ZERO;
            int n = sc.nextInt();
            sc.nextLine();


            long a[] = new long[n];
            for (int i = 0; i < n; i++) {

                StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
                for (int j = 0; j < n; j++) {
                    a[j] = Long.parseLong(stringTokenizer.nextToken());
                }
                Arrays.sort(a, 0, n);
                diff = diff.add(BigInteger.valueOf(Math.abs(a[n - 1] - a[0])));
            }

            System.out.println(diff);
        }


    }

}
