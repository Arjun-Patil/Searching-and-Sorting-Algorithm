import java.util.*;

class quick {

    static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int temp = 0;
        int end = ub;
        while (start < end) {
            while (arr[start] <= pivot) {
                if (start == ub) {
                    break;
                }
                start++;
            }
       
            while (arr[end] > pivot)
                end--;
            if (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }

    static void QuickSort(int[] arr, int lb, int ub) {
        int loc = 0;
        if (lb < ub) {
            loc = partition(arr, lb, ub);
            QuickSort(arr, lb, loc - 1);
            QuickSort(arr, loc + 1, ub);
        }
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort(arr, 0, n - 1);
        System.out.println("\n\nThe array elements after sorting are: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("\n");

    }
}
