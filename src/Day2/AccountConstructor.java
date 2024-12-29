package Day2;

public class AccountConstructor {

    static class Account{
     private String accountnumber;
     private double balance;
        Account(String accountnumber){
            this.accountnumber=accountnumber;
        }
        Account(double balance){
            this.balance=balance;
        }
    }


    public static void main(String[] args) {
        Account ac1=new Account("1234567890");
        Account ac2=new Account(1897.00);
        System.out.println("AccountNumber : "+ac1.accountnumber);
        System.out.println("Balance : "+ac2.balance );
    }
}
