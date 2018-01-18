package MOCK4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SEGM01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            char a[] = (sc.nextLine()).toString().toCharArray();
            int n = a.length;

            /*for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }*/
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((count == 0 || count == 1) && a[i] == '1') {
               //     System.out.println(i+":i:");
                    count = 1;
                } else if (count == 1 && a[i] != '1') {
                    count = 2;
                }
                else if (count > 1 && a[i] == '1') {
                //    System.out.println(i+":i:");
                    count = 3;
                    break;
                }
            }

        //    System.out.println(count);
            if (count==0||count > 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
