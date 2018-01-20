package Recursion;

import java.io.IOException;
import java.util.*;

/**
 * Created by rohitx71 on 26-12-2017.
 */
public class NOKIA {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());

            // System.out.println("test : " + t);
            int v[] = new int[n + 2];
            int cost[] = new int[n + 1];

            v[0] = 1;
            v[n + 1] = 1;
            for (int i = 1; i <= n; i++) {
                int vi[] = Arrays.copyOf(v, v.length);
                //  System.out.println();
                cost[i] = cost(vi, i, 0, n, m);
                // System.out.println("cost of " + i + " : " + cost[i]);
            }
            cost[0] = cost[1];
            IntSummaryStatistics intSummaryStatistics = Arrays.stream(cost).summaryStatistics();
            int max = intSummaryStatistics.getMax();

            int min = intSummaryStatistics.getMin();
            if (m < min) {
                System.out.println(-1);
            } else if (m >= min && m <= max) {
                System.out.println(0);
            } else {
                System.out.println(m - max);
            }

        }


    }


    private static int cost(int[] vi, int pos, int cost, int n, int m) {
        for (int i = pos - 1; i >= 0; i--) {
            if (vi[i] == 1) {
                cost += pos - i;
                //System.out.println("cost left : " + cost);
                break;
            }
        }
        for (int i = pos + 1; i <= n + 1; i++) {
            if (vi[i] == 1) {
                if (i != n + 1) {
                    cost += i - pos;
                } else {
                    cost += (n + 1) - pos;
                }
                //System.out.println("cost rt : " + cost);
                break;
            }
        }
        vi[pos] = 1;

        for (int i = 1; i <= n; i++) {
            if (vi[i] != 1) {
                cost = cost(vi, i, cost, n, m);
            }
        }
        //System.out.println("cost of " + pos + " : " + cost);
        return cost;

    }
}