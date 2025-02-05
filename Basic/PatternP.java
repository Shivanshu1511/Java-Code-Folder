import java.util.*;
public class PatternP{
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int s = i; s>0; s++){
                 System.out.print(s+" ");
                 s++;
            }
            System.out.println( );
            
        }
    }
}