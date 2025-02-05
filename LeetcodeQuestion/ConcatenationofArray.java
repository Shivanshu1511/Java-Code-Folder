import java.util.*;

class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];

        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        ConcatenationofArray getd = new ConcatenationofArray();
        int concatenated[] = getd.getConcatenation(nums); // Store the result in a variable
        for (int num : concatenated) { // Use the concatenated array for printing
            System.out.print(num + " ");
        }
    }
}
