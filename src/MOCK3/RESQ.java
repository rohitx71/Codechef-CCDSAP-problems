package MOCK3;

import java.util.*;

public class RESQ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();


            sc.nextLine();


            //long a[] = new long [n];


            long diff = Integer.MAX_VALUE;

            ArrayList<Long> arrayList = new ArrayList<>();

            // HashMap<Long,Boolean> hashMap=new HashMap<>();
            int count = 1;
            if (n % 2 != 0) {
                count++;
            }
            Boolean threeflag = false;
            if (n % 3 != 0) {
                threeflag = true;
            }
            Boolean fiveflag = false;
            if (n % 5 != 0) {
                fiveflag = true;
            }
          /*  Boolean _7flag = false;
            if (n % 7 != 0) {
                _7flag = true;
            }

            Boolean _8flag = false;
            if (n % 8 != 0) {
                _8flag = true;
            }

            Boolean _11flag = false;
            if (n % 11 != 0) {
                _11flag = true;
            }
            Boolean _13flag = false;
            if (n % 13 != 0) {
                _13flag = true;
            }

            Boolean _17flag = false;
            if (n % 11 != 0) {
                _17flag = true;
            }
            Boolean _19flag = false;
            if (n % 11 != 0) {
                _19flag = true;
            }
*/
            double sq=Math.sqrt(n);
           // System.out.println("sq"+sq);
            for (int i = 1; i <= sq; i = i + count) {
                if (threeflag && i % 3 == 0) {
                    continue;
                }
                if (fiveflag && i % 5 == 0) {
                    continue;
                }
               /* if (_7flag && i % 7 == 0) {
                    continue;
                }
                if (_8flag && i % 8 == 0) {
                    continue;
                }
                if (_11flag && i % 11 == 0) {
                    continue;
                }
                if (_13flag && i % 13 == 0) {
                    continue;
                }
                if (_17flag && i % 17 == 0) {
                    continue;
                }
                if (_19flag && i % 19 == 0) {
                    continue;
                }*/
                if (arrayList.contains(i)) {
                    continue;
                }
                if (n % i == 0) {
                    long temp = Math.abs(i - (n / i));
                    arrayList.add(temp);
                    diff = Math.min(diff, temp);
                    if (diff == 0) {
                        break;
                    }
                }
            }


            System.out.println(diff);

        }
    }

}



