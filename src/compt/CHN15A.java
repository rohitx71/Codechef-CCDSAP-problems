package compt;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CHN15A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();

            sc.nextLine();
            StringTokenizer stringTokenizer=new StringTokenizer(sc.nextLine());
            int x,count=0;

            for (int i = 0; i < n; i++) {
                x=Integer.parseInt(stringTokenizer.nextToken());
                if((x+k)%7==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
