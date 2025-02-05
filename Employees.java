import java.util.*;

class Employees {
    public static int employees_details(int nums[], int minR, int maxR) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > minR && nums[i] < maxR) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int minR = sc.nextInt();
        int maxR = sc.nextInt();

        int result = employees_details(nums, minR, maxR);
        System.out.print(result);
    }
}
