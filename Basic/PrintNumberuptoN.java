import java.util.*;
public class PrintNumberuptoN{// While loop demo
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = 1;
        while( n <= num){
            System.out.print(" "+n);
            n++ ;
        }
    }
}