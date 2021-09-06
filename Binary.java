import javax.lang.model.util.ElementScanner6;

class Binary {
    static int binarySearch(int[] arr, int n, int ele) {
        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (ele == arr[mid])
                return mid;
            else if (ele < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String... args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int ele = 10;
        int res = binarySearch(arr, n, ele);
        System.out.println("Element found at position " + (res + 1));
    }
}