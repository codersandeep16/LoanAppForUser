package com.LoanAppForUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LoanAppForUser.model.Loan;
import com.LoanAppForUser.service.LoanService;

@RestController
public class LoanController {
  @Autowired
  private LoanService loanService;
  @GetMapping("loans")
  public ResponseEntity<List<Loan>> getAllProduct(){
	  return ResponseEntity.ok().body(loanService.getAllLoans());
  }
}
