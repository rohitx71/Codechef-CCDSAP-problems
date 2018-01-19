package sorting;

public class MRGSRT {
    public static void main(String args[]) {
        int a[] = {10, 7, 8, 9, 1, 5};
        int start = 0;
        int end = a.length - 1;

        MRGSRT mrgsrt = new MRGSRT();

        mrgsrt.mrgsort(a, start, end);

        System.out.println("sorted array");
        mrgsrt.printArray(a);

    }

    private void mrgsort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mrgsort(a, start, mid);
            mrgsort(a, mid + 1, end);

            merge(a, start, mid, end);
        }
    }

  /*  void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        *//* Create temp arrays *//*
        int L[] = new int [n1];
        int R[] = new int [n2];

        *//*Copy data to temp arrays*//*
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        *//* Merge the temp arrays *//*

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        *//* Copy remaining elements of L[] if any *//*
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        *//* Copy remaining elements of R[] if any *//*
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }*/
    private void merge(int f[], int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int a1[] = new int[n1];
        int a2[] = new int[n2];

        int index = 0;
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            a1[index++] = f[start + i];
        /*for (int j=0; j<n2; ++j)
            a2[j] = f[mid + 1+ j];*/


      /* for (int i = start; i <n1; ++i) {
            a1[index++] = f[i];
        }*/
       index = 0;
        for (int i =0 ; i <n2; i++) {
            a2[index++] = f[i+mid + 1];
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
        while (j < n1)
        {
            f[i] = a1[j];
            i++;
            j++;
        }

        /* Copy remaining elements of R[] if any */
        while (k < n2)
        {
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

