import java.util.Scanner;

public class FactorialNumber{

    public static void main ( String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number :");
         int num = input.nextInt();
         int fac = 1 ;
         
         for(int i= 1; i<=num ;i++)
         {
              fac = fac* i ;
         }
         System.out.println("Factorial of Number :"+fac);
    }
}