import java.util.*;
public class PrintReverse{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num  = sc.nextInt();
       int  orgnum = num;
        int reverse = 0;
        while( num > 0){
            int lastdigit = num%10;
            reverse = reverse*10+lastdigit;
            num =num/10 ;
        }
            System.out.println(reverse);
            if(orgnum == reverse){
                System.out.println("Is Palindrome" );
            }
            else{
                System.out.println("Is not Pailndrome");
            }
    }

}