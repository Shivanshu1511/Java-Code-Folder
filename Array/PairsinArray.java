import java.util.*;
public class PairsinArray{
    public static void pairs(int ar[]){
        for(int start =0 ; start <=ar.length -2; start++){
        for (int i = start+1 ; i <= ar.length-1;i++){
             int pair = ar[start];
            int element = ar[i];
            System.out.print("(" + pair + ", " + element + ")");
                       }
                       System.out.println();
    }
            
       }
       public static void main(String[] args){
      int   ar[] = {1,2,3,4,5,7};
       pairs(ar);
      
       }
        
    }
    