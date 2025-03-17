import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyofElement {

    public static void frequencyofelement(int arr[]){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Integer key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of Array
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        frequencyofelement(arr);
    }
    
}
