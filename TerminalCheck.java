import java.util.*;
public class TerminalCheck{
    public static void main(String[] args){
        int n = 4;
        for(int i=1; i<=n ;i++){
            for(int sp=1;sp<=n-i ;sp++){
               System.out.print(" ");
            }
            for(int s = 1; s <= i; s++){
                 System.out.print("*");
            }
            System.out.println();
            
        }
    }
}