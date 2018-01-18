package MOCK4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MAXDIFF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            sc.nextLine();

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            int a[] = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(stringTokenizer.nextToken());
                sum += a[i];
            }
            Arrays.sort(a, 0, n);

            k = Math.min(k, n - k);

            for (int i = 0; i < k; i++) {
                sum = sum - (a[i]*2);
            }

            System.out.println(sum);

        }
    }
}


