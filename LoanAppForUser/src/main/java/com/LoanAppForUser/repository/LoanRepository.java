package com.LoanAppForUser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanAppForUser.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>{
 List<Loan> searchByCustomerId(int customerId);
}
