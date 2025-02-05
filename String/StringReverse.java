import java.util.*;
public class StringReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      
        int ln=str.length();
        for(int i=ln-1;i>=0;i--){
            System.out.print( str.charAt(i));
        }
        
    }
}