import java.util.*;
public class ReveseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();
        String result = "";
        for(int i = str.length()-1 ; i>= 0; i--){
            result += str.charAt(i);
        }
         System.out.print("Reversed String is :"+result);
    }
}