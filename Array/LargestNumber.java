import java.util.*;
public class LargestNumber{
    public static int largestnumber(int n[] )
    {
         int largest = Integer.MIN_VALUE ;
       for(int i = 0 ; i < n.length; i++){
            if(n[i] > largest){
           largest = n[i];
            }
         }
       return largest ;
      }
       public static void main (String[] args){
        int n[] ={100,20,30,50,10,160};
       int  index = largestnumber(n);
       
       System.out.println("largset number is :"+index);
      }        
}