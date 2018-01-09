package MOCK2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DELISH {
    static int count = 0;
    static int fail = 0;

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)

        {

            int n = sc.nextInt();

            sc.nextLine();
            long a[] = new long[n];
            long dp[][] = new long[n][n];
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(stringTokenizer.nextToken());
            }
            long max = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i; j < n - 1; j++) {


                    long temp = calculate(a, i, j, j + 1, i + 1, n, max, dp);
                    if (temp > max) {
                        max = temp;
                    }
                }
            }

            System.out.println(max);
            System.out.println("Count : " + count + " : fail " + fail);

        }

    }

    static long calculate(long a[], int starti, int startj, int endi, int endj, int n, long max, long dp[][]) {

        long dist;
        if (dp[starti][startj] != 0) {
            dist = dp[starti][startj];
            count++;
        } else {
            dist = distance(a, starti, startj, dp);

        }


        for (int i = endi; i < n; i++) {
            for (int j = i; j < n; j++) {
                //  long val=Math.abs(calculate(a,starti,startj,i,j,n,max);
                long val;
                if (dp[i][j] != 0) {
                    count++;
                    val = Math.abs(dist - dp[i][j]);
                } else {
                    val = Math.abs(dist - distance(a, i, j, dp));
                }

                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    static long distance(long a[], int start, int end, long dp[][]) {
        fail++;
        long sum = 0;
        for (int i = start; i <= end; i++) {
            if (dp[start][end] != 0) {
                sum = dp[start][end];
            } else {
                sum += a[i];
                dp[start][i] = sum;
            }
        }
        return sum;
    }
}
