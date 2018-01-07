package janLongChall;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MAXSC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            long a[][] = new long[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
                for (int j = 0; j < n; j++) {
                    a[i][j] = Long.parseLong(stringTokenizer.nextToken());
                }
                Arrays.sort(a[i], 0, n);
            }

            // System.out.println(max1);
     /*       for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    System.out.print(" " + a[i][j]);
                }
                System.out.println();
            }*/
            Boolean flag = false;
            long max[] = new long[n];
            long sum = 0;
            sum = max[n - 1] = a[n - 1][n - 1];
            //          System.out.println("Sum :" + sum + "max[n-1]" + max[n - 1]);

            int[] index = new int[n];

            index[n - 1] = n - 1;
//            System.out.println("index[n-1] :" + index[n - 1]);

            if (n > 1) {
                for (int i = n - 2; i > -1; i--) {
                    //           System.out.println("i :" + i);
                    //                   System.out.println(sum);

                    for (int j = n - 1; j > -1; j--) {
                        //             System.out.println("j :" + j);

                        if (a[i][j] < max[i + 1]) {
                            max[i] = a[i][j];
                            sum += a[i][j];
                            index[i] = j;
                            /*System.out.println("******DIRECT IF condition***");

                            System.out.println("Sum :" + sum + "max[i]" + max[i]);
                            System.out.println("index[i] :" + index[i]);
*/
                            break;
                        }
                        if (j == n - 1) {
                            //                          System.out.println("****** J=N-1 IF condition***");

                            int k = Arrays.binarySearch(a[i], max[i + 1]);
                            if (k == 0) {
                                i = -1;
                                flag = true;
                                break;
                            }

                            if (k > -1 && a[i][k - 1] != a[i][k]) {
                                //                            System.out.println("K:" + k + " i : " + i);
                                max[i] = a[i][k - 1];
                                sum += a[i][k - 1];
                                index[i] = k - 1;
      /*                          System.out.println("****** Binary search successful condition***");

                                System.out.println("Sum :" + sum + "max[i]" + max[i]);
                                System.out.println("index[i] :" + index[i]);
      */
                                break;
                            }
                        }
                        if (j == 0) {

                            i = -1;
                            flag = true;
                        }
                    }
                    /*if (i == n) {
                        //System.out.println("******FINAL I==N IF condition***");

                        sum = -1;
                        break;
                    }*/
                }
            }

            if (flag) {
                sum = -1;
            }

          /*  if (sum != -1)
                for (int i = 0; i < n; i++) {
                    sum += max[i];
                    //          System.out.println(max[i]);
                }
          */
            System.out.println(sum);
        }
    }
}
//t0:
/*
1
5
8 9 10 11 12
8 9 11 12 13
7 8 10 14 17
10 11 12 13 14
9 11 14 17 18
t2:
1
5
1 9 10 11 12
2 9 11 12 13
3 4 10 14 17
5 11 12 13 14
6 7 8 9 10
t3:
1
5
1 9 10 11 12
2 9 11 12 13
0 0 0 1 2
5 11 12 13 14
6 7 8 9 10
t4:
1
5
5 9 10 11 12
1 9 11 12 13
0 0 0 1 2
5 11 12 13 14
6 7 8 9 10

t5:
1
3
0 0 1
00 00 00
0 0 0

t6:
1
5
0 1 1 11 10000000005
1 2 2 2 10000000006
0 0 0 1 10000000007
5 11 12 13 10000000008
6 7 8 9 10000000009

t7:
1
1
1
*/


