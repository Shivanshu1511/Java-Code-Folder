import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SymmetricPair {

    public static void symmericPair(int[][] arr){
        Map<Integer, Integer> mapArr = new HashMap<>();
        List<int[]>result = new ArrayList<>();

        for(int[] num :arr){
            int a = num[0] ;
            int b = num[1];
                    // Check if the reverse pair (b, a) exists in the map
                    
            if(mapArr.containsKey(b) && mapArr.get(b)==a){
                  result.add(new int[]{a,b});
            }else{  // Store the pair in the map
                mapArr.put(a, b);
            }
        }
        for(int[] num : result){
            System.out.print("("+num[0]+", "+num[1]+") ");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int arr[][] = new int[n][2];
         for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
         }
    System.out.println(Arrays.deepToString(arr));
    symmericPair(arr);
    }
}
