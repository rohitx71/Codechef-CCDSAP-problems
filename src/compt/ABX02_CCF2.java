package compt;

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

public class ABX02_CCF2 {
    static final long MOD = (long) 1e9 + 7;
    static FastReader in;
    static int N, P, Q, B0, B1, S0, S1;
    static long[][][][] dp0, dp1;

    //static HashMap<Long, Long> map;
    public static void main(String[] args) {
        in = new FastReader();
        int T = ni();
        dp0 = new long[55][55][55][2];
        dp1 = new long[55][55][55][2];
        while (T-- > 0) {
            P = ni();
            Q = ni();
            N = ni();
            B0 = ni();
            B1 = ni();
            S0 = ni();
            S1 = ni();
            for (int i = 0; i < 55; i++)
                for (int j = 0; j < 55; j++)
                    for (int k = 0; k < 55; k++)
                        for (int l = 0; l < 2; l++) {
                            dp0[i][j][k][l] = -1;
                            dp1[i][j][k][l] = -1;
                        }
            //map = new HashMap<>();
            int min = Math.min(51, Math.min(B0, B1));
            long ans = 0;
            if (B0 > min) {
                for (int i = 1; i <= Math.min(S0, P); i++) {
                    ans = (ans + count1(P - i, Q, min, 1)) % MOD;
                }
            } else ans = (ans + count0(P, Q, min, 0)) % MOD;
            if (B1 > min) {
                for (int i = 1; i <= Math.min(S1, Q); i++) {
                    ans = (ans + count0(P, Q - i, min, 0)) % MOD;
                }
            } else ans = (ans + count1(P, Q, min, 1)) % MOD;
            pn(ans);
        }
    }

    static long count0(int p, int q, int B, int cur) {
        int n = N - (P - p) - (Q - q);
        if (n == 0) return 1;
        else if (n < 0) return 0;
        else if (dp0[p][q][B][cur] != -1) return dp0[p][q][B][cur];
        else {
            dp0[p][q][B][cur] = 0;
            if (cur == 0) {
                if (B > 0) {
                    for (int i = 1; i <= Math.min(S0, p); i++) {
                        dp0[p][q][B][cur] = (dp0[p][q][B][cur] + count0(p - i, q, B, 1)) % MOD;
                    }
                }
            } else {
                if (B > 0) {
                    for (int i = 1; i <= Math.min(S1, q); i++) {
                        dp0[p][q][B][cur] = (dp0[p][q][B][cur] + count0(p, q - i, B - 1, 0)) % MOD;
                    }
                }
            }
            return dp0[p][q][B][cur];
        }
    }

    static long count1(int p, int q, int B, int cur) {
        int n = N - (P - p + Q - q);
        if (n == 0) return 1;
        else if (n < 0) return 0;
        else if (dp1[p][q][B][cur] != -1) return dp1[p][q][B][cur];
        else {
            dp1[p][q][B][cur] = 0;
            if (cur == 0) {
                if (B > 0) {
                    for (int i = 1; i <= Math.min(S0, p); i++) {
                        dp1[p][q][B][cur] = (dp1[p][q][B][cur] + count1(p - i, q, B - 1, 1)) % MOD;
                    }
                }
            } else {
                if (B > 0) {
                    for (int i = 1; i <= Math.min(S1, q); i++) {
                        dp1[p][q][B][cur] = (dp1[p][q][B][cur] + count1(p, q - i, B, 0)) % MOD;
                    }
                }
            }
            return dp1[p][q][B][cur];
        }
    }

    static void p(Object o) {
        System.out.print(o);
    }

    static void pn(Object o) {
        System.out.println(o);
    }

    static String n() {
        return in.next();
    }

    static String nln() {
        return in.nextLine();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }

    static int[] ia(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = ni();
        return a;
    }

    static long[] la(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) a[i] = nl();
        return a;
    }

    static long nl() {
        return Long.parseLong(in.next());
    }

    static double nd() {
        return Double.parseDouble(in.next());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

