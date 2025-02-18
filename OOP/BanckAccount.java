import java.util.Scanner;
class UserAccount{
    String username;
    int accountNumber;
    String userMailId;
    int userPhoneNumber;
    int userage;
    String accountmode;
    int accountBalence;
    public UserAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user name : ");
        username = sc.nextLine();
        System.out.print("Enter user mail id : ");
        userMailId = sc.nextLine();
        System.out.print("Enter account mode : ");
        accountmode = sc.nextLine();
        System.out.print("Enter user age : ");
        userage = sc.nextInt();
        System.out.print("Enter user phone number : ");
        userPhoneNumber = sc.nextInt();
        System.out.print("Enter user account number : ");
        accountNumber = sc.nextInt();
        System.out.print("Enter account balence : ");
        accountBalence = sc.nextInt();
        if(accountBalence>=1000){
            account();
        }
        else{
            System.out.print("Plese enter balence minimum 1000");
        }
    }

    public void account(){
        Scanner sc = new Scanner(System.in);
        System.out.println("user name is = "+username);
        System.out.println("user age is = "+userage);
        System.out.println("user phone number is = "+userPhoneNumber);
        System.out.println("user mail id is = "+userMailId);
        System.out.println("user account number is = "+accountNumber);
        System.out.println("user account mode is = "+accountmode);
        System.out.println("user account balence = "+accountBalence);

        Change();

    }
    public void Change(){
        Scanner sc = new Scanner(System.in);
        System.out.println("if you withdraw mony so enter a 0 or if you invest mony so enter 1 :");
        
        int temp = sc.nextInt(); 
        if(temp==0){
            withdraw();
        }
        else if(temp==1){
            invest();
        }
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdraw amount : ");
        int temp = sc.nextInt();
        int temp1 = accountBalence-temp;
        if(temp1<=1000 || temp1>0){
            System.out.println("if you withdraw this amount then your account balence is under 1001 so you do not withdraw this amount");
        } 
        else if(temp1<0){
            System.out.println("insufficiant balance");
        }
        else{
            accountBalence -= temp;
            System.out.println("This time your account balance is = "+accountBalence);
        }

        System.out.print("if you want to re chack so enter a 1 otherwise enter any othe key:");
        int chack = sc.nextInt();
        if(chack==1){
            Change();
        } 
    }
    public void invest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter invest amount : ");
        int temp = sc.nextInt();
        accountBalence += temp;
        System.out.println("This time your account balance is = "+accountBalence);
        
        System.out.print("if you want to re chack so enter a 1 otherwise enter any othe key :");
        int chack = sc.nextInt();
        if(chack==1){
            Change();
        }
    }
}
public class BanckAccount {
    public static void main(String[] args) {
        UserAccount s1 = new UserAccount();
    }
}
