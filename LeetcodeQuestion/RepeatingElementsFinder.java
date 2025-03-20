import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingElementsFinder {

    public static void repeatingElemntFinder(int[] arr, int n){
        Map<Integer, Integer> mapArr = new HashMap<>();

        for(int num :arr){
            mapArr.put(num,mapArr.getOrDefault(num, 0)+1);
        }
        //********************************************************************************************************************************/
        //keySet() → Used to iterate over keys only.
        // entrySet() → Used to iterate over both keys and values together.
        //********************************************************************************************************************************/
        // for(int key :mapArr.keySet()){
        
        //     if(mapArr.get(key)>=2){
        //         System.out.print(key +" ");
        //     }

        // }
        for(Map.Entry<Integer,Integer> entry : mapArr.entrySet()){
            if(entry.getValue()>=2){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
 
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        repeatingElemntFinder(arr, n);
    }
}
