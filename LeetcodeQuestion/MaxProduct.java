import java.util.Arrays;
import java.util.Scanner;

public class MaxProduct {

    public static int maxproduct(int[] arr){
        if(arr.length == 0){
             return 0;
        }
        int maxproduct = arr[0];
        int minproduct = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap max and min because multiplying by negative flips them
                int temp = maxproduct;
                maxproduct = minproduct;
                minproduct = temp;
            }
            
            maxproduct = Math.max(arr[i], arr[i] * maxproduct);
            minproduct = Math.min(arr[i], arr[i] * minproduct);
            
            result = Math.max(result, maxproduct);
        }

        return  result;
    }
 
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         int n= sc.nextInt();
         int [] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }
         System.out.println(Arrays.toString(arr));
         int res = maxproduct(arr);
               System.out.println(res);


    }
}
