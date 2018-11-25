package aprilLongChall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHEFWORK {
    public static void main(String args[]) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int t = Integer.parseInt(s);

        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());

        StringTokenizer stringTokenizer2 =
                new StringTokenizer(bufferedReader.readLine());
        // char c1[] = s2.split("\\s+").toString().toCharArray();

        // char c[] = bufferedReader.readLine().split("\\s+").toString().toCharArray();


        int min1, min2, min3;
        min1 = min2 = min3 = 100001;
        for (int i = 0; i < t; i++) {
            int c1 = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer2.nextToken());
            //System.out.println(c);
            // System.out.println(c1);
            if (c == 1) {
                int temp = c1;
                if (temp < min1) {
                    min1 = temp;
                }
            } else if (c == 2) {
                int temp = c1;
                if (temp < min2) {
                    min2 = temp;
                }
            } else {
                int temp = c1;
                if (temp < min3) {
                    min3 = temp;
                }
            }
        }
        //System.out.println(min1);
        System.out.println(min3 < (min1 + min2) ? min3 : (min1 + min2));

    }
}
