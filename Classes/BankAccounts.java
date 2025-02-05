import java.util.*;
public class BankAccounts{
    Scanner sc = new Scanner(System.in);
    String acc_holder_name ;
    int age ;
    String add ;
    int acc_no ;

    public void get_inputs(){
        System.out.print("Enter name :");
         acc_holder_name = sc.nextLine();
         System.out.print("Enter Age :");
         age = sc.nextInt();
         System.out.println("Enter Account  number :");
         acc_no = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Address  :");
         add = sc.nextLine();
    }        
    public void per_details(){
        System.out.println("Name :"+acc_holder_name);
        System.out.println("Age :"+age);
        System.out.println("Account Number :"+acc_no);
        System.out.println("Address :"+add);
      
        
    }
    public static void main(String[] args){
        BankAccounts getdata =new BankAccounts();
          getdata.get_inputs();
        getdata.per_details();

    }

}
     