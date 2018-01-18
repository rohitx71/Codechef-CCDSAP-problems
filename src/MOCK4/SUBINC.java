package MOCK4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SUBINC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();


            sc.nextLine();

            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            //long a[] = new long [n];
            int count=1;
            long sum=1;
            long prev=Long.parseLong(stringTokenizer.nextToken());
            long cur;
            for (int i = 1; i < n; i++) {
                cur = Long.parseLong(stringTokenizer.nextToken());
                if(cur>=prev){
                    count=count+1;
                }else{
                    count=1;
                }
                prev=cur;
                sum += count;
            }

            System.out.println(sum);

        }
    }

}
