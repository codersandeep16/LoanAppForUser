package com.LoanAppForUser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LoanAppForUser.model.Loan;
import com.LoanAppForUser.repository.LoanRepository;

@Service
@Transactional
public class LoanServiceImpl implements LoanService{

	@Autowired
	private LoanRepository loanRepository;
	@Override
	public List<Loan> getAllLoans() {
	 return this.loanRepository.findAll();
		
	}

	@Override
	public List<Loan> getLoansByCustomerId(int customerId) {
		return this.loanRepository.searchByCustomerId(customerId);
	}
  
}
