/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */
@Named
@RequestScoped
public class CustomerBean{

    private int number;
    private String firstName;
    private String lastName;
    private List<Account> accList;

    @Inject
    Services services;

    //constructeur vide ou plein?
    public CustomerBean(int number, String firstName, String lastName, List<Account> accList, Services services) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accList = accList;
        this.services = services;
    } 


    public List<Customer> getCustomers() {
        return services.getCustomersList();
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

}
