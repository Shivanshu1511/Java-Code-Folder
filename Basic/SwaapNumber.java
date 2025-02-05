import java.util.Scanner;

public class SwaapNumber{

    public static void main(String[] args){10
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of X :");
        int x= input.nextInt();
        System.out.println("Enter value of Y :");
        int y=input.nextInt();
        int temp = x;
        x=y;
        y=temp;
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
    }
}