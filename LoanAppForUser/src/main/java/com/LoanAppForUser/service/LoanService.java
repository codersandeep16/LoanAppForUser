package com.LoanAppForUser.service;

import java.util.List;

import com.LoanAppForUser.model.Loan;

public interface LoanService { 
	List<Loan> getAllLoans();
	List<Loan> getLoansByCustomerId(int customerId);
	
}
