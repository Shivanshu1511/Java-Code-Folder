import java.util.Scanner;

public class PrimeNumber{
     
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = input.nextInt();
        int count=0;
         for (int i = 1 ; i<=num ; i++){
            if (num % i == 0){
                count++;
            }
         }
if (count == 2){
    System.out.println(+num+" is prime number");
}
else{
    System.out.println(+num+"is not a prime number");
}
    }
}