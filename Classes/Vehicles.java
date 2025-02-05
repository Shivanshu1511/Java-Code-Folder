import java.util.*;
class Vehicles{
    Scanner sc = new Scanner(System.in);
String model_N;
String makers ;
int rental_price;
float milage;
public void print_details(){
    Vehicles print =new Vehicles();
    System.out.println(print.cars_details());
    System.out.println(print. bike_details());
    System.out.println(print.truck_details());

}


}
class Cars extends Vehicles{
    public void cars_details(){
    System.out.println("Enter Model Name:");
    model_N =sc.NextLine();
    System.out.println("Enter Makers Name :");
    makers = sc.NextLine();
    System.out.println("Enter Reantal price : ");
    milage = sc.nextFloat();
  }
}
class Bike extends Vehicles{
    public void bike_details(){
        System.out.println("Enter Model Name:");
        model_N =sc.NextLine();
        System.out.println("Enter Makers Name :");
        makers = sc.NextLine();
        System.out.println("Enter Reantal price : ");
        milage = sc.nextFloat();
    }
}
class Truck extends Vehicles{
    public void truck_details(){
        System.out.println("Enter Model Name:");
        model_N =sc.NextLine();
        System.out.println("Enter Makers Name :");
        makers = sc.NextLine();
        System.out.println("Enter Reantal price : ");
        milage = sc.nextFloat();
    }
}
class Main {
    public static void public static void main(String[] args) {
        Vehicles getresult =new Vehicles();
        getresult.print_details();
    }
}