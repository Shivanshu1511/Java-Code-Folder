import java.util.*;

public class SringCompression {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        String str = "raaaaaaaaaaaam";
        StringBuilder result = new StringBuilder();
        Integer count = 1;

        for (int i = 0; i < str.length(); i++) {
           while(i< str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
            count++;
            i++;
           }
            result.append(str.charAt(i));
            if(count>1){
               result.append(count);
            }
             count = 1; 
        }


       String transformedStr = result.toString();
        System.out.println(transformedStr);
    }
}
