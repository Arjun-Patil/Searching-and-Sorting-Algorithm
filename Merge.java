class Merge {

    static void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb, j = mid + 1, k = lb;
        int[] b = new int[10];
        System.out.println(arr.length);
        while (i < mid && j < ub) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= ub) {
                b[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = arr[i];
                k++;
                i++;
            }
        }

        for (int l = 0; l < arr.length; l++) {
            System.out.println(b[l]);
        }
    }

    static void MergeSort(int[] arr, int lb, int ub) {
        int mid;
        if (lb < ub) {
            mid = (ub + lb) / 2;
            MergeSort(arr, lb, mid);
            MergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public static void main(String... args) {
        int[] arr = { 5, 1, 9, 7, 4, 6, 3, 2, 5, 8 };
        int n = arr.length;
        System.out.println("Array before sorting ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
        MergeSort(arr, 0, n - 1);
        System.out.println("Array After sorting ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }
}