class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited " + amount + " units. New balance: " + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance -= amount;
                System.out.println("Withdrawn " + amount + " units. New balance: " + accountBalance);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("11300246");
        account.setCustomerName("Zyguel Philip E. Cabogoy");
        account.setEmail("11300246@usc.edu.ph");
        account.setPhoneNumber("123-699-9990");
        account.setAccountBalance(1000.0);

        System.out.println("Initial balance: " + account.getAccountBalance());

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0); // This should show insufficient funds

        System.out.println("Final balance: " + account.getAccountBalance());
    }
}
