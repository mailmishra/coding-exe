/**
 * 
 */
package com.microservice.account.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.account.jpa.model.Account;

/**
 * @author amitmishra
 * Account Repo
 */	

public interface AccountRepository extends JpaRepository<Account, Long> {

	List<Account> findAccountByUserId(long userId);
}
