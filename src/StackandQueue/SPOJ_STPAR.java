package StackandQueue;

import java.io.IOException;
import java.util.*;

/**
 * Created by rohitx71 on 21-12-2017.
 */
public class SPOJ_STPAR {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {

                int n = sc.nextInt();
                if (n == 0) break;
                sc.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());


                int a;

                Stack<Integer> st = new Stack<Integer>();
                int num = 1;
                int j = 0;
                for (j = 0; j < n; j++) {
                    a = Integer.parseInt(stringTokenizer.nextToken());
                    if (a == num) {
                        num++;
                        continue;
                    }
                    while (!st.isEmpty() && st.peek() == num) {
                        st.pop();
                        num++;
                    }
                    if (!st.isEmpty() && st.peek() < a) {
                        break;
                    }
                    st.push(a);

                }
                if (j == n) System.out.println("yes");
                else System.out.println("no");

            }
        }catch (Throwable e){
            return;
        }
    }
}

