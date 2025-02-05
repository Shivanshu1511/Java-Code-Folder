import java.util.*;
public class EqualArray{
       public static void main (String[] args){
        int n[] ={100,20,30,50,10,160};
        int m[] ={20,30,40,50,100,160};
        int count =0;
        for(int i= 0 ; i <= n.length;i++){
          for(int j= 0 ; j<=m.length;j++){
            while(n[i]== m[j]){
              count++;
            }
          }
        }
        if(count =n.length){
          System.out.println("Array is equal");
        }
        else{
          System.out.println("Array is not equal");
        }
   }  
}        
