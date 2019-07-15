package com.microservice.account.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class AccountViewModel {

	private String accountNumber;
	private String accountName;
	private String accountType;
	private String balanceDate;
	private String currency;
	private BigDecimal balance;

	@Generated("SparkTools")
	private AccountViewModel(Builder builder) {
		this.accountNumber = builder.accountNumber;
		this.accountName = builder.accountName;
		this.accountType = builder.accountType;
		this.balanceDate = builder.balanceDate;
		this.currency = builder.currency;
		this.balance = builder.balance;
	}

	public AccountViewModel(String accountNumber, String accountName, String accountType, String balanceDate,
			String currency, BigDecimal balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
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
		AccountViewModel other = (AccountViewModel) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the balanceDate
	 */
	public String getBalanceDate() {
		return balanceDate;
	}

	/**
	 * @param balanceDate the balanceDate to set
	 */
	public void setBalanceDate(String balanceDate) {
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
	 * Creates builder to build {@link AccountViewModel}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link AccountViewModel}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String accountNumber;
		private String accountName;
		private String accountType;
		private String balanceDate;
		private String currency;
		private BigDecimal balance;

		private Builder() {
		}

		public Builder withAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public Builder withAccountName(String accountName) {
			this.accountName = accountName;
			return this;
		}

		public Builder withAccountType(String accountType) {
			this.accountType = accountType;
			return this;
		}

		public Builder withBalanceDate(String balanceDate) {
			this.balanceDate = balanceDate;
			return this;
		}

		public Builder withCurrency(String currency) {
			this.currency = currency;
			return this;
		}

		public Builder withBalance(BigDecimal balance) {
			this.balance = balance;
			return this;
		}

		public AccountViewModel build() {
			return new AccountViewModel(this);
		}
	}

}