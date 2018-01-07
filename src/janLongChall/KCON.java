package janLongChall;

import java.util.Scanner;
import java.util.StringTokenizer;

public class KCON {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        int index = -1;
        StringTokenizer stringTokenizer1[] = new StringTokenizer[(int) t];
        int maxx[] = new int[(int) t];
        if (t > 1) {
//            stringTokenizer1=new StringTokenizer[(int)t];
            index++;
        }

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            sc.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());

            Boolean match = false;
            if (index > -1) {
                stringTokenizer1[index] = stringTokenizer;
                index++;
                if (index > 1) {
                    for (int i = 0; i < index - 1; i++) {
                        if (stringTokenizer1[i].equals(stringTokenizer1[index - 1])) {
                            System.out.println(maxx[i]);
                            match = true;
                        }
                    }
                }
            }
            if (!match) {
                long max = 0, cur_max = 0,diff=0;


                long a[] = new long[(int) n];
                a[0] = Long.parseLong(stringTokenizer.nextToken());

                max = cur_max =a[0];

                for (int i = 1; i < n; i++) {
                    a[i] = Long.parseLong(stringTokenizer.nextToken());
                    cur_max = Math.max(a[i], cur_max + a[i]);
                    max = Math.max(cur_max, max);
                }
                //T0 :
                /*1
                21 5
                1 1 -4 -1 -1 -3 4 4 4 4 2 -1 -1 2 4 -1 -2 -3 4 4 4 */

/*                t1:
                1
                12 5
                1 1 1 1 -2 1 -1 -1 2 1 -1 -1*/
                //System.out.println(max);

                //System.out.println("cur-max"+cur_max);

                Boolean flag = true;
                long cur_max_prev = cur_max;
                while (k-- > 1 && flag) {
                  //  System.out.println("k:" + k);
                    flag = false;
                    for (int i = 0; i < n; i++) {
                        cur_max = Math.max(a[i], cur_max + a[i]);
                        if (cur_max > max) {
                            max = cur_max;
                            flag = true;
                        }
                    }
                    if (k > 1) {
                        if (cur_max - cur_max_prev == diff) {
                            k--;
                            max = max + diff* k;
                            break;
                        } else {
                            diff=cur_max-cur_max_prev;
                            cur_max_prev = cur_max;
                    //        System.out.println("cur-max"+cur_max_prev);
                        }
                    }
                    //System.out.println();
                }
                if (index > 0)
                    maxx[index - 1] = (int) max;
                System.out.println(max);
            }
        }

    }

}
