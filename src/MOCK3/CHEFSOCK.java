package MOCK3;

import java.util.Scanner;

public class CHEFSOCK {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        long jacket = sc.nextLong();
        long sock = sc.nextLong();
        long money = sc.nextLong();

        int count = 0;
        long _2socks = 2 * sock;
        money = (money - jacket) - sock - sock;
        if ((money >= 0)) {
            while (money - sock >= 0) {
                money=money-sock;
                count++;
            }
            if (count % 2 == 0) {
                System.out.println("Lucky Chef");
            } else {
                System.out.println("Unlucky Chef");
            }

        }else
        System.out.println("Unlucky Chef");
    }
}
