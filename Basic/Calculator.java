import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Number :");
        int b = sc.nextInt();
        System.out.print("Enetr Operator :");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.println(a+b);
                     break;
            case '-': System.out.println(a-b);
                    break;
            case '*': System.out.println(a*b);
                    break ;
            case '/': System.out.println(a*b);
                     break;
            case '%': System.out.println(a%b);
                    break;
        
            default:
                break;
        }
    }
}