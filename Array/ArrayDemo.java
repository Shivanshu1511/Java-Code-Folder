import java.util.*;
public class ArrayDemo{
    public static void main (String[] args){
        int ar[] = new int[20];
        Scanner sc = new Scanner(System.in);
        ar[0] = sc.nextInt();
        ar[1] =sc.nextInt();
        ar[2] =sc.nextInt();
        System.out.println("First Element :"+ar[0]);
        System.out.println("Second Element :"+ar[1]);
        System.out.println("Third Element :"+ar[2]);
    }        
}