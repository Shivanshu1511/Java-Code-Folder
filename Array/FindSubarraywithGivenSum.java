
 public class FindSubarraywithGivenSum{
   static   int subArraySum(int arr[], int n, int sum)
    {
        int currentSum = arr[0], start = 0, i;
  
        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If currentSum exceeds the sum,
            // then remove the starting elements
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }
  
            // If currentSum becomes equal to sum,
            // then return true
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println(
                    "Sum found between indexes " + start
                    + " and " + p);
                return 1;
            }
  
            // Add this element to curr_sum
            if (i < n)
                currentSum = currentSum + arr[i];
        }
  
        System.out.println("No subarray found");
        return 0;
    }
    public static void main(String[] args){
        int n=6;
        int arr[] = {1,4,5,3,10,20};
        int sum = 33;
       subArraySum(arr,n,sum);
  
    }
}
