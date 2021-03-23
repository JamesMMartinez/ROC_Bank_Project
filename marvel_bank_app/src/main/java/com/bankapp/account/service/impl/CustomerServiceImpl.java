package com.bankapp.account.service.impl;

import java.util.List;

import com.bankapp.account.dao.CustomerDAO;
import com.bankapp.account.dao.impl.CustomerDAOImpl;
import com.bankapp.account.model.Customer;
import com.bankapp.account.service.CustomerService;
import com.bankapp.exception.BankException;
import com.bankapp.exception.LoginException;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDAO custDAO = new CustomerDAOImpl();

	@Override
	public int createNewCustAcc(Customer customer) throws LoginException {
		// TODO Auto-generated method stub
		return custDAO.createNewCustAcc(customer);
	}

	@Override
	public boolean custLogin(String email, String password) throws LoginException {
		// TODO Auto-generated method stub
		return custDAO.custLogin(email, password);
	}

	@Override
	public Customer getCustomerAccByid(int accountid) throws BankException {
		// TODO Auto-generated method stub
		return custDAO.getCustomerAccByid(accountid);
	}

	@Override
	public List<Customer> listAllCustAccounts() throws BankException {
		// TODO Auto-generated method stub
		return custDAO.listAllCustAccounts();
	}

	@Override
	public int updateCustomerAccByid(int accountid, int choice, String update) throws BankException {
		// TODO Auto-generated method stub
		return custDAO.updateCustomerAccByid(accountid, choice, update);
	}

	@Override
	public int deleteCustomerAccByid(int accountid) throws BankException {
		// TODO Auto-generated method stub
		return custDAO.deleteCustomerAccByid(accountid);
	}

	@Override
	public List<Customer> listCustByLastName(String lastName) throws BankException{
		// TODO Auto-generated method stub
		return custDAO.listCustByLastName(lastName);
	}
	
}