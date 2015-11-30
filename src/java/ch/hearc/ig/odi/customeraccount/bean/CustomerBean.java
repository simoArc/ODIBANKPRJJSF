/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.business.Tools;
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

   
    @Inject
    Services services;

    public CustomerBean() {
    }

    public List<Customer> getCustomers() {
        return services.getCustomersList();
    }

    public String editCustomer(Integer number) {
        CustomerEditBean customerEdit = Tools.FindBean("customerEditBean", CustomerEditBean.class);
        customerEdit.setCustomer(services.getCustomer(number));
        return "success";
    }

    
}
