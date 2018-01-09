package janLongChall;

import java.util.Scanner;

public class STRMRG {
    static int n, m;


    static int[] fin = new int[2];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            n = sc.nextInt();
            m = sc.nextInt();

//            System.out.println(m);
            sc.nextLine();

            char a[] = sc.nextLine().toCharArray();
            char b[] = sc.nextLine().toCharArray();

            char c[] = new char[m + n];


            int val1 = 0, val2;
            //StringBuffer stringBuffer = new StringBuffer(a[0]);

            val1 = calculate(a[0] + "", 1, 0, 1, a, b);
            //stringBuffer = new StringBuffer(b[0]);
            //System.out.println("VAlue" + fin[0] + " : " + fin[1]);

            int min = (fin[0] < fin[1] ? fin[0] : fin[1]);

            val2 = calculate(b[0] + "", 0, 1, 1, a, b);
            int min2 = (fin[0] < fin[1] ? fin[0] : fin[1]);

//            System.out.println("VAlue1" + val1 + " : " + val2);

            System.out.println(min < min2 ? min : min2);


        }
    }


    static int calculate(String s, int i, int j, int value, char a[], char b[]) {
        if (s.length() >= 2)

            if (s.charAt(s.length() - 2) != s.charAt(s.length() - 1)) {
                ++value;
                //         System.out.println("VAlue INCR" + value + " :Str " + s);

            }
           System.out.println("VAlue" + value + " :Str " + s);

        int val1 = value, val2 = value;
        if (i < n) {
            //System.out.println("i:" + i + "n:" + n);
            //System.out.println(s.append(a[i]));

            val1 = calculate(s + a[i], ++i, j, value, a, b);
            //         System.out.println(val1);

            if (i == n) {
                fin[0] = val1;

            }
            /*if(temp>val1){
                value=temp;
            }*/
        }
        if (j < m) {
            //System.out.println("j:" + j + "m:" + m);
            val2 = calculate(s + b[j], i, ++j, value, a, b);
            /*if(temp>value){
                value=temp;
            }*/


            if (i == n) {
                fin[1] = val2;

            }
///            System.out.println(val2);


        }


        //return value;
        return (val1 < val2 ? val1 : val2);
    }
}


