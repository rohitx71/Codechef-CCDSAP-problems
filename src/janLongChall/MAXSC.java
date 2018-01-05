package janLongChall;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MAXSC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {

            for (int i = 0; i < ; i++) {
                
            }
            sc.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());

            long a[] = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(stringTokenizer.nextToken());
                sum += a[i];
            }
            Arrays.sort(a, 0, n);
            if (k > n - k) {
                k = n - k;
            }
            long min = 0;
            for (int i = 0; i < k; i++) {
                min += a[i];
            }
            sum = sum - min;

            System.out.println(Math.abs(sum - min));
        }
    }
}


