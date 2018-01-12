package MOCK3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SIMPSTAT {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            sc.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            long a[] = new long[n];
            double sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(stringTokenizer.nextToken());
                sum += a[i];
            }
            Arrays.sort(a, 0, n);
            for (int i = 0; i < k; i++) {
                sum = (sum-a[i]) - a[n - i-1];
            }
            //System.out.println(sum);

            System.out.println(sum/(n-(2*k)));

        }
    }
}
