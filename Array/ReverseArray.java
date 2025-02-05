import java.util.*;
public class ReverseArray{
    public static void reverse_array(int ar[]){
        int start =0 ;
        int end = ar.length-1;
       while(start<end){
         int temp = ar[start];
         ar[start] = ar[end];
         ar[end]=temp;
         start++;
        end--;
       }
        
    }
    public static void main(String[] args){
      int   ar[] = {1,2,3,4,5,7};
       reverse_array(ar);
       System.out.print("Reversed array is: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}