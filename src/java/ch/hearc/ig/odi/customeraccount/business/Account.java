package ch.hearc.ig.odi.customeraccount.business;

public class Account {

    Customer customer;
    private String number;
    private String name;
    private double balance;
    private double rate;

    /**
     *
     * @param number
     * @param name
     * @param rate
     * @param customer
     */
    public Account(String number, String name, double rate, Customer customer) {
        this.customer = customer;
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.balance = 0;
        this.customer = customer;
    }

    /**
     *
     * @param amount
     */
    public void credit(double amount) {
        this.balance += amount;
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param amount
     */
    public void debit(double amount) {
        if (balance > 0 && balance - amount > 0) {
            this.balance -= amount;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /**
     *
     * @param amount
     * @param source
     * @param target
     */
    public static void transfer(double amount, Account source, Account target) {
        source.debit(amount);
        target.credit(amount);        
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
