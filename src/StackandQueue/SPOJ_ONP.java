package StackandQueue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by rohitx71 on 21-12-2017.
 */
public class SPOJ_ONP {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            sc.nextLine();
            while (n-- > 0) {


                String s = sc.nextLine();
                char c[] = s.toCharArray();


                Stack<Character> st = new Stack<Character>();


                for (int j = 0; j < c.length; j++) {

                    if (c[j] == '(') {
                        st.push(c[j]);
                    } else if (c[j] == ')') {
                        while (true) {
                            char temp = st.pop();
                            if (temp == '(') {
                                break;
                            } else {
                                System.out.print(temp);
                            }
                        }
                    } else if (c[j] >= 'a' && c[j] <= 'z') {
                        System.out.print(c[j]);
                    } else {
                        st.push(c[j]);
                    }

                }
                System.out.println();
            }
        } catch (Throwable f) {
            return;
        }

    }


}
