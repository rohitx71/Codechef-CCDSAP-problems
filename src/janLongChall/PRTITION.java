package janLongChall;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRTITION {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int k = sc.nextInt();
            char[] num=sc.next().toCharArray();
            int n = num.length;

            int sum=0;
            Hashtable<Long,Long> dp=new Hashtable<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                }
            }


            long stack[] = new long[n];
            int index = -1;
            Boolean flag = false;
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            long max = 0;
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(stringTokenizer.nextToken());
                for (int j = 0; j <= index / 2; j++) {
                    if (j == 0) {
                        int ind = Arrays.binarySearch(stack, x);
                        if (ind > 0) {
                            stack[ind - 1] = x;
                        }
                        if (x >= max) {
                            stack[++index] = x;
                            flag = true;

                            break;
                        }

                    }
                    if ((index - j - 1) > 0)
                        if (x < stack[index - j] && x > stack[index - j - 1]) {
                            stack[index - j] = x;
                            flag = true;
                            break;
                        }
                    if (x < stack[j]) {
                        //System.out.println("x:" + x + " :stack[j]" + stack[j]);
                        stack[j] = x;
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    stack[++index] = x;
                }
                max = stack[index];
                flag = false;
            }
            System.out.print(index + 1 + " ");
            for (int i = 0; i <= index; i++) {
                System.out.print(stack[i] + " ");

            }
            System.out.println();


        }
    }
}



