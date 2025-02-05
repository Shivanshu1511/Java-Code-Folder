
class MaxMin {
    public static int findSum(int A[], int n) {
        // Sort the array
        Arrays.sort(A);

        // Calculate and return the sum of the first and last elements
        int sum = A[0] + A[n - 1];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
       MaxMin gt = new  MaxMin();
         gt.findSum(A, n);
        
    }
}
