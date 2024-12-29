package Day2;
import java.util.HashMap;
import java.util.Scanner;

class AccountDetails {
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public AccountDetails(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }


    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

class Bank {
    private HashMap<String, AccountDetails> accounts;


    public Bank() {
        accounts = new HashMap<>();
    }


    public void openAccount(String accountNumber, String accountHolder) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account number already exists.");
        } else {
            AccountDetails newAccount = new AccountDetails(accountNumber, accountHolder);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully for " + accountHolder);
        }
    }


    public void deposit(String accountNumber, double amount) {
        AccountDetails account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }


    public void withdraw(String accountNumber, double amount) {
        AccountDetails account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        AccountDetails account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Current Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accountHolder = scanner.nextLine();
                    bank.openAccount(accountNumber, accountHolder);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    bank.checkBalance(accountNumber);
                    break;
                case 5:
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
