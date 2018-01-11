package greedy;

import java.util.Scanner;

public class CAKEDOOM {
    static Boolean flag = false;
    static int n, RADIX = 10;
    //  static char c[];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            //char c[]=new char[k];

            sc.nextLine();
            String s = sc.nextLine();

            flag = false;


            char[] c = s.toCharArray();
            n = s.length();

            if (n == 1 && c[0] == '?' && k > 0) {
                c[0] = '0';
                System.out.println(c[0]);
                continue;
            }
            if (k == 2 && n > 1) {
                if (n % 2 != 0) {
                    flag = true;
                } else {
                    if (c[0] == '?') {
                        if(n==2){
                            if(c[0]=='?'&&c[1]=='?'){
                                c[0]='0';
                                c[1]='1';
                            }
                            if(c[1]=='0'){
                                c[0]='1';
                                print(c);
                                continue;
                            }else{
                                c[0]='0';
                                print(c);
                                continue;
                            }
                        }
                        if (c[1] != '0' && c[n - 1] != '0') {
                            c[0] = '0';
                            compute(k, c);
                            if (flag && c[1] != '1' && c[n - 1] != '1') {
                                c[0]='1';
                                flag = false;
                                compute(k, c);
                            }
                        } else {
                            c[0] = '1';
                            compute(k, c);
                        }


                        print(c);
                        continue;

                    }
                }
            }
            if (c[0] == c[n - 1] && c[0] != '?' && n > 1) {
                flag = true;
            }
            if (c[0] == '?' && n > 1) {
                for (int l = 0; l < k; l++) {
                    if ((c[n - 1] != Character.forDigit(l, RADIX) && c[1] != Character.forDigit(l, RADIX))) {
                        c[0] = Character.forDigit(l, RADIX);
                        break;
                    }
                    if (l == k - 1) {
                        flag = true;
                        break;
                    }
                }

            }

            /*System.out.print("Char array" + i);
            for (int j = 0; j < n; j++) {
                System.out.print(c[j]);
            }
            System.out.println();*/

            compute(k, c);



            print(c);
        }
    }

    static void print(char c[]) {
        // System.out.println("hello"+c.length);
        if (flag)
            System.out.println("NO");
        else {
            for (int j = 0; j < n; j++) {
                System.out.print(c[j]);
            }
            System.out.println();

        }

    }

    static void compute(int k, char c[]) {

        for (int j = 1; j < n - 1 && flag == false; j++) {
            if (c[j] == c[j + 1] && c[j] != '?') {
                flag = true;
                break;
            } else if (c[j] == '?') {
                for (int l = 0; l < k; l++) {
                    if ((c[j - 1] != Character.forDigit(l, RADIX) && c[j + 1] != Character.forDigit(l, RADIX))) {
                        c[j] = Character.forDigit(l, RADIX);
                        break;
                    }
                    if (l == k - 1) {
                        flag = true;
                        break;
                    }
                }

            }
        }
        if (c[n - 1] == '?' && flag == false) {
            for (int l = 0; l < k; l++) {
                if ((c[n - 2] != (Character.forDigit(l, RADIX)) && c[0] != (Character.forDigit(l, RADIX)))) {
                    c[n - 1] = (Character.forDigit(l, RADIX));
                    break;
                }
                if (l == k - 1) {
                    flag = true;
                    break;
                }
            }
        }
    }

}


