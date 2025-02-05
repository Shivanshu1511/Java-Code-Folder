import java.util.Scanner;
public class subtraction{
    public static void main ( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first no. ");
        int num1= input.nextInt();
        System.out.println("enter second no.");
        int num2 =input.nextInt();
        int sub =num1-num2 ;
        System.out.println("subraction of two no "+num1+"and "+num2+ "is:"+sub);
        }

}