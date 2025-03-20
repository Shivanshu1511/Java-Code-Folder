import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void addelement(int[] arr, int x,int n){
          ArrayList<Integer> res = new ArrayList<>();
          for(int num : arr){
            res.add(num);
          }
          res.add(x);
          System.out.println(res);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        addelement(arr, x, n);
    }
}
