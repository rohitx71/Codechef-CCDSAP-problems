package janLongChall;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RECTANGL {
    public static void main(String ar[]){
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            StringTokenizer stringTokenizer=new StringTokenizer(scanner.nextLine());
            int a[]=new int[4];

            for (int i = 0; i < 4; i++) {
                a[i]=Integer.parseInt(stringTokenizer.nextToken());
            }
            Arrays.sort(a,0,4);
            if(a[0]==a[1]&&a[2]==a[3]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
