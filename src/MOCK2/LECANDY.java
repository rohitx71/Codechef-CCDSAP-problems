package MOCK2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LECANDY {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            sc.nextLine();
            long sum = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());

            for (int i = 0; i < n; i++) {
                sum += Long.parseLong(stringTokenizer.nextToken());
            }
            if (sum <= c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
