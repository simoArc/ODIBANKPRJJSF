/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */
@Named(value = "customerEditBean")
@SessionScoped
public class CustomerEditBean implements Serializable {

    @Inject
    Services services;
    private Customer customer;

    public CustomerEditBean() {

    }

    public String showCustomer(Customer customer) {
        this.customer = customer;
        return "displayCustomer";
    }

public List<Account> getAccounts(){
        if(customer == null){
            return new ArrayList();
        }
        
        return new ArrayList(customer.getAccList());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer cust) {
        this.customer = cust;
    }

}
