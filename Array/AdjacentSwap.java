import java.util.Scanner;

public class AdjacentSwap {
    public static boolean adjacentswap(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
              if(arr[i] -arr[i+1] == 1){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
              }
               else {
                  return false;
               }
            }
        }
        return true;
    }
    public static void  main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(adjacentswap(arr)){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
    
}
