import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[],int n){
        for(int i=0; i<n;i++){
            for(int j= 0;j<n-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array" +Arrays.toString(arr));
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array " + Arrays.toString(arr));
        bubbleSort(arr, n);
        // System.out.println("Sorted Array " + Arrays.toString(arr));
        
    }
}
