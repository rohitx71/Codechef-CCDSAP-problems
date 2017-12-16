package StackandQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by rohitx71 on 20-10-2017.
 */
public class STPAR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            for (; ; ) {
                Stack<Integer> stack = new Stack<>();
                int n = scanner.nextInt();
                if (n == 0)
                    break;
                int a[] = new int[n];
                int j = 1;
                int i = 0;
                for (i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();

                    if (a[i] == j) {
                        j++;
                        continue;
                    }
                    if (!stack.empty()) {
                        if (stack.peek() == j) {
                            stack.pop();
                            j++;

                        }
                    }
                    if (stack.size() > 0 && stack.peek() < a[i]) break;
                    stack.push(a[i]);
                }

                //  if(i == n) System.out.println("yes");
                //  else System.out.println("no");
                while (!stack.isEmpty()) {
                    if (stack.peek() == j) {
                        stack.pop();
                        j++;
                        continue;
                    } else {

                        stack.empty();
                        break;
                    }
                }
                if (stack.isEmpty())
                    System.out.println("yes");
                else {
                    System.out.println("no");
                }

            }
        } catch (Exception e) {
            return;
        }
    }
}