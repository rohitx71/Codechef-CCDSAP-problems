package test;

public class BinarySearch {

    public static void main(String args[]) {

        int a[] = {1, 3, 5, 7, 8, 66, 67, 69, 71, 74, 131};
        int start = 0;
        int end = a.length;

        int num = -1;
        while (start <= end) {


            int mid = start + (end - start) / 2;
            if (a[mid] == 69) {
                num = 69;
                break;
            }

            if (a[mid] < 69) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (num == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " +
                    "index ");

    }


}
