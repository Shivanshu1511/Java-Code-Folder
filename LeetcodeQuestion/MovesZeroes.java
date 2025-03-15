import java.util.Arrays;
import java.util.Scanner;

public class MovesZeroes {

    public static void movesZeroes(int arr[], int n){
        int index = 0; // Pointer used to place non zero element 
        for(int i=0;i<n;i++){
            if(arr[i] !=0){
                arr[index++] = arr[i];  // shifing the non zero element in inital index 
            }
        }
        while (index < n){
            arr[index++] = 0;      // asing zero to remaning index
        }
           System.out.println("New Array "+ Arrays.toString(arr));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        movesZeroes(arr, n);
    }
}