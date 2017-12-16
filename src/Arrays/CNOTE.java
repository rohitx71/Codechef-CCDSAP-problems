package Arrays;

import java.util.Scanner;

/**
 * Created by rohitx71 on 16-12-2017.
 */
public class CNOTE {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int n = sc.nextInt();

            Boolean flag = false;
            for (int j = 0; j < n; j++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                if (p >= x - y && c <= k) {
                    flag = true;
                }
            }
            if(flag){
                System.out.println("LuckyChef");
            }else{
                System.out.println("UnluckyChef");
            }
        }
    }
}