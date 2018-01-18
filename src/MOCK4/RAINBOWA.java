package MOCK4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RAINBOWA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();


            sc.nextLine();

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            //long a[] = new long [n];
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            int curr = 0;
            Boolean f[] = new Boolean[8];

            Arrays.fill(f, false);
            f[0] = true;
            Boolean flag = true;
            for (int i = 0; i < n / 2; i++) {
                if (a[i] == a[n - i - 1] && a[i] < 8) {
                    if (curr == a[i]) {
                        continue;
                    } else if (a[i] == curr + 1) {
                        if (f[curr]) {
                            curr++;
                            f[curr] = true;
                        } else {
                          //       System.out.println("one:"+i);
                            flag = false;
                            break;
                        }
                    }
                } else {
                  //    System.out.println("twoo:"+i);
                    flag = false;
                    break;
                }
            }

            if (flag && a[n / 2] == 7) {
              //  System.out.println("oneeee:" );
                for (int i = 0; i < 7; i++) {
                    if (!f[i]) {
                       // System.out.println("one:" + i);
                        flag = false;
                        break;
                    }
                }
            }else {
                flag=false;
            }

            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }

}

