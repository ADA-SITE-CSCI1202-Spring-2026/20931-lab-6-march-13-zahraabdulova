// Account Class (Part 3) - Withdraw Method with Validation
public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor (same as previous parts)
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method (same as Part 2)
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Insufficient funds: Withdrawal amount exceeds balance.");
        }
        this.balance -= amount;
    }

    // Getter methods (optional for this variant)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}

// Custom Exception for Invalid Amount
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}
