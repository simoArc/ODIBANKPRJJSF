/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import ch.hearc.ig.odi.customeraccount.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Simone Bissolotti
 */

@Named
@RequestScoped
public class CustomerCreateBean {
    private int number;
    private String firstName;
    private String lastName;
    
    @Inject
    Services services;
    public CustomerCreateBean() {
    }
    
    public void setNewCustomer(){
        services.saveCustomer(this.number, this.firstName, this.lastName);
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
