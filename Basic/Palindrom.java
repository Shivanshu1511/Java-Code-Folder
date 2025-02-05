import java.util.*;
public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();
        String result = "";
        for(int i = str.length()-1 ; i>= 0; i--){
            result += str.charAt(i);
        }
         if (result.equals(str)){
            System.out.println("String is a Palindrom");
         }
         else{
            System.out.println("String is not a Palindrom");
         }
    }
}
