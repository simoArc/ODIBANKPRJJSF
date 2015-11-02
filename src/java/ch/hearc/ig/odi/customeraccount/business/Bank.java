package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Bank {

    HashSet<Customer> customers;
    HashSet<Account> accounts;
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
        for(Customer lisCustomers : this.customers){
            if(lisCustomers.getNumber() == number){
               Customer customer = lisCustomers;
               return customer;
            }
        }
        return null;
    }

    /**
     *
     * @param number
     * @param fn
     * @param ln
     */
    public void addCustomer(int number, String fn, String ln) {
        Customer customer = new Customer(number, fn, ln);
        this.customers.add(customer);
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
        this.accounts.add(account);
    }

}
