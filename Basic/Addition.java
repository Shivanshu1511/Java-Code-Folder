import java.util.Scanner;
public class Addition{
    public static void main( String[] args){
        Scanner input =new Scanner(System.in);
       System.out.println("Enter the first number :");
       int num1 = input.nextInt();
       System.out.println("enter second no");
       int num2 = input.nextInt();
       int sum = num1 + num2 ;
    System.out.println("The sum of "+num1+ "and "+num2+ "is :"+sum);
  }
}