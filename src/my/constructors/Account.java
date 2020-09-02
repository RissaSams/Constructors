package my.constructors;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //Create a constructor
    public Account() {
        this("56789", 200000, "Marissa Sams", "rissa.sams@yahoo.com", "682.238.7469");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {

        System.out.println("Account constructor with parameters called");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposited: " + depositAmount + "\nBalance: " + balance);
    }

    public void withdrawl(double withdrawAmount) {
        if (this.balance >= withdrawAmount) {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount + "\nBalance: " + balance);
        } else {
            System.out.println("Not enough in the account. Balance: " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
