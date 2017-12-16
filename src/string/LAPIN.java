package string;

import java.util.Scanner;
import java.util.*;


/**
 * Created by rohitx71 on 16-12-2017.
 */
public class LAPIN {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int n = s.length();
            int a[] = new int[26];
            int b[] = new int[26];
            int k = 0;
            if (n % 2 != 0) {
                k = 1;
            }
            for (int j = 0; j < n / 2; j++) {
                a[s.charAt(j) - 'a']++;
                b[s.charAt(j + (n / 2) + k) - 'a']++;
            }


            if (Arrays.equals(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}


