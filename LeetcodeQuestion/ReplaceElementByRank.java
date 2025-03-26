import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceElementByRank {
    public static void replaceElementByRank2(int[] arr){  // By using Hashmap
       
     int[] arrcopy  =arr.clone();
     Arrays.sort(arrcopy);
     Map<Integer, Integer>rankMap= new HashMap<>();
     int i = 1; // Rank 
     for(int num : arrcopy){
        if(!rankMap.containsKey(num)){
            rankMap.put(num,i++);
        }
     }
        int[] res = new int[arr.length];
        for(int num =0;num<res.length;num++){
            res[num] = rankMap.get(arr[num]);
        }
        System.out.println(Arrays.toString(res));
    }
    public static void replaceElementByRank1(int[] arr){// but it does not handle the duplicates element case
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            int rank= 1;
            for(int j=0;j < arr.length;j++){
                if(arr[i]>arr[j]){
                    rank++;
                }                 
            }
           res[i]=rank;
        }
        System.out.println(Arrays.toString(res));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        replaceElementByRank1(arr);
        replaceElementByRank2(arr);

    }
}




