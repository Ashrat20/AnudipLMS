package abstarctinterfacepack;

// Created Abstract class BankAccount
abstract class BankAccount
{
    protected String accountnum; // Store account number
    protected double balance;   // Store account balance

    // Declare a Abstract methods for deposit and withdrawal
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

// Created a Class CheckingAccount extends BankAccount
class CheckingAccount extends BankAccount
{
    // Created Constructor for CheckingAccount
    public CheckingAccount(String accountnum, double balance) 
    {
        this.accountnum = accountnum;
        this.balance = balance;
    }

    // Override the deposit method to add money to the account
    @Override
    void deposit(double amount) 
    {
        this.balance += amount;
        System.out.println("Account details after deposit:");
        System.out.println("Account number: " + accountnum + "\nAmount deposited: " + balance);
    }

    // Override the withdraw method to withdraw money from the account
    @Override
    void withdraw(double amount) 
    {
        if (this.balance >= amount) 
        {
            this.balance -= amount;
            System.out.println("\nAccount details after withdrawal:");
            System.out.println("Account number: " + accountnum + "\nAmount withdrawn: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }   
}

public class BankAccountAbstractDemo 
{
    public static void main(String[] args) 
    {
        // Create a CheckingAccount object with an account number "788654A56" and initial balance 2000
        CheckingAccount ca = new CheckingAccount("788654A56", 2000);
        
        //calling the method with Deposit 2000 into the account
        ca.deposit(2000);
        
        // calling the method with Withdraw 500 from the account
        ca.withdraw(500);
    }
}
