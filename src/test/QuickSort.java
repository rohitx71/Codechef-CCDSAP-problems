package test;

public class QuickSort {
    public static void main(String args[]) {
        int a[] = {10, 7, 8, 9, 1, 5};
        int start = 0;
        int end = a.length - 1;


        QuickSort q = new QuickSort();

        q.quicksort(a, start, end);


        System.out.println("sorted array");
        q.printArray(a);

    }

   private void quicksort(int a[], int start, int end) {
        if (start < end) {
            int pi = partition(a, start, end);
            quicksort(a, start, pi - 1);
            quicksort(a, pi + 1, end);
        }
    }


    private void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private int partition(int a[], int low, int high) {
        int piv = a[high];
        int i = low - 1;

        for (int j = low; j < high ; j++) {
            if (a[j] <= piv) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;

        return i;
    }



}
