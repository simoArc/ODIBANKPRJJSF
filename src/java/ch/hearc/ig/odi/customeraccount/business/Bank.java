package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Bank {

    HashMap<Integer, Customer> customers = new HashMap();
    HashSet<Account> accounts = new HashSet();
    private int number;
    private String name;

    /**
     *
     * @param number
     * @param name
     */
    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     *
     * @param number
     */
    public Account getAccountByNumber(String number) {
        for(Account ac : this.accounts){
            if(ac.getNumber().equals(number)){
                Account account = ac;
                return account;
            }
        }
        return null;
    }

    /**
     *
     * @param number
     */
    public Customer getCustomerByNumber(int number) {        
        for(Customer lisCustomers : this.customers.values()){
            if(lisCustomers.getNumber() == number){
               Customer customer = lisCustomers;
               return customer;
            }
        }
        return null;
    }
    
    public Map<Integer, Customer> getCustomers(){
        return this.customers;
    }

    /**
     *
     * @param number
     * @param fn
     * @param ln
     */
    public Customer addCustomer(int number, String fn, String ln) {
        Customer customer = new Customer(number, fn, ln);
        this.customers.put(number, customer);
        System.out.println(customers.get(number).getFirstName());
        return customer;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     * @param customer
     */
    public void addAccount(String number, String name, double rate, Customer customer) {
        Account account = new Account(number, name, rate, customer);
        //getCustomerByNumber(customer.getNumber()).setAccList(account);
        getCustomerByNumber(customer.getNumber()).addAccount(number, name, rate);
        this.accounts.add(account);
    }

}
