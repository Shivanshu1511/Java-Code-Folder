import java.util.*;
public class StringAnagaram{
    public static void main(String[] args){
      String str1 = "enagaram";
      String str2 ="anegaram";
      if (str1.length()!= str2.length()){
        System.out.print("String is not ANAGARAM");
      }else{
      for(int i= 0 ;i < str1.length();i++){
        for(int j =0 ; j<str2.length();j++){
            if (str1.charAt(i)==str2.charAt(j)){
            str2 = str2.substring(0, j) + str2.substring(j + 1);
                break;
            }
            if (j==str2.length()-1){
                System.out.print("String is not ANAGARAM");
                  return;
            }
        }
        
      }
    System.out.println("String is  ANAGARAM");
    }
        
    }
}