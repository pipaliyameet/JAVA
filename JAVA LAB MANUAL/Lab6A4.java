import java.util.Scanner;
class Bank_Account{
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;

    public void AccountDetail(int accountNo , String userName , String email , String accountType , int accountBalance){
        System.out.println("Account Number = "+accountNo);
        System.out.println("User Name : "+userName);
        System.out.println("User Email Id : "+email);
        System.out.println("Account Tyoe : "+accountType);
        System.out.println("Account Balance : "+accountBalance);
    }

}
public class Lab6A4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank_Account n = new Bank_Account();
        System.out.print("Enter a Account Number : ");
        int accountnum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a User Name : ");
        String username = sc.nextLine();
        System.out.print("Enter a user email : ");
        String useremail = sc.nextLine();
        System.out.print("Enter a Account Type : ");
        String type = sc.nextLine();
        System.out.print("Enter a Account Balance : ");
        int accountbalance = sc.nextInt();
        n.AccountDetail(accountnum , username , useremail , type , accountbalance);

    }
}
