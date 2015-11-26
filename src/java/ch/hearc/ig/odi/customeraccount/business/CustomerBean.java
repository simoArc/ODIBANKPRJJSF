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
@Named
@RequestScoped
public class CustomerBean {

    private int number;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accList;

    @Inject
    Services services;

    public CustomerBean() {
    }

    public List<Customer> getCustomers() {
        return services.getCustomersList();
    }

    public Customer getCustomerById(Integer numberCustomer) {
        return services.getCustomer(numberCustomer);
    }

    public String editCustomer(Integer number) {
        CustomerEditBean customerEdit = Tools.FindBean("customerEditBean", CustomerEditBean.class);
        customerEdit.setCustomer(services.getCustomer(number));
        return "success";
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

    public ArrayList<Account> getAccList() {
        return accList;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }
    

}
