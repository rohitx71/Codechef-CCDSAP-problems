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
            long k[] = new long[q];
            int ind = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < n; i++) {
                l[i] = Long.parseLong(stringTokenizer.nextToken());
            }
            Arrays.sort(l, 0, n);

            stringTokenizer = new StringTokenizer(sc.nextLine());
            for (int i = 0; i < q; i++) {
                k[i] = Long.parseLong(stringTokenizer.nextToken());
            }

            int index = 0;
            while (index > 0) {

                int i = Arrays.binarySearch(l, 0, n, (k[ind] - 1));
                if(i==-1){
                    
                }
            }

        }
    }
}
