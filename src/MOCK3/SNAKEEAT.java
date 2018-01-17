package MOCK3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SNAKEEAT {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            sc.nextLine();

            long l[] = new long[n];
            // long k[] = new long[q];
            // int ind = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < n; i++) {
                l[i] = Long.parseLong(stringTokenizer.nextToken());
            }
            Arrays.sort(l, 0, n);

            //stringTokenizer = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < q; i++) {
                long key = sc.nextLong();
                // Arrays.sort(l, 0, n);
                long end = search(l, key, 0, n);

               // System.out.println("End" + end);
                long total = n - end - 1;
              //  System.out.println("tot" + total);
                /*1
                10 1
                1 1 1 1 1 1 1 1 1 1
                2*/
                // Test case 1:
               /*
                1
               10 10
                 1 1 1 2 3 3 3 4 5 6
               6
            1
                3
                 7
                5
                4
                 8
               9
                10
                22*/
                // Expected output:-
                // 4
                // 10
                // 7
                // 3
                // 5
                // 6
                // 2
                // 2
                // 1
                // 0

                long st=0;
                while (st< end) {
                    int e = (int) end;
                    long val = key - l[e];
               //     System.out.println("End" + end);
                    if ((end-st) >= val) {
                        st=st+val;
                        //end = end - val - 1;
                        end--;
                        total++;
                    } else {
                        break;
                    }
                }
                if (total == -1)
                    System.out.println("0");
                else
                    System.out.println(total);
            }
        }


    }

    private static int search(long a[], long key, int st, int end) {

        int ans = -1;
        while (st < end) {
            int mid = st + (end - st) / 2;
           /* if (key == a[mid]) {
                return mid;
            }*/
            if (a[mid] >= key) {
                end = mid - 1;

            } else {
                st = mid + 1;
                ans = mid;

            }
        }
        return ans;
    }
}