class InsertionSort {
    public static void insertion_sort(int ar[]) {
        for (int i = 1; i < ar.length; i++) {
// sort the unsorted part of array by adding/inserting the smallest/largest element on the correct place in sorted part of array
            int cur = ar[i];
            int pr = i - 1;
            while (pr >= 0 && ar[pr] > cur) {
                ar[pr + 1] = ar[pr];
                pr--;
            }
            ar[pr + 1] = cur;
        }
    }

    public static void main(String[] args) {
        int ar[] = { 11, 12, 13, 5, 6 };
         gt.insertion_sort(ar);
         for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}
