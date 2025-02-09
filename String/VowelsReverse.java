
// 1. Write a program that takes a string as input and reverses only the vowels in the string, while keeping all other characters in their original positions.
// 𝐈𝐧𝐩𝐮𝐭: "programming"
// 𝐎𝐮𝐭𝐩𝐮𝐭: "prigrammong"
import java.util.Scanner;

public class VowelsReverse {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        int left = 0, right = str.length() - 1;
       
        while (left<right){
            if (isVowel(str.charAt(left)) && isVowel(str.charAt(right))) {
                // Swap vowels
                char temp = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right, temp);
                left++;
                right--;
            } else {
                if (!isVowel(str.charAt(left))) left++;
                if (!isVowel(str.charAt(right))) right--;
            }
        }       
        System.out.println(str);
    }
      // Helper method to check if a character is a vowel
      private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
