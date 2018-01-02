package compt;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ABX02 {
    //static long counter = 0;
    //static long cheat = 0;
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
            long dp[][][][][] = new long[2][p + 1][q + 1][b1 + 1][b2 + 1];

//            System.out.println(":" + p + ":" + q + ":" + s1 + ":" + s2 + ":" + b1 + ":" + b2 + ":" + n);
            count += noOfSequences(0, p, q, s1, s2, b1, b2, n, 0, dp);
            //System.out.println("count1:"+count);
            count += noOfSequences(1, p, q, s1, s2, b1, b2, n, 0, dp);
            //System.out.println("count2:"+count);
            System.out.println(count % 1000000007);
        //    System.out.println(counter);
          //  System.out.println(cheat);

            //1000000007
        }
    }

    //no = 0 (p)--box1
    //no = 1 (q)--box2
    static long noOfSequences(int noChosen, int p, int q, int s1, int s2,
                              int b1, int b2, int n, long count, long dp[][][][][]) {


        if (p < 0 || q < 0 || b1 < 0 || b2 < 0 || n < 0 || noChosen < 0) {
            //dp[noChosen][p][q][b1][b2] = count;
            return count;
        }
        if (dp[noChosen][p][q][b1][b2] != 0) {
            //counter++;
            return dp[noChosen][p][q][b1][b2];
        }
        if (n == 0) {
            dp[noChosen][p][q][b1][b2] = ++count;
            return count;
        }

        long x = count;
        if (noChosen == 0) {
            //System.out.println(":" + noChosen + ":" + p + ":" + q + ":" + s1 + ":" + s2 + ":" + b1 + ":" + b2 + ":" + n);

            for (int i = 1; i <= s1; i++) {
                x += noOfSequences((noChosen + 1) % 2, p - i, q, s1, s2,
                        b1--, b2, n - i, count, dp);
                //count=count;
            }
        } else

        {
            //System.out.println(":" + noChosen + ":" + p + ":" + q + ":" + s1 + ":" + s2 + ":" + b1 + ":" + b2 + ":" + n);

            for (int i = 1; i <= s2; i++) {
                x += noOfSequences(((noChosen + 1) % 2),
                        p, q - i, s1, s2, b1, b2--, n - i, count, dp);
                //count++;

            }
        }
        if (b1 > -1 && b2 > -1) {

            //counter++;
            dp[noChosen][p][q][b1][b2] = x;
        }else {
            //cheat++;
        }
        return x;
    }
}

