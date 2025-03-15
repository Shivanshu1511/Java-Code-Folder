import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void mergeSortedArray(int arr1[], int n , int arr2[], int m){
        int i =0;
        int j =0;
        int k =0;
        int mergedArray[] =new int[n+m];
        // Merge both arrays while comparing elements
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 (if any)
        while (i < n) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 (if any)
        while (j < m) {
            mergedArray[k++] = arr2[j++];
        }
        System.out.println("MEREGED ARRAY "+Arrays.toString(mergedArray));
        
    }

        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0 ;i<n; i++){
            arr1[i] =sc.nextInt();
        }
        for(int j=0 ;j<n; j++){
            arr2[j] =sc.nextInt();
        }
        System.out.println("ARRAY1 "+ Arrays.toString(arr1));
        System.out.println("ARRAY2 "+ Arrays.toString(arr2));
        mergeSortedArray(arr1, n, arr2, m);
    }
    
}
