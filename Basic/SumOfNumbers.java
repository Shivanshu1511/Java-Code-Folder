import java.util.Scanner;

public class  SumOfNumbers{

    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++)
        {
     sum += i;
        }
         System.out.println("Sum of n Numbers is :"+sum);
    }
}