class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class Account {
    private double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "  New Balance: " + balance);
    }
    
    public void withdraw(double amount) throws InSufficientFundException {
         if (amount > balance) {
                throw new InSufficientFundException("Withdrawal failed! balance nathi");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + "  Remaining Balance: " + balance);
    }
}

public class ThrowDemo {
    public static void main(String[] args) {
        Account ac1 = new Account(5000000);
        ac1.deposit(20000);
        
        try {
            ac1.withdraw(8000);
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            ac1.withdraw(30000);
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}