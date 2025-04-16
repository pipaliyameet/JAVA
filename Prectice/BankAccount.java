// Write a program to create Account class, which is representing a bank account 
// where we can deposit() and withdraw() money. Minimum balance must be 
// 1000₹. Throw InSufficientFundException to handle above situation and display 
// proper error message.

import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class Account{
    Account()throws InSufficientFundException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Amount of mony : ");
        int a = sc.nextInt();

        if(a>1000){
            System.out.println("Sufficiant amount");
        }
        else if(a<1000 && a==1000){
            System.out.println("insufficiant amount");
            throw new InSufficientFundException("please enter minimum 1000 amount");
        }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        try{
            Account obj1 = new Account();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
