import java.util.Scanner;

public class SumofElement {
    public static void sumofelement(int arr[]) {
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print("Sum of Element "+ sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sumofelement(arr);
    }
    
}
