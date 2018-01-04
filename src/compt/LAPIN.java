package compt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LAPIN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){

            String s=sc.nextLine();


            char a[]=new char[26];
            char b[]=new char[26];

            int n=s.length()/2;
            /*if(s.length()%2!=0){
                a[s.charAt(n)]++;
            }*/

            //Arrays.sort(s,0,n);
            for (int i = 0; i < n; i++) {
                a[s.charAt(i)-'a']++;
                b[s.charAt(s.length()-i-1)-'a']++;

            }
            boolean flag=false;
            for (int i = 0; i < 26; i++) {
                if((a[i]!=b[i])){
                    flag=true;
                    System.out.println("NO");
                    break;
                }
            }
            if(!flag)
            System.out.println("YES");
        }
    }
}

