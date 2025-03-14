import java.util.*;
public class PatternD{
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=n ;i++){
            for(int s = 1; s<=n-i+1 ; s++){
                 System.out.print(s+" ");
            }
            System.out.println( );
            
        }
    }
}