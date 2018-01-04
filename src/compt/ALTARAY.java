package compt;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ALTARAY {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            sc.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());

            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(stringTokenizer.nextToken());
            }
            int val[]=new int[n];
            val[n-1]=1;
            for (int i = n - 2; i > -1; i--) {
                if(a[i]>0&&a[i+1]<0||a[i]<0&&a[i+1]>0){
                    val[i]=val[i+1]+1;
                }else{
                    val[i]=1;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(val[i]+" ");
            }
            System.out.println();
        }
    }
}


