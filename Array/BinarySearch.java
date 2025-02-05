import java.util.*;
public class BinarySearch{
    public static int binarysearch(int n[],int key )
    {
        int start = 0; 
        int end = n.length-1 ;
        while(start<= end){
          int mid = (start + end) /2 ;
          if(n[mid]==key){
            return mid ;
          }
          if (n[mid] > key){
            end = mid -1 ;
          }
          else{
            start = mid+1;
          }
        }
        return -1 ;
      }
       public static void main (String[] args){
        int n[] ={100,20,30,50,10,160};
        int key =30;
       int  index = binarysearch(n,key);
       
       System.out.println(" number found on index :"+index);
      }        
}
