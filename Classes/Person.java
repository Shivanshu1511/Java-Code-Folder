import java.util.*;
public class Person{
    Scanner sc = new Scanner(System.in);
    String name ;
    int age ;
    String add ;
    public void get_inputs(){
        System.out.print("Enter name :");
         name = sc.nextLine();
         System.out.print("Enter Age :");
         age = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Address  :");
         add = sc.nextLine();
    }
    public void per_details(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Address :"+add);
    }
    public static void main(String[] args){
        Person getdata =new Person();
        getdata.get_inputs();
        getdata.per_details();

    }

    }
     