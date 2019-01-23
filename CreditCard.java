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

    public CreditCard(String customer, String bank, String account, int limit){
        this(customer, bank, account, limit, 0.0);
    }

    //Accessor methods:

    public String getCustomer() {return customer;}
    public String getBank(){return bank;}
    public String getAccount(){return account;}
    public int getLimit() {return limit;}
    public double getBalance(){return balance;}

    //Update methods
    public boolean deposit(double price){  //make a withdrawal
        if (price + balance > limit)
            return false;
        //charge is successful
        balance +=price;
        return true;
    }


}
