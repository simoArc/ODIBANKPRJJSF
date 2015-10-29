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
		// TODO - implement Bank.Bank
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {
		// TODO - implement Bank.getAccountByNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 */
	public Customer getAccountByCustomer(int number) {
		// TODO - implement Bank.getAccountByCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param fn
	 * @param ln
	 */
	public void addCustomer(int number, String fn, String ln) {
		// TODO - implement Bank.addCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 * @param customer
	 */
	public void addAccount(String number, String name, double rate, Customer customer) {
		// TODO - implement Bank.addAccount
		throw new UnsupportedOperationException();
	}

}