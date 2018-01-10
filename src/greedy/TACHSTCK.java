package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class TACHSTCK {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        long max=0;
        Arrays.sort(a,0,n);
        for (int i = 1; i < n; i++) {
            if(a[i]-a[i-1]<=d){
                max++;
                i++;
            }
        }
        System.out.println(max);
    }
}