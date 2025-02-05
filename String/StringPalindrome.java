import java.util.*;
public class StringPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String frontstr ="";
        String backstr ="";
        for(int i=0;i<str.length()/2;i++){
            frontstr += str.charAt(i);
        }
        for (int i= str.length()-1; i >=str.length()/2;i--){
            backstr += str.charAt(i);
        }
        if(frontstr.equals(backstr)){
            System.out.println("String is in Palindrome");
        }
        else{
            System.out.println("String is in not Palindrome");
        }
        
    }
}