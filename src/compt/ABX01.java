package compt;

import java.util.Scanner;

public class ABX01 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int n = sc.nextInt();
            while(a>9){
                a=armstrong(a);
            }
//            System.out.print("test1"+a);
            int finall= (int) Math.pow(a,n);
            while(finall>9){
                finall=armstrong(finall);
            }
            System.out.println(finall);
        }
    }

    static int armstrong(int num) {
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}



