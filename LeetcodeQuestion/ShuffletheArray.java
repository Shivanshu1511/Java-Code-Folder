class  ShuffletheArray{
    public int[] shuffle(int[] nums, int n) {
        int[] newarr = new int[nums.length];
        int j = 0;
        int k = n;

        for (int i = 0; i < nums.length; i += 2) {
            newarr[i] = nums[j];
            newarr[i + 1] = nums[k];
            j++;
            k++;
        }
        
        return newarr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
         ShuffletheArray gt = new ShuffletheArray();
        int[] shuffledArray = gt.shuffle(nums, n);
        // Print the shuffled array to see the result
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}


//  my straight forward approach is also shared in leetcode