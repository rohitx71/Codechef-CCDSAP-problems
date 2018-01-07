package MOCK2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CIELRCPT {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        int menu[] = new int[12];
        for (int i = 0; i < 12; i++) {
            menu[i] = (int) Math.pow(2, i);
  //          System.out.println(menu[i]);
        }
        while (t-- > 0) {
            int p = sc.nextInt();
            int count = 0;
//            System.out.println("p:" + p);
/*            for (int i = 0; i < 12; i++) {
                //   menu[i] = (int) Math.pow(2, i);
                System.out.println(menu[i]);
            }*/
            for (int i = 11; i >= 0; i--) {
                /*System.out.println("p1:" + p);
                System.out.println("menu:" + menu[i]);
*/
                if (menu[i] <= p) {
                    p = p - menu[i];
                    count++;
                    i++;
                    if (p == 0)
                        break;
                }
            }

            System.out.println(count);


        }
    }
}

