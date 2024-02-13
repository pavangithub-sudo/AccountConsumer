package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
