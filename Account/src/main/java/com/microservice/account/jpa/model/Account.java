/**
 * 
 */
package com.microservice.account.jpa.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author amitmishra
 * 
 *         Account Entity bean
 */

@Entity
@Table(name = "Account")
public class Account {

	public Account() {
		super();
	}

	@Id
	@Column(name = "acct_number")
	private String acctNum;

	@Column(name = "acct_name")
	private String acctName;

	@Column(name = "acct_type")
	private String acctType;

	@Column(name = "balance_date")
	private Date balanceDate;

	private String currency;

	private BigDecimal balance;
	
	@Column(name = "user_id")
	private long userId;
	
	

	public Account(String acctNum, String acctName, String acctType, Date balanceDate, String currency,
			BigDecimal balance, long userId) {
		super();
		this.acctNum = acctNum;
		this.acctName = acctName;
		this.acctType = acctType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.balance = balance;
		this.userId = userId;
	}

	/**
	 * @return the acctNum
	 */
	public String getAcctNum() {
		return acctNum;
	}

	/**
	 * @param acctNum the acctNum to set
	 */
	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	/**
	 * @return the acctName
	 */
	public String getAcctName() {
		return acctName;
	}

	/**
	 * @param acctName the acctName to set
	 */
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	/**
	 * @return the acctType
	 */
	public String getAcctType() {
		return acctType;
	}

	/**
	 * @param acctType the acctType to set
	 */
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	/**
	 * @return the balanceDate
	 */
	public Date getBalanceDate() {
		return balanceDate;
	}

	/**
	 * @param balanceDate the balanceDate to set
	 */
	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Account [acctNum=" + acctNum + ", acctName=" + acctName + ", acctType=" + acctType + ", balanceDate="
				+ balanceDate + ", currency=" + currency + ", balance=" + balance + ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acctNum == null) ? 0 : acctNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (acctNum == null) {
			if (other.acctNum != null)
				return false;
		} else if (!acctNum.equals(other.acctNum))
			return false;
		return true;
	}

	
	
	
	

}
