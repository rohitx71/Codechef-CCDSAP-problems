package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rohitx71 on 16-12-2017.
 */
public class FRGTNLNG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s[]=sc.nextLine().trim().split("\\s+");
           // System.out.println(s);
            List<String> list=new ArrayList<>();
            for (int j = 0; j < k; j++) {

                String p[] =sc.nextLine().split("\\s+");
                int no=Integer.parseInt(p[0]);
                list.addAll(Arrays.asList(p).subList(1,p.length));
            }

            for (int j = 0; j < n; j++) {
                if(list.contains(s[j])){
                    System.out.print("YES ");
                }else{
                    System.out.print("NO ");
                }
            }


            System.out.println();

        }
    }
}

