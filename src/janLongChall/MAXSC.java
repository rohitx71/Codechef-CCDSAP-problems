package janLongChall;

import java.util.ArrayList;
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

            long max[] = new long[n];
            long sum = 0;
            sum = max[n - 1] = a[n - 1][n - 1];
            int[] index = new int[n];
            index[n - 1] = n - 1;
            for (int i = n - 2; i > -1; i--) {
                for (int j = n - 1; j > -1; j--) {
                    if (a[i][j] < max[i + 1]) {
                        max[i] = a[i][j];
                        sum += a[i][j];
                        index[i] = j;
                        break;
                    }
                    if (j == n - 1) {
                        index[i + 1]=index[i+1]-1;
                        sum-=a[i+1][index[i+1]+1];

                        if (index[i + 1] == -1) {
                            i++;
                            i++;
                            break;
                        }
//                        System.out.println("i:" + i);
                        sum += a[i + 1][index[i + 1]];
                        max[i + 1] = a[i + 1][index[i + 1]];
                        j = n;

                    }
                }
                if (i == n) {
                    sum = -1;
                    break;
                }
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


