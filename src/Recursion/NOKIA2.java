package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NOKIA2 {
    static int min[] = new int[31];
    static int max[] = new int[31];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        min[0] = max[0] = 0;
        min[1] = max[1] = 2;
        while (t-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int soldiers = Integer.parseInt(stringTokenizer.nextToken());
            int max_wire = Integer.parseInt(stringTokenizer.nextToken());

            int min_used_wire = isSufficient(soldiers, true);
            int max_used_wire = isSufficient(soldiers, false);
            if (max_wire >= min_used_wire && max_wire <= max_used_wire)
                System.out.println(0);
            else if (max_wire >= max_used_wire)
                System.out.println(max_wire - max_used_wire);
            else
                System.out.println("-1");
        }
    }

    static int isSufficient(int soldiers, boolean isMin) {
        if (soldiers == 0)
            return 0;
        if (min[soldiers] != 0 && isMin)
            return min[soldiers];

        if (max[soldiers] != 0 && !isMin)
            return max[soldiers];
        int used_wire = 0;
        if (isMin) {
            used_wire = soldiers + 1 + isSufficient(soldiers / 2, isMin);
            used_wire += isSufficient(soldiers - (soldiers / 2) - 1, isMin);
            min[soldiers] = used_wire;
        } else {
            used_wire = soldiers + 1 + isSufficient(soldiers - 1, isMin);
            max[soldiers] = used_wire;
        }

        return used_wire;
    }
}
