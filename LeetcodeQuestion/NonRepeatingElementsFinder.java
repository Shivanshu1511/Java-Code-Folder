import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingElementsFinder {

    public static void nonRepeatingElementsFinder(int[] arr, int n){

        Map<Integer,Integer> mapArr = new HashMap<>();
          
        for(int num :arr){
            mapArr.put(num, mapArr.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : mapArr.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        nonRepeatingElementsFinder(arr, n);
    }
}