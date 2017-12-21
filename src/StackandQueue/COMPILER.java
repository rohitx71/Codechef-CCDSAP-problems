package StackandQueue;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rohitx71 on 21-12-2017.
 */
public class COMPILER {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            sc.nextLine();
            while (n-- > 0) {


                String s = sc.nextLine();
                char c[] = s.toCharArray();


                Stack<Character> st = new Stack<Character>();
                int l = 0;
                int max = 0;

                for (int j = 0; j < c.length; j++) {

                    if (c[j] == '<') {
                        st.push(c[j]);
                        l++;

                    } else {
                        if (!st.isEmpty()) {


                            st.pop();
                            l++;
                            if (st.isEmpty()) {
                                max = max > l ? max : l;
                                l = 0;
                            }

                        }
                    }
                }
                System.out.println(max);
            }


        } catch (
                Throwable f)

        {
            return;
        }

    }


}

