package Recursion;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by rohitx71 on 26-12-2017.
 */
public class NOKIA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        int[] minSplit = new int[53];
        int[] maxSplit = new int[53];
        minSplit[0] = 0;
        maxSplit[0] = 0;

        for (int j = 1; j <= 51; j++) {
            int k = j / 2;
            minSplit[j] = minSplit[k] + minSplit[j - k - 1] + j + 1;
            maxSplit[j] = maxSplit[0] + maxSplit[j - 1] + j + 1;
        }

        while (t-- > 0) {

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());

            int max = maxSplit[n];
            int min = minSplit[n];

            if (m < min) {
                System.out.println(-1);
            } else if (m >= min && m <= max) {
                System.out.println(0);
            } else {
                System.out.println(m - max);
            }
        }
    }
}