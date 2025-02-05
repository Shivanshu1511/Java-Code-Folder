import java.util.*;
public class SubArray{
    public static void subarray(int ar[]){
    
        for(int i=0 ;i <=ar.length -2; i++){
            int start =i ;
            for (int j= i; j <= ar.length-1;j++){
            int end = j ;
                    System.out.print("(");
            for(int k=start ;k<=end ;k++){
                System.out.print(ar[k]+ " " );
            }
                    System.out.print(") ");
            
            
                       }
                       System.out.println();
    }
            
       }
       public static void main(String[] args){
      int   ar[] = {1,2,3,4,5,7};
      subarray(ar);
      
       }
        
    }
    