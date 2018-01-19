package sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class STICKS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            sc.nextLine();

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            //long a[] = new long [n];
            int a[] = new int[1001];

            for (int i = 0; i < n; i++) {
                ++a[Integer.parseInt(stringTokenizer.nextToken())];
            }

            int s1 = Integer.MIN_VALUE, s2 = Integer.MIN_VALUE, i;
            for (i = 1000; i >= 0; i--) {
                if (a[i] >= 4) {
                    s1 = s2 = i;
                    break;
                } else if (a[i] >= 2) {
                    s1 = i;
                    break;
                }
            }

            //   System.out.println(s1);
            if (s2 == Integer.MIN_VALUE) {
                for (int j = i - 1; j >= 0; j--) {
                    if (a[j] >= 2) {
                        s2 = j;
                        break;
                    }
                }
            }
            if (s1 == Integer.MIN_VALUE || s2 == Integer.MIN_VALUE) {
                System.out.println("-1");
            } else {
                System.out.println(s1 * s2);
            }

        }
    }
}
