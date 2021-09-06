class Insertion {
    public static void main(String... args) {
        int[] arr = { 4, 8, 9, 2, 6, 3, 1, 5, 5 };
        int n = arr.length;
        int temp, j;
        System.out.println("Array before sorting ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
        for (int i = 1; i < n; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("Array after sorting ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");

    }
}