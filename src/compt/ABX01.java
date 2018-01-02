package compt;

import java.util.Scanner;

public class ABX01 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextLong();
        for (double i = 0; i < t; i++) {
            double a = sc.nextLong();
            double n = sc.nextLong();
            while(a>9){
                a=armstrong(a);
            }
//            System.out.prdouble("test1"+a);
            while(n>9){
                n=armstrong(n);
            }
            double finall=  (double)Math.pow(a,n);
            while(finall>9){
                finall=armstrong(finall);
            }
            System.out.println((long)Math.floor(finall));
        }
    }

    static double armstrong(double num) {
        int sum=0;
        num=(int)num;
        while(num>=1){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}



