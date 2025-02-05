import java.util.*;
import java.lang.*;
public class ShapeHierarchy{
    Scanner sc = new Scanner(System.in);
    int l ;
    int b;
    int r;
    int h;
    public void rectangle(){
        System.out.println("Enter Length:");
        l = sc.nextInt();
        System.out.println("Enter Breath");
        b = sc.nextInt();
        int area =  l*b ;
        System.out.println("Area of Rectangle : "+ area);
    }
   public void circle(){
       System.out.println("Enter Radius : ");
        r =sc.nextInt();
        System.out.println("Area of circle :" +(Math.pow(r, 2) * Math.PI));
    }
    public void triangle(){
        System.out.println("Enter Length:");
        l=sc.nextInt();
        System.out.println("Enter Breath :");
        b =sc.nextInt();
        System.out.println("Enter Height :");
        h= sc.nextInt();
        int perimeter =l+b+h ;
        System.out.println("Perimeter of triangle :" + perimeter);
    }
  public static void main(String[] args){
    ShapeHierarchy get_data =new ShapeHierarchy();
    get_data.rectangle();
    get_data.circle();
    get_data.triangle();
     }
}