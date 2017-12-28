package DP;

/**
 * Created by rohitx71 on 29-12-2017.
 */
public class Ctci_magicIndex

        public static void main(String args[]) {
            System.out.println(fib(1000));
           
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
}
