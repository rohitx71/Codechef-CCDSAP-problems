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
            //long dp[][] = new long[n][n];
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(stringTokenizer.nextToken());
            }


            long min1[] = new long[n];
            long max1[] = new long[n];


            long min2[] = new long[n];
            long max2[] = new long[n];

            max_from_left(a, n, max2, max1);
            min_from_left(a, n, min2, min1);


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

    static void max_from_left(long a[], int n, long max1[], long max[]) {

        //long max[] = new long[n];
        max[0] = a[0];
        long curr = a[0];
        max1[0] = a[0];
        long curr2 = a[0];
        for (int i = 1; i < n; i++) {
            curr = Math.max(curr + a[i], curr);
            max[i] = Math.max(max[i - 1], curr);

            curr2 = Math.min(curr2 + a[i], curr2);
            max1[i] = Math.min(max1[i - 1], curr2);
        }


        //return Math.abs(max - min);
    }


    static void min_from_left(long a[], int n, long min[], long min1[]) {


        long curr = a[n - 1];
        long curr2 = a[n - 1];
        min[n - 1] = a[n - 1];
        for (int i = n - 2; i > -1; i--) {
            curr = Math.max(curr + a[i], curr);
            min[i] = Math.max(min[i + 1], curr);


            //long min[] = new long[n];
            //min[0]=a[0];
            min1[n - 1] = a[n - 1];

            curr2 = Math.min(curr2 + a[i], curr2);
            min1[i] = Math.min(min1[i + 1], curr2);

        }


    }


}


