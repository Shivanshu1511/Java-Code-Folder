import java.util.Arrays;
import java.util.Scanner;

public class MergedArray {
    public static int[] mergedArray(int[] arr1, int a, int[] arr2, int b){
     
        int[] merged  = new int[a+b];
        System.arraycopy(arr1, 0, merged, 0, a);
        System.arraycopy(arr2, 0, merged, a, b);
        return merged;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1= new int[a];
        int[] arr2= new int[b];
        for(int i=0; i<a;i++){
            arr1[i] = sc.nextInt();
        } 
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i<b;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

      System.out.println(Arrays.toString(mergedArray(arr1, a, arr2, b)));
    }
}
