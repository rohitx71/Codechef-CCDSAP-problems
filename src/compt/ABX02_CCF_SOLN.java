package compt;

import java.io.PrintWriter;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;

//package codechef_ltime55;

/**
 * @author ghost
 */
//class C {
public class ABX02_CCF_SOLN {
    static class Task {
        long mod = 1000000007;
        static HashMap<Long, Long> map;
        static long counter = 0;
        static long cheat = 0;
        static long nulled = 0;
        static long zero = 0;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int p = in.nextInt();
            int q = in.nextInt();
            int n = in.nextInt();
            int b1 = in.nextInt();
            int b2 = in.nextInt();
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            map = new HashMap<>();
            System.out.println((func(n, p, q, b1, b2, s1, s2, 1) + func(n, p, q, b1, b2, s1, s2, 2))%mod );
            System.out.println("Counter : "+counter+": Cheat : "+cheat+
                    ":Zero : "+zero+": wasted : "+nulled);

        }

        long func(long n, long p, long q, long b1, long b2, int s1, int s2, long prev) {
            if (n < 0) {
                nulled++;
                return 0;
            }
            if (n == 0) {
                zero++;
                return 1;
            }
            //this awesome functions does the memoization..
            if (map.containsKey((b2 + 201 * (b1 + 201 * (q + 201 * (p + 201 * (n))))) * 2 + prev % 2)) {
                counter++;
                return map.get((b2 + 201 * (b1 + 201 * (q + 201 * (p + 201 * (n))))) * 2 + prev % 2);
            }
            long ans = 0;
            if (prev == 2) {
                if (b1 > 0) {
                    for (int i = 1; i <= Math.min(p, s1); i++) {
                        ans = (ans + func(n - i, p - i, q, b1 - 1, b2, s1, s2, 1)) % mod;
                    }
                }
            } else if (prev == 1) {
                if (b2 > 0) {
                    for (int i = 1; i <= Math.min(q, s2); i++) {
                        ans = (ans + func(n - i, p, q - i, b1, b2 - 1, s1, s2, 2)) % mod;
                    }
                }
            }
            cheat++;
            map.put((b2 + 201 * (b1 + 201 * (q + 201 * (p + 201 * (n))))) * 2 + prev % 2, ans);
            return ans;
        }

        int LOG2(long item) {
            int count = 0;
            while (item > 1) {
                item >>= 1;
                count++;
            }
            return count;
        }


        long gcd(long a, long b) {
            a = Math.abs(a);
            b = Math.abs(b);
            return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
        }
    }


    static class InputReader {

        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String next() {
            return readString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }

        private static void pa(Object... o) {
            System.out.println(Arrays.deepToString(o));
        }
    }

    public static void main(String args[]) {

        //File file= new File("COMPLETE_FILE_PATH");
        //InputStream is = new FileInputStream(file);


        //InputReader in = new InputReader(is);
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        while (t-- > 0) {
            Task solver = new Task();
            solver.solve(t, in, out);
        }
        out.flush();
        out.close();


    }

}
