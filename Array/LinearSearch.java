import java.util.*;
public class LargestNumber{
    public static int largestnumber(int n[] ,int key)
    {

       for(int i = 0 ; i <= n.length; i++){
        if(n[i]< key){
            return i ;
         }
       }
       return -1 ;
    }
       public static void main (String[] args){
        int n[] ={100,20,30,50,10,60};
        int key = 60;
       int  index = largestnumber(n, key);
       if(index == -1){
        System.out.print(key+"is not largest number");

       }
       else{
        System.out.println(key+" is largest number");
       }
       System.out.println();
    }        
}