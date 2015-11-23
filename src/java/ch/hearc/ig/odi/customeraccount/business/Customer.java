package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int number;
    private String firstName;
    private String lastName;
    private List<Account> accList;

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */

    public Customer(Integer number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accList = new ArrayList();
    }

    public Customer() {
    }

    public int getNumber() {
        return number;
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

    public void setAccList(List<Account> accList) {
        this.accList = accList;
    }

    /**
     *
     * @param number
     * @return 
     */
    public Account getAccountByNumber(String number) {
        Account account = new Account(null, null, 0, null);
        for(Account ac : accList){
            if(ac.getNumber().equals(number)){
                account = ac;
            }
        }
        return account;
        //return accList. get(Integer.parseInt(number));
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     */
    public void addAccount(String number, String name, double rate) {
        Account account = new Account(number, name, rate, this);
        accList.add(account);
    }



}
