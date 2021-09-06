class Bubble {
    public static void main(String... args) {
        int[] arr = { 10, 9, 8, 7, 10, 5, 4, 3, 2, 1 };
        int n = arr.length;
        System.out.println("Before Sorting ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println("");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println("");
    }
}