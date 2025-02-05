import java.util.*;
public class MultidimensionalArraay{
    public static void main(String[] args){
      int ar[][] = new int[3][3];
     int n = ar.length;
     int m =ar[0].length;
     Scanner sc = new Scanner(System.in);
     for (int i =0 ; i <= n ; i ++){
        for (int j = 0;j<= m ; j++){
             ar[i][j]= sc.nextInt();
        }
      }
       for (int i =0 ; i <= n ; i ++){
        for (int j = 0;j<= m ; j++){
          System.out.print(ar[i][j]+" ");
        }
    }
      System.out.println();
    }
}
