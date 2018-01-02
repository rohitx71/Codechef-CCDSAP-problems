package compt;

import java.util.Scanner;

public class NW1 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int d = sc.nextInt();
            String s = sc.next();
            int n ;
            int[] val = new int[8];
            if (s.equals("mon")) {
                n = 1;
            } else if (s.equals("tue")) {
                n = 2;
            } else if (s.equals("wed")) {
                n = 3;
            } else if (s.equals("thu")) {
                n = 4;
            } else if (s.equals("fri")) {
                n = 5;
            } else if (s.equals("sat")) {
                n = 6;
            } else {
                n = 7;
            }

            days(d, n, val);
            for (int j = 1; j < 8; j++) {
                System.out.print(val[j%7] + " ");
            }
            System.out.println();
        }
    }

    static void days(int d, int n, int val[]) {

        int day;
        for (int i = 0; i < 7; i++) {
            day=i+1;
            while(day<=d){
                val[n%7]++;
                day+=7;
            }
            n++;

        }

    }
}

