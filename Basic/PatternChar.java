import java.util.*;
public class Patternhallow{
    public static hollow_rectangel(int rows,int cols){
        for(int i = 1 ;i<=rows ; i++){
            for(int s =1; s<=cols; s++){
                if(i=1||i=rows||s=1||s=cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }    
         System.out.println();  
        }
        public static void main(String[] args){
            hollow_rectangel( 4,5);
        }
    }
}

       