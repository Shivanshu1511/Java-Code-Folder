import java.util.Arrays;
import java.util.Scanner;
// A majority element is an element that appears more than ⌊n/2⌋ times in an array of size n.
public class MajorityElement {
    public static int majorityElement(int arr[], int n){
        for (int i = 0; i < n; i++) {  // Iterate over each element
            int count = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            // Check if count is more than n/2
            if (count > n / 2) {
                return arr[i];  // Majority element found
            }
        }
        return -1; // No majority element
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(majorityElement(arr,n));
    }
}
