import java.util.*;
public class Rectangle{
    Scanner sc = new Scanner(System.in);
    int l;
    int b;
    
    public void get_inputs(){
    System.out.println("Enter length:");
       l = sc.nextInt();
      System.out.println("Enter breath :");
       b = sc.nextInt();
    }
    public void calc_area(){
        System.out.println("length of rectangle is :"+l);
        System.out.println("breath of rectangle is :"+b);
        int area =l*b;
        System.out.println("Area of rectangle is :"+area);
    }

    public static void main(String[] args){
         
        Rectangle getdata = new Rectangle();
        getdata.get_inputs();
        getdata.calc_area();
    }
  }

