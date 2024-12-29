package Day2;

import java.util.Scanner;

public class BankAccount {

    private  String accountNumber;
    private double balance;
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber( String accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance( double balance){
        this.balance=balance;
    }
    public  void Deposite(double amount){
   balance+=amount;
        System.out.println("Amount deposite Sucessfully:");
    }
    public void withdraw(double amount){
    if(balance>amount){
        balance-=amount;
        System.out.println("Amout Withdraw Successfully:");
    }
    else {
        System.out.println("Insufficent Balance");
    }
    }
    public void balance(){
        System.out.println("Balance Amount:"+balance);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber(s.nextLine());
        bankAccount.setBalance(s.nextDouble());
        double depositeamount=s.nextDouble();
        bankAccount.Deposite(depositeamount);
        bankAccount.balance();
        double withdrawamount=s.nextDouble();
        bankAccount.withdraw(withdrawamount);
        bankAccount.balance();
    }
}
