import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesfromunsortedArray {
    public static void removeDuplicates(int [] arr){
      HashSet <Integer> uniqueNo = new HashSet<>();
      for(int i : arr){
        uniqueNo.add(i);
      }
      int result[] = new int[uniqueNo.size()];
      int i = 0;
      for(int num: uniqueNo){
        result[i++] = num;
      }
      System.out.println(Arrays.toString(result));
   }
    
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        removeDuplicates(arr);
    }
}
