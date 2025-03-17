import java.util.Scanner;

public class AverageofElement {
    public static void averageofelements(int[] arr, int n) {
        int sum =0 ;
        for(int i =0; i<n;i++){
            sum += arr[i];
        }
        int avg = sum/n;
        System.out.println("Average of Elements : "+ avg);
    }
 public static void medianofelements(int[] arr, int n){
    float median=0;
          if(n%2==0){
            median  = arr[(n/2)-1]; 
          }else median = arr[((n+1)/2)-1];

          System.out.println("Median of elements : " +median);
 }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        averageofelements(arr, n);
        medianofelements(arr, n);
    }
    
}
