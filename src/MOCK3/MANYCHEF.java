package MOCK3;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MANYCHEF {
    static StringBuffer s;

    public static void main(String arg[]) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();

            while (t-- > 0) {

                StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
                char a[] = stringTokenizer.nextToken().toString().toCharArray();

                char ideal[] = new char[]{
                        'F', 'E', 'H', 'C'
                };
                int n = a.length;
                int count = 0;
                s = new StringBuffer();
                s.append("");
                for (int i = n - 1; i >= 0; i--) {
                    int temp = question(a, ideal, i, 0, n, true);
                    // System.out.println(temp);
                    if (a[i] == '?') {
                        a[i] = 'A';
                        s.append("A");
                    } else {
                        count = i - temp;
                        if (count != 3)
                            while (count >= 0)
                                s.append(a[i - count--]);
                        //s += a[i + count--];
                        i = temp;

                    }

                }

//            for (int i = 0; i < n; i++) {
//                System.out.print(a[i]);
//            }
                System.out.println("Hello");
                System.out.println(s.reverse());


            }
        } catch (Exception e) {

        }
    }


//System.out.println(sum);


    static int question(char a[], char ideal[], int i, int count, int n, Boolean flag) {
        //    System.out.println("count"+count);

        if (count == 4) {
            ++i;
            s.append('F');
            s.append('E');
            s.append('H');
            s.append('C');

            a[i + 3] = 'C';
            a[i + 2] = 'H';
            a[i + 1] = 'E';
            a[i] = 'F';
            //return true;
            return (i);
        }
        if (i > -1 && a[i] == '?') {
            //a[i ] = 'A';
            --i;
            ++count;
            //flag = false;
            i = question(a, ideal, i, count, n, true);

        } else if (i > -1 && a[i] == ideal[count]) {
            ++count;
            --i;
            i = question(a, ideal, i, count, n, true);
        }
        if (i == n)
            return i + count;
        return i;
    }

}

