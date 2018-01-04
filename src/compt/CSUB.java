package compt;

import java.util.Scanner;

public class CSUB {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            sc.nextLine();
            String s = sc.nextLine();

//            StringBuffer stringBuffer=new StringBuffer();
            long count = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    count++;
                    //                  stringBuffer.append('1');
                }
            }


            count = (count * (count + 1)) / 2;
            System.out.println(count);
        }
    }
}


