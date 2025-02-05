import java.util.*;
public class BankAccountsTransactions{
    Scanner sc = new Scanner(System.in);
    String acc_holder_name ;
    int age ;
    String add ;
    int acc_no ;

    BankAccountsTransactions(){
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
    public void trans_deatils(){
        System.out.println("Enter amount deposit:");
        int dep = sc.nextInt();
        System.out.println("Enter amount withdraw: ");
        int withd =sc.nextInt();
        int bal = dep - withd ;
        System.out.println("Bank Balance : "+bal);
    }
    public void per_details(){
        System.out.println("Name :"+acc_holder_name);
        System.out.println("Age :"+age);
        System.out.println("Account Number :"+acc_no);
        System.out.println("Address :"+add);
      
        
    }
    public static void main(String[] args){
       BankAccountsTransactions getdata =new BankAccountsTransactions();
        getdata.per_details();
        getdata.trans_deatils();

    }

}
     