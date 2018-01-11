package greedy;

import java.util.Scanner;

public class CHEFST {
       public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n1 = sc.nextLong();
            long n2 = sc.nextLong();
            long m = sc.nextLong();

            long sum = (m * (m + 1)) / 2;
            long min = Math.min(n1, n2);
            min = Math.min(sum, min);

            min = n1 + n2 - 2 * min;


            System.out.println(min);

        }
    }

}
