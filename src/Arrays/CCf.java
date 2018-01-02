package Arrays;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by rohitx71 on 30-12-2017.
 */
public class CCf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //  t=1;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int n = sc.nextInt();

//            int sum = 0;
//
//            while (a > 9) {
//                String s = String.valueOf(a);
//                for (int j = 0; j < s.length(); j++) {
//                    String k = String.valueOf(s.charAt(j));
//                    sum += Integer.parseInt(k);
//                }
//                a = sum;
//                sum = 0;
//            }
//            int sum1;
//            sum1 = (int) Math.pow(a, n);
//            System.out.println(sum1);
//            int a2 = sum1;
            int sum2 = 0;
           // int a2 = 134;
            while (a > 9) {
                while (a > 0) {
                    sum2 += a % 10;
                    a = a / 10;

                }

            }
            int sum1;
           // sum2=0;
            sum1 = (int) Math.pow(sum2, n);
            System.out.println(sum1);
            sum2=0;
            while (sum1 > 9) {
                while (sum1 > 0) {
                    sum2 += sum1 % 10;
                    sum1 = sum1 / 10;

                }

            }
            System.out.println(sum2);


        }
    }
}


