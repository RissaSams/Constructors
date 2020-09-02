package my.constructors;

public class AccountImpl {

    public static void main(String[] args) {

        // 1: Create a new class for an Account
        Account marissa = new Account();
        System.out.println("Account Number: " + marissa.getNumber());
        System.out.println("Account Balance: " + marissa.getBalance());
        System.out.println("Customer Name: " + marissa.getCustomerName());
        System.out.println("Customer Email: " + marissa.getCustomerEmail());
        System.out.println("Customer Phone: " + marissa.getCustomerPhone());

        marissa.withdrawl(100.0);

        marissa.deposit(50.0);
        marissa.withdrawl(100.0);

        marissa.deposit(51.0);
        marissa.withdrawl(100.0);

    }

}
