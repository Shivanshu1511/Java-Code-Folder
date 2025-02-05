import java.util.Scanner;
public class FibonaciSeries{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num =input.nextInt();
        int n1 =0;
        int n2 = 1;
        System.out.print("Fibonaci Series upto "+num+"terms :");
        System.out.print(n1+ " " + n2);
        int sum ;

        for ( int i = 3; i <= num ; i++){
            sum =n1 + n2 ;
             System.out.print(" "+ sum +"");
            n1= n2 ;
            n2 = sum ;
        }
             
    }
}