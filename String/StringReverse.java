import java.util.*;
public class StringReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         StringBuffer  result = new StringBuffer();
        int ln=str.length();
        for(int i=ln-1;i>=0;i--){
            result.append(str.charAt(i));
        }
        System.out.println(result);
        
        if (str.equals(result.toString())){
            System.out.println("String is Palindrome");
        }else System.out.println("String is Not Palindrome");
    }
}