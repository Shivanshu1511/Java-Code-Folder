import java.utli.*:
public class Rectangle{
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    int area ;
    public void calc_area(){
        System.out.println("length of rectangle is :"+l);
        System.out.println("breath of rectangle is :"+b);
        area =l*b;
        System.out.println("Area of rectangle is :"+area);
    }
}
class Test {
    public static void main(String[] args){
         
        Rectangle getdata = new Rectangle();
        getdata.calc_area();
    }
}
