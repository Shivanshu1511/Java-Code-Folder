import java.util.*;
public class SecondLargestNumber{
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
       int seclarge= Integer.MIN_VALUE;
       for(int i= 0 ;i<=n.length-1;i++){
        if(n[i]>seclarge && n[i]!=index){
          seclarge = n[i]; 
        }
       }
        System.out.println("Second largest Element:"+seclarge);
       }
       
      

      }        
