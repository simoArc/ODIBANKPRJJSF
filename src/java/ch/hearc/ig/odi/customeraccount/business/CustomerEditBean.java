/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import ch.hearc.ig.odi.customeraccount.service.Services;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "customerEditBean")
@RequestScoped
public class CustomerEditBean {

    private int number;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accList;
    private int numberAcount;
    private String nameAccount;
    private double balance = 0;
    private double rate = 0.001;

    @Inject
    Services services;

    public CustomerEditBean() {

    }

    public void setCustomer(Customer customer) {
        accList = new ArrayList();
        this.number = customer.getNumber();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.accList = customer.getAccList();
        int var = accList.size();
    }

    public ArrayList<Account> getAccounts() {
        return accList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccList() {
        return accList;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }

    public int getNumberAcount() {
        return numberAcount;
    }

    public void setNumberAcount(int numberAcount) {
        this.numberAcount = numberAcount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
