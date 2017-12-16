package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rohitx71 on 16-12-2017.
 */
public class SALARY {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int w = sc.nextInt();
            int wi[] = new int[w];

            int steps = 0;
            //  sc.next();
            for (int j = 0; j < w; j++) {
                wi[j] = sc.nextInt();

            }

            Boolean flag = true;
            while (flag) {
                Arrays.sort(wi);
                if (wi[0] == wi[w - 1]) {
                    flag = false;
                    break;
                } else {
                    wi[w - 1]--;
                    steps++;
                    for (int j = w-2; j >0 ; j--) {
                        if((wi[w-1]+1)==wi[w-j]){
                            wi[w - j]--;
                            steps++;
                        }
                    }

                }
            }

            System.out.println(steps);

        }
    }
}