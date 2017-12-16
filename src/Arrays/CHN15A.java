package Arrays;

import java.util.Scanner;

/**
 * Created by rohitx71 on 16-12-2017.
 */
public class CHN15A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int c = 0;
            int inp;
            for (int j = 0; j < n; j++) {
                inp = sc.nextInt();
                if((inp+k)%7==0){
                    c++;
                }
            }



            System.out.println(c);

        }
    }
}

