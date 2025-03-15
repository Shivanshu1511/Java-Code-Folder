import java.util.Scanner;
//Problem Statement:
// You are given a binary number (a number represented in base-2) as a string. Your task is to convert this binary number into its decimal (base-10) equivalent and print the result.
public class BinaryToDecimal {

    public static void binaryTodecimal(String binaryStr){
        int decimalValue = Integer.parseInt(binaryStr, 2); // Convert binary to decimal
        System.out.println(decimalValue);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryStr = sc.nextLine();
        binaryTodecimal(binaryStr);

    }
}
