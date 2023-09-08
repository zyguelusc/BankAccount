import java.util.Scanner;

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

    public boolean deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            return true;
        }
        return false;
    }
        
    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance -= amount;
                return true;
            } 
            return false;   
        }
}
/*
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("11300246");
        account.setCustomerName("Zygue Philip E. Cabogoy");
        account.setEmail("11300246@usc.edu.ph");
        account.setPhoneNumber("09143143143");
        account.setAccountBalance(1000.0);

        System.out.println("Initial balance: " + account.getAccountBalance());

     
        System.out.println("Deposit Status  : " + account.deposit(500.0));
   
        System.out.println("Withdraw Status  : " + account.withdraw(200.0));

        System.out.println("Withdraw Status  : " + account.withdraw(1500.0));
    
        System.out.println("Final balance: " + account.getAccountBalance());
    }
}*/
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BankAccount account = new BankAccount();

        System.out.print("Enter account number: ");
        account.setAccountNumber(scanner.nextLine());

        System.out.print("Enter customer name: ");
        account.setCustomerName(scanner.nextLine());

        System.out.print("Enter email: ");
        account.setEmail(scanner.nextLine());

        System.out.print("Enter phone number: ");
        account.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter initial account balance: ");
        double initialBalance = scanner.nextDouble();
        account.setAccountBalance(initialBalance);

        System.out.println("Initial balance: " + account.getAccountBalance());
        
        while (true) {
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        boolean depositStatus = account.deposit(depositAmount);
        if (!depositStatus) {
                System.out.println("Withdraw Status: Invalid");
            } else {
                System.out.println("Withdraw Status: true");
                break;
            }
       }
        
       while (true) {
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            boolean withdrawalStatus = account.withdraw(withdrawalAmount);
            
            if (!withdrawalStatus) {
                System.out.println("Withdraw Status: Invalid");
            } else {
                System.out.println("Withdraw Status: true");
                break;
            }
        }

        System.out.println("Final balance: " + account.getAccountBalance());

        scanner.close();
    }
}

