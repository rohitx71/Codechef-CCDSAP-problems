package compt;

import java.util.Arrays;

public class test {
    public static void main(String a[]) {


        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(Arrays.binarySearch(mat[0], 4));
        System.out.println(Arrays.binarySearch(mat[0], 8));
        System.out.println(Arrays.binarySearch(mat[1], 7));


    }
}
