package string;

import java.util.Scanner;

/**
 * Created by rohitx71 on 15-12-2017.
 */
public class CSUB {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            long l = sc.nextInt();


            String s = sc.next();

            s = s.replaceAll("0", "");

            long c = s.length();
            System.out.println((c * (c + 1)) / 2);

        }
    }
}

