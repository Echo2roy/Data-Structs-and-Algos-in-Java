import java.util.Scanner;

public class CreditCard {
    // Instance variables:

    private String customer; // name of customer
    private String bank;     // name of bank
    private String account; //account number or identifier
    private int limit;      // credit limit
    protected double balance; // current balance

    //Constructors

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.account = account;
        this.balance = balance;
        this.bank = bank;
        this.limit = limit;
    }

    // Initialises 1st 4 instances and balance could be given later
    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0);
    }

    //Accessor methods:

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    //Update methods

/*
    public void setAccount(String account) {
        this.account = account;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    */

    public boolean deposit(double price) {  //make a withdrawal
        if (price + balance > limit)
            return false;
        //charge is successful
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    //Utility method to print a card's information
    // Will be later updated to toString method

    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance= " + card.balance);
        System.out.println("Limit = " + card.limit);
    }

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("John Bowman", "California Bank", "8389 3847 9249" +
                " 29839", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].deposit(3 * val);
            wallet[1].deposit(2 * val);
            wallet[2].deposit(val);
        }

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card); // calling static method
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
}