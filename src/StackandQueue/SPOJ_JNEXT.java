package StackandQueue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rohitx71 on 18-12-2017.
 */
public class SPOJ_JNEXT {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s[] = sc.nextLine().trim().split("\\s+");
            int h[] = new int[n];
            //int finall[] = new int[n];
            for (int j = 0; j < n; j++) {
                h[j] = Integer.parseInt(s[j]);

            }

            int temp = 0;
            for (int j = n - 2; j > -1; j--) {
                if (h[j] < h[j + 1]) {

                    temp = h[j + 1];
                    h[j + 1] = h[j];
                    h[j] = temp;
                    for (int k = 1; k < n - j - 1; k++) {
                        if (h[j] >= h[j + k]) {

                            temp = h[j + k - 1];
                            h[j + k - 1] = h[j];
                            h[j] = temp;
                            break;
                        }
                    }
                    for (int k = 0; k <= (n - 1 - j) / 2; k++) {
                        temp = h[n - 1 - k];
                        h[n - 1 - k] = h[j + k];
                        h[j + k] = temp;
                    }

                    //System.out.println("total :  "+total);
                }

                // System.out.println("min :  "+min+" j:"+j);

            }

            for (int j = 0; j < n; j++) {
                System.out.print(h[j]);
            }
            System.out.println();

        }
    }
}


