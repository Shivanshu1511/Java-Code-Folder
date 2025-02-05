import java.util.*;
class StatasticCalculation{
    public static Integer [] datainputs(){
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter the no of Data : ");
        int n = sc.nextInt();
        Integer[] arr= new Integer[n];
        
        for(int i= 0; i<n;i++){
            arr[i] = sc.nextInt();
        }    
        return arr;
    }
    public static void mean(Integer[] arr){
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        int mean = sum/arr.length;
        System.out.println("Mean of Given Data :"+mean);
    }
public static void median(Integer[] arr){
    Arrays.sort(arr);
    if(arr.length%2!=0){
      System.out.println("Median of Given Data :" +arr[ (arr.length-1)/2]) ;
    }
    else{
        System.out.println("Median of Given Data : "+arr[((arr.length-1)/2)+1]);
    }
}
public static void mode(Integer[] arr) {
    Arrays.sort(arr);
    int modeValue = 0;
    int maxCount = 0;
    
    int i = 0;
    while (i < arr.length) {
        int currentCount = 1;
        int j = i + 1;
        
        // Count occurrences of the current element
        while (j < arr.length && arr[i] == arr[j]) {
            currentCount++;
            j++;
        }
        
        // Check if current element is the new mode
        if (currentCount > maxCount) {
            maxCount = currentCount;
            modeValue = arr[i];
        }
        
        // Move to the next unique element
        i = j;
    }
    
    System.out.println("Mode of Given Data: " + modeValue);
}

public static void main(String[] args){
       StatasticCalculation gt =new  StatasticCalculation();
        Integer[] arr = datainputs();
        gt.mean(arr);
        gt.median(arr);
        gt.mode(arr);
    
} 

}

