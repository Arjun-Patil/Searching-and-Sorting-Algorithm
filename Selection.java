class Selection {
    public static void main(String... args) {
        int[] arr = { 5, 8, 4, 3, 1, 6, 7, 2 };
        int n = arr.length;
        int min, temp;
        System.out.println("Array before sorting ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = arr[j];
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("Array after sorting ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }
}