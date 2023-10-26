package abstarctinterfacepack;

// Define an interface named BankAccount1
interface BankAccount1 
{
    // Declare abstract methods for deposit and withdrawal
    void deposit(double amount);
    void withdraw(double amount);
}

// Create a class CheckingAccount1 that implements the BankAccount1 interface
class CheckingAccount1 implements BankAccount1
{
    private String accountnum; // Store account number
    private double balance;   // Store account balance
    
    // Constructor for CheckingAccount1
    public CheckingAccount1(String accountnum, double balance) 
    {
        this.accountnum = accountnum;
        this.balance = balance;
    }

    // Implement the deposit method from the BankAccount1 interface
    @Override
    public void deposit(double amount) 
    {
        this.balance += amount;
        System.out.println("Account details after deposit:");
        System.out.println("Account number: " + accountnum + "\nAmount deposited: " + balance);
    }

    // Implement the withdraw method from the BankAccount1 interface
    @Override
    public void withdraw(double amount) 
    {
        if (this.balance >= amount) 
        {
            this.balance -= amount;
            System.out.println("\nAccount details after withdrawal:");
            System.out.println("Account number: " + accountnum + "\nAmount withdrawn: " + balance);
        } else 
            System.out.println("Insufficient balance");
    }
}

public class BankAccountInterfaceDemo 
{
    public static void main(String[] args) 
    {
        // Create a CheckingAccount1 object with an account number "002233R90" and initial balance 3000
        CheckingAccount1 ca1 = new CheckingAccount1("002233R90", 3000);
        
        // calling the method with Deposit 2000 into the account
        ca1.deposit(2000);
        
        // calling the method with Withdraw 1500 from the account
        ca1.withdraw(1500);
    }
}