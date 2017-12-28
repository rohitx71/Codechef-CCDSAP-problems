package DP;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rohitx71 on 29-12-2017.
 */
public class CTCI_Robot {
    static int m[][] = new int[5][5];
    static HashMap<Point, Boolean> memo = new HashMap<>();
    static ArrayList<Point> path = new ArrayList<>();

    public static void main(String args[]) {
        findPath(4, 4);


        // Arrays.fill(m, 0);
        m[2][3] = -1;
        m[3][2] = -1;
        m[4][3] = -1;
        System.out.println(path);
    }

    static boolean findPath(int row, int col) {
        if (row < 0 || col < 0 || m[row][col] == -1) {
            return false;
        }
        Point p = new Point(row, col);
        boolean isAtOrigin = (row == 0) && (col == 0);
        if (memo.containsKey(p)) {
            return memo.get(p);
        } else if (isAtOrigin || findPath(row, col - 1) || findPath(row - 1, col)) {
            path.add(p);
            memo.put(p, true);
            return true;
        } else {
            memo.put(p, false);
            return false;
        }

    }
}
