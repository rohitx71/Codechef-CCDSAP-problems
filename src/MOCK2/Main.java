package MOCK2;

import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);
        StringBuilder s = new StringBuilder();
        int test = sc.nextInt();
        for (int step = 0; step < test; step++) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            long sum[] = new long[n];
            sum(sum, a);
            //end of the sum and sort
            int ans = 0;
            for (int j = 0; j < q; j++) {
                long v = sc.nextInt();
                int lastsmall = binary(v, a);
                System.out.println(lastsmall);
                if (lastsmall == -1) ans = (n);
                else if (lastsmall == 0) ans = (n - 1);
                else if (lastsmall == n - 1) {
                    int ans2 = binary2(lastsmall, sum, v, 0);
                    ans += ans2;
                } else {
                    ans += n - 1 - lastsmall;
                    int ans2 = binary2(lastsmall, sum, v, sum[lastsmall + 1]);
                    ans += ans2;
                }
                s.append(ans + "\n");
                ans = 0;
            }
        }
        System.out.print(s.toString());

    }

    public static int binary2(int l, long sum[], long q, long aftersum) {
        int lastsmall = l;
        int f = 0, med;
        int ans = 0;
        long rec, def, cur;
        while (f <= l) {
            med = (f + l) / 2;
            cur = sum[med] - aftersum;
            rec = (lastsmall - med + 1) * q;
            def = rec - cur;
            if (def <= med) {
                ans = lastsmall - med + 1;
                l = med - 1;
            } else {
                f = med + 1;
            }
        }
        return ans;
    }

    public static int binary(long v, int a[]) {
        int f = 0, l = a.length - 1, med;
        int ans = -1;
        while (f <= l) {
            med = (f + l) / 2;
            if (a[med] >= v) {
                l = med - 1;
            } else {
                f = med + 1;
                ans = med;
            }
        }
        return ans;
    }

    public static void sum(long sum[], int a[]) {
        long s = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            s += a[i];
            sum[i] = s;
        }
    }

    public static void dis(long a[]) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i] + " ");
        }
        System.out.println(s.toString());
    }

    //_________________________________
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream i) {
            br = new BufferedReader(new InputStreamReader(i));
            st = new StringTokenizer("");
        }

        public String next() throws IOException {
            if (st.hasMoreTokens())
                return st.nextToken();
            else
                st = new StringTokenizer(br.readLine());
            return next();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        //#
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
        //$
    }
}
 