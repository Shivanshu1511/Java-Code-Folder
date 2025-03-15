import java.util.Scanner;

public class CountNumbersInRange {
    // public static void countnumberINrange(int arr[], int n){}

    public static void main(String args[]){

          Scanner sc = new Scanner(System.in);
          int L = sc.nextInt();// staring range 
          int R = sc.nextInt();// ending range 
          int n= sc.nextInt();// size of the array
          int arr[]= new int[n];
          int count = 0;

          for(int i =0; i<n;i++){
             arr[i] = sc.nextInt();
             if(arr[i]>= L && arr[i]<R){
                count++;
             }
          }          
       System.out.println("No of Element in range "+ count);
    }
    
}
