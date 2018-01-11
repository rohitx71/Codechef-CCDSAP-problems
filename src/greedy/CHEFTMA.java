package greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CHEFTMA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            StringTokenizer stringTokenizer2 = new StringTokenizer(sc.nextLine());
            StringTokenizer stringTokenizer3 = new StringTokenizer(sc.nextLine());
            StringTokenizer stringTokenizer4 = new StringTokenizer(sc.nextLine());


            int n1[] = new int[n];
            int c1[] = new int[n];
            int w[] = new int[n];
            int b[] = new int[n];
            int diff[] = new int[n];
            Boolean wflag[] = new Boolean[k];
            Boolean bflag[] = new Boolean[m];

            for (int j = 0; j < n; j++) {
                n1[j] = Integer.parseInt(stringTokenizer.nextToken());
                c1[j] = Integer.parseInt(stringTokenizer2.nextToken());

                diff[j] = n1[j] - c1[j];

                if (j < k) {
                    w[j] = Integer.parseInt(stringTokenizer3.nextToken());
                    for (int l = 0; l <= j && wflag[l] == false; l++) {
                        if (diff[l] > w[j]) {
                            diff[l]=diff[l]-w[j];
                            w[j]=0;
                            wflag[j]=true;
                        }
                    }
                }
                if (j < m) {
                    b[j] = Integer.parseInt(stringTokenizer4.nextToken());
                }
            }

            for (int j = 0; j < ; j++) {
                
            }


            System.out.println(min);

        }
    }

}

