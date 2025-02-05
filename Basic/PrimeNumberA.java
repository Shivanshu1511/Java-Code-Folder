import java.util.*;
public class PrimeNumberA{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        boolean isPrime = true ;
        for(int i =2 ; i<= num-1 ; i++){
            if(num % i == 0){
                isPrime = false ;
            }
        }
        if ( isPrime ==true){
            System.out.println(num+" is Prime Number");
        }
        else{
            System.out.println(num+" is not Prime Number");
        }
    }
}

    