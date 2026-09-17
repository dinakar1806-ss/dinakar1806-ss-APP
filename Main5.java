class Account {
    int accountNumber;
    String holderName;
    double balance;

    Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs." + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void displayDetails() {
        System.out.println("Savings Account");
        super.displayDetails();
    }
}

class CurrentAccount extends Account {

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void displayDetails() {
        System.out.println("Current Account");
        super.displayDetails();
    }
}


// Payment Interface
interface Payment {
    void pay(double amount);
}


// SecurePayment extends Payment
interface SecurePayment extends Payment {
    void verifyPayment();
}


// UPI Payment
class UPIPayment implements SecurePayment {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }

    public void verifyPayment() {
        System.out.println("UPI payment verified.");
    }
}


// Card Payment
class CardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card.");
    }
}


// Tagging Interface
interface OnlineTransaction {
}


// Online UPI Transaction
class OnlineUPIPayment implements Payment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Online UPI.");
    }
}


// Online Card Transaction
class OnlineCardPayment implements Payment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Online Card.");
    }
}


// Main Class
public class Main5 {

    public static void main(String[] args) {

        // Runtime Polymorphism for Accounts
        Account account;

        account = new SavingsAccount(101, "Dinakar", 25000);
        account.displayDetails();

        System.out.println();

        account = new CurrentAccount(102, "Rahul", 50000);
        account.displayDetails();

        System.out.println();

        // Runtime Polymorphism for Payment
        Payment payment;

        payment = new UPIPayment();
        payment.pay(1500);

        System.out.println();

        payment = new CardPayment();
        payment.pay(3000);

        System.out.println();

        // Secure Payment
        UPIPayment upi = new UPIPayment();
        upi.verifyPayment();
        upi.pay(5000);

        System.out.println();

        // Online Transaction checking
        OnlineUPIPayment onlineUPI = new OnlineUPIPayment();

        if (onlineUPI instanceof OnlineTransaction) {
            System.out.println("This is an online transaction.");
        }

        onlineUPI.pay(2000);
    }
}