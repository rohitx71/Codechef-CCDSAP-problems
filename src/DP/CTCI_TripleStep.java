package DP;

/**
 * Created by rohitx71 on 29-12-2017.
 */
public class CTCI_TripleStep {
    static int tribonacci[] = new int[1001];

    public static void main(String args[]) {
        System.out.println(tribonacci(37));

    }

    static int tribonacci(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (tribonacci[n] != 0) {
            return tribonacci[n];
        }
        tribonacci[n] = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        return tribonacci[n];
    }

}