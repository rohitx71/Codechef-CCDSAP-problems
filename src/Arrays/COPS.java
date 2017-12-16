package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rohitx71 on 16-12-2017.
 */
public class COPS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {

            String s[]=sc.nextLine().trim().split("\\s+");
            int m = Integer.parseInt(s[0]);
            int x =Integer.parseInt(s[1]);
            int y =Integer.parseInt(s[2]);

            String house[]=sc.nextLine().trim().split("\\s+");
            // System.out.println(s);

            int n=x*y;
            // String p[] =sc.nextLine().split("\\s+");
            int h[]=new int[m];
            for (int j = 0; j < m; j++) {
                h[j]=Integer.parseInt(house[j]);
            }
            Arrays.sort(h);
            int total=0;
            int min=1;
            //int max=100;
            for (int j = 0; j < m; j++) {
                int cop=h[j];
                int start=cop-n;

                if(start>min){
                    int o=start-min;
                    if(o>0)
                        total+=(start-min);
                     //System.out.println("total :  "+total);
                }
                min=cop+n+1;;
                 // System.out.println("min :  "+min+" j:"+j);

            }
            if(min< 101)
                total+=101-min;




            System.out.println(total);

        }
    }
}

