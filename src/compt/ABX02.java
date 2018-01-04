package compt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
Counter : 0: Cheat : 8:Zero : 1: wasted : 0
        1024
        Counter : 972: Cheat : 1032:Zero : 53: wasted : 4097
*/

public class ABX02 {
    /*static long counter = 0;
    static long cheat = 0;
    static long nulled = 0;
    static long zero = 0;
*/
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            int p = Integer.parseInt(stringTokenizer.nextToken());
            int q = Integer.parseInt(stringTokenizer.nextToken());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            stringTokenizer = new StringTokenizer(sc.nextLine());
            int b1 = Integer.parseInt(stringTokenizer.nextToken());
            int b2 = Integer.parseInt(stringTokenizer.nextToken());
            stringTokenizer = new StringTokenizer(sc.nextLine());
            int s1 = Integer.parseInt(stringTokenizer.nextToken());
            int s2 = Integer.parseInt(stringTokenizer.nextToken());

            long count = 0;
            long dp1[][][] = new long[p + 1][q + 1][b1 + 1];
            long dp2[][][] = new long[p + 1][q + 1][b2 + 1];

//            Arrays.fill(dp1,-1);
  //          Arrays.fill(dp2,-1);
            //            long dp1[][][][][] = new long[2][p + 1][q + 1][b1 + 1][b2 + 1];

//            System.out.println(":" + p + ":" + q + ":" + s1 + ":" + s2 + ":" + b1 + ":" + b2 + ":" + n);
            count += noOfSequences(0, p, q, s1, s2, b1, b2, n, 0, dp1, dp2)%mod;
            //System.out.println("count1:"+count);
            count += noOfSequences(1, p, q, s1, s2, b1, b2, n, 0, dp1, dp2)%mod;
            //System.out.println("count2:"+count);
            System.out.println(count % mod);
            /*System.out.println(counter);
            System.out.println(cheat);*/
            // System.out.println("Counter : " + counter + ": Cheat : " + cheat +
            //       ":Zero : " + zero + ": wasted : " + nulled);
            //1000000007
        }
    }

    //no = 0 (p)--box1
    //no = 1 (q)--box2
    static long noOfSequences(int noChosen, int p, int q, int s1, int s2,
                              int b1, int b2, int n, long count, long dp1[][][], long dp2[][][]) {


        if (p < 0 || q < 0 || b1 < 0 || b2 < 0 || n < 0 || noChosen < 0) {
            //dp[noChosen][p][q][b1][b2] = count;
            //nulled++;
            return 0;
        }
        if (n == 0) {
            /*if (noChosen == 0) {
                dp1[p][q][b1] = 1;
            } else {
                dp2[p][q][b2] = 1;
            }*/
//            zero++;
            return 1;
        }
        if (noChosen == 0) {
            if (dp1[p][q][b1] != 0) {
                //  counter++;
                return dp1[p][q][b1];
            }
        } else {
            if (dp2[p][q][b2] != 0) {
                //counter++;
                return dp2[p][q][b2];
            }
        }
/*        if (dp[noChosen][p][q][b1][b2] != 0) {
            //counter++;
            return dp[noChosen][p][q][b1][b2];
        }*/


        long x = count;
        if (noChosen == 0) {
            //System.out.println(":" + noChosen + ":" + p + ":" + q + ":" + s1 + ":" + s2 + ":" + b1 + ":" + b2 + ":" + n);

            int min = Math.min(s1, p);
            if (b1 > 0) {
                for (int i = 1; i <= min; i++) {
                    x = (x+noOfSequences(1, p - i, q, s1, s2,
                            b1 - 1, b2, n - i, count, dp1, dp2))%mod;
                    //count=count;
                }
            }
        } else

        {
            //System.out.println(":" + noChosen + ":" + p + ":" + q + ":" + s1 + ":" + s2 + ":" + b1 + ":" + b2 + ":" + n);
            int min = Math.min(s2, q);
            if (b2 > 0) {
                for (int i = 1; i <= min; i++) {
                    x = (x+noOfSequences((0),
                            p, q - i, s1, s2, b1, b2 - 1, n - i, count, dp1, dp2))%mod;
                    //count++;

                }
            }
        }
        if (noChosen == 0) {
            dp1[p][q][b1] = x;
        } else {
            dp2[p][q][b2] = x;
        }
        //counter++;
//            dp[noChosen][p][q][b1][b2] = x;


    {
        //          cheat++;
    }
    //      cheat++;
        return x;
}
}

