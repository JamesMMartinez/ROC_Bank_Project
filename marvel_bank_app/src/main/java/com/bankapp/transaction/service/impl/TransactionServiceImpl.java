package com.bankapp.transaction.service.impl;

import java.util.List;

import com.bankapp.exception.BankException;
import com.bankapp.transaction.dao.TransactionDAO;
import com.bankapp.transaction.dao.impl.TransactionDAOImpl;
import com.bankapp.transaction.model.Transaction;
import com.bankapp.transaction.service.TransactionService;

public class TransactionServiceImpl implements TransactionService{
	
	private TransactionDAO transDAO = new TransactionDAOImpl();

	@Override
	public int performWithdrawal(Transaction transaction) throws BankException {
		// TODO Auto-generated method stub
		return transDAO.performWithdrawal(transaction);
	}
	
	@Override
	public int performDeposit(Transaction transaction) throws BankException {
		// TODO Auto-generated method stub
		return transDAO.performDeposit(transaction);
	}

	@Override
	public int performTransfer(Transaction transaction, int accountNumber2) throws BankException {
		// TODO Auto-generated method stub
		return transDAO.performTransfer(transaction, accountNumber2);
	}

	@Override
	public List<Transaction> listTransactionById(int id) throws BankException {
		// TODO Auto-generated method stub
		return transDAO.listTransactionById(id);
	}

	@Override
	public List<Transaction> listTransactionByAccNum(int accountNumber) throws BankException {
		// TODO Auto-generated method stub
		return transDAO.listTransactionByAccNum(accountNumber);
	}

	@Override
	public List<Transaction> listAllTransactions() throws BankException {
		// TODO Auto-generated method stub
		return transDAO.listAllTransactions();
	}


}