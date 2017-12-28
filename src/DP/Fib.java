package DP;

/**
 * Created by rohitx71 on 28-12-2017.
 */
public class Fib {
    static int fib[]=new int[1001];
    public static void main(String args[]) {
        System.out.println(fib(1000));
        System.out.println(fibmem(25));
        System.out.println(fibrec(25));
    }

    static int fib(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    static int fibrec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibrec(n - 1) + fibrec(n - 2);
    }

    static int fibmem(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if(fib[n]!=0){
            return fib[n];
        }
        fib[n]=fibrec(n - 1) + fibrec(n - 2);
        return fib[n];
    }

}
