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


            long min1[] = new long[n];
            long max1[] = new long[n];


            long min2[] = new long[n];
            long max2[] = new long[n];

            max_from_left(a, n, min1, max1);
            min_from_left(a, n, min2, max2);
    
            /*for (int i = 0; i < n - 1; i++) {
=======
            long max = 0;
            for (int i = 0; i < n - 1; i++) {
>>>>>>> origin/master
                for (int j = i; j < n - 1; j++) {


                    long temp = calculate(a, i, j, j + 1, i + 1, n, max, dp);
                    if (temp > max) {
                        max = temp;
                    }
                }
<<<<<<< HEAD
            }*/
            long max = max1[0] - min1[1];
            long maxx = max2[0] - min2[1];
            for (int i = 0; i < n - 1; i++) {

                if (Math.abs(max1[i] - min1[i + 1]) > max) {
                    max = Math.abs(max1[i] - min1[i + 1]);
                }


                if (Math.abs(max2[i] - min2[i + 1]) > maxx) {
                    maxx = Math.abs(max2[i] - min2[i + 1]);
                }
            }
            System.out.println(max > maxx ? max : maxx);
            //System.out.println("Count : " + count + " : fail " + fail);

        }

    }

    static void max_from_left(long a[], int n, long min[], long max[]) {

        //long max[] = new long[n];
        max[0] = a[0];
        long curr = a[0];
        for (int i = 1; i < n; i++) {
            curr = Math.max(curr + a[i], curr);
            max[i] = Math.max(max[i - 1], curr);
        }
        curr = a[n - 1];
        //long min[] = new long[n];
        //min[0]=a[0];
        min[n - 1] = a[n - 1];
        for (int i = n - 2; i > -1; i--) {
            curr = Math.min(curr + a[i], curr);
            min[i] = Math.min(min[i + 1], curr);
        }


        //return Math.abs(max - min);
    }


    static void min_from_left(long a[], int n, long min[], long max[]) {


        max[0] = a[0];
        long curr = a[0];
        for (int i = 1; i < n; i++) {
            curr = Math.min(curr + a[i], curr);
            max[i] = Math.min(max[i - 1], curr);
        }
        curr = a[n - 1];
        min[n - 1] = a[n - 1];
        for (int i = n - 2; i > -1; i--) {
            curr = Math.max(curr + a[i], curr);
            min[i] = Math.max(min[i + 1], curr);
        }


    }

    /*static long calculate(long a[], int starti, int startj, int endi, int endj, int n, long max, long dp[][]) {
=======
            }

            System.out.println(max);
            System.out.println("Count : " + count + " : fail " + fail);

        }

    }

    static long calculate(long a[], int starti, int startj, int endi, int endj, int n, long max, long dp[][]) {
>>>>>>> origin/master

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
<<<<<<< HEAD
    }*/
}


