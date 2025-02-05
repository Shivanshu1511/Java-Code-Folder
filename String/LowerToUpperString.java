import java.util.*;

public class LowerToUpperString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "java coder";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(str.charAt(i));
            }
        }

        String transformedStr = result.toString();
        System.out.println(transformedStr);
    }
}
