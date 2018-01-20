package sorting;

import java.util.Scanner;

public class MRGSRT {
    static int count = 0;

    public static void main(String args[]) {
        /*int a[] = {10, 7, 8, 9, 1, 5};
        int start = 0;
        int end = a.length - 1;
*/
        MRGSRT mrgsrt = new MRGSRT();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int key = sc.nextInt();

            if (key >= start && key <= end) {
                System.out.println(start + " " + end);
                count++;
                mrgsrt.mrgsort(start, end, key);
                System.out.println(count);
                count = 0;
            } else {
                System.out.println("-1");
            }


        }
    }

    private void mrgsort(int start, int end, int key) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (key <= mid) {
                System.out.println(start + " " + mid);
                count++;
                mrgsort(start, mid, key);
            } else {
                System.out.println(mid + 1 + " " + end);
                mrgsort(mid + 1, end, key);
                count++;
            }

            // merge(a, start, mid, end);
        }
    }


    private void merge(int f[], int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int a1[] = new int[n1];
        int a2[] = new int[n2];

        int index = 0;
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            a1[index++] = f[start + i];
        /*for (int j=0; j<n2; ++j)
            a2[j] = f[mid + 1+ j];*/


      /* for (int i = start; i <n1; ++i) {
            a1[index++] = f[i];
        }*/
        index = 0;
        for (int i = 0; i < n2; i++) {
            a2[index++] = f[i + mid + 1];
        }


        int j = 0, k = 0;
        int i = start;
        while (j < n1 && k < n2) {
            if (a1[j] <= a2[k]) {
                f[i++] = a1[j++];
            } else {
                f[i++] = a2[k++];
            }

        }

        /* Copy remaining elements of L[] if any */
        while (j < n1) {
            f[i] = a1[j];
            i++;
            j++;
        }

        /* Copy remaining elements of R[] if any */
        while (k < n2) {
            f[i] = a2[k];
            k++;
            i++;
        }
    }


    private void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

