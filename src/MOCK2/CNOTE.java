package MOCK2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CNOTE {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        sc.nextLine();
        while (t-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());


            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());
            int n = Integer.parseInt(stringTokenizer.nextToken());


            int need = x - y;

            Boolean flag = false;
            for (int i = 0; i < n; i++) {
                stringTokenizer = new StringTokenizer(sc.nextLine());
                if (!flag) {
                    int p = Integer.parseInt(stringTokenizer.nextToken());
                    int c = Integer.parseInt(stringTokenizer.nextToken());
                    if (p >= need && c <= k) {
                        System.out.println("LuckyChef");
                        flag = true;
                        //   break;
                    }
                }
            }
            if (!flag) {
                System.out.println("UnluckyChef");

            }


        }
    }
}
/*t0:
6
        3 1 2 2
        3 4
        2 2
        3 1 2 2
        2 3
        2 3
        3 1 2 2
        1 1
        1 2
        3 1 2 2
        3 4
        2 2
        3 1 2 2
        2 3
        2 3
        3 1 2 2
        1 1
        1 2*/
