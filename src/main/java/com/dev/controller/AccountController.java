package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.entity.Account;
import com.dev.repository.AccountRepository;

@RestController
//@RequestMapping("/service1")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@PostMapping("/saveAccount")
	public Account saveAccount(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
	@GetMapping("/retrieveAccounts")
	public List<Account> getAccounts(){
		return accountRepository.findAll();
	}

}
