package Arrays;

import java.util.Scanner;

/**
 * Created by rohitx71 on 18-10-2017.
 */
public class LECANDY {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int e = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;
            for (int j = 0; i < e; i++) {
                int k = sc.nextInt();
                sum += k;
            }
            if (sum <= c) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}


