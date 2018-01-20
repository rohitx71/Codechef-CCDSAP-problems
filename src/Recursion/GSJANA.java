package Recursion;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GSJANA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        sc.nextLine();


        while (t-- > 0) {

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            long r = Long.parseLong(stringTokenizer.nextToken());
            Boolean flag = false;
            for (int i = 0; i < 4; i++) {
                if (r == Long.parseLong(stringTokenizer.nextToken())) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }


    }
}
