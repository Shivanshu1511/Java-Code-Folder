import java.util.*;

public class MaxSubArray {
    public static void subarray(int ar[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i <= ar.length - 2; i++) {
            int start = i;
            for (int j = i; j <= ar.length - 1; j++) {
                int end = j;
                cursum = 0;
                for (int k = start; k <= end; k++) {
                    cursum += ar[k];
                }
                if (cursum > maxsum) {
                    maxsum = cursum;
                }
            }
        }
        System.out.println("Maximum subarray sum: " + maxsum);
    }

    public static void main(String[] args) {
        int ar[] = {7, 7, 3, 4, 1, 2};
        subarray(ar);
    }
}
