package com.microservice.transaction.model;

import java.math.BigDecimal;
import javax.annotation.Generated;

public class TransactionViewModel {
	
	private String accountNumber;
	private String accountName;
	private String valueDate;
	private String currency;
	private BigDecimal debitAmount;
	private BigDecimal creditAmount;
	private String transactionType;
	private String narrative;



	@Generated("SparkTools")
	private TransactionViewModel(Builder builder) {
		this.accountNumber = builder.accountNumber;
		this.accountName = builder.accountName;
		this.valueDate = builder.valueDate;
		this.currency = builder.currency;
		this.debitAmount = builder.debitAmount;
		this.creditAmount = builder.creditAmount;
		this.transactionType = builder.transactionType;
		this.narrative = builder.narrative;
	}
	
	
	
	public TransactionViewModel(String accountNumber, String accountName, String valueDate, String currency,
			BigDecimal debitAmount, BigDecimal creditAmount, String transactionType, String narrative) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.transactionType = transactionType;
		this.narrative = narrative;
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
	 * @return the valueDate
	 */
	public String getValueDate() {
		return valueDate;
	}
	/**
	 * @param valueDate the valueDate to set
	 */
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
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
	 * @return the debitAmount
	 */
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}
	/**
	 * @param debitAmount the debitAmount to set
	 */
	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}
	/**
	 * @return the creditAmount
	 */
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}
	/**
	 * @param creditAmount the creditAmount to set
	 */
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the narrative
	 */
	public String getNarrative() {
		return narrative;
	}
	/**
	 * @param narrative the narrative to set
	 */
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	
	@Override
	public String toString() {
		return "TransactionViewModel [accountNumber=" + accountNumber + ", accountName=" + accountName + ", valueDate="
				+ valueDate + ", currency=" + currency + ", debitAmount=" + debitAmount + ", creditAmount="
				+ creditAmount + ", transactionType=" + transactionType + ", narrative=" + narrative + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((creditAmount == null) ? 0 : creditAmount.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((debitAmount == null) ? 0 : debitAmount.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		result = prime * result + ((valueDate == null) ? 0 : valueDate.hashCode());
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
		TransactionViewModel other = (TransactionViewModel) obj;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (creditAmount == null) {
			if (other.creditAmount != null)
				return false;
		} else if (!creditAmount.equals(other.creditAmount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (debitAmount == null) {
			if (other.debitAmount != null)
				return false;
		} else if (!debitAmount.equals(other.debitAmount))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		if (valueDate == null) {
			if (other.valueDate != null)
				return false;
		} else if (!valueDate.equals(other.valueDate))
			return false;
		return true;
	}



	/**
	 * Creates builder to build {@link TransactionViewModel}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link TransactionViewModel}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String accountNumber;
		private String accountName;
		private String valueDate;
		private String currency;
		private BigDecimal debitAmount;
		private BigDecimal creditAmount;
		private String transactionType;
		private String narrative;

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

		public Builder withValueDate(String valueDate) {
			this.valueDate = valueDate;
			return this;
		}

		public Builder withCurrency(String currency) {
			this.currency = currency;
			return this;
		}

		public Builder withDebitAmount(BigDecimal debitAmount) {
			this.debitAmount = debitAmount;
			return this;
		}

		public Builder withCreditAmount(BigDecimal creditAmount) {
			this.creditAmount = creditAmount;
			return this;
		}

		public Builder withTransactionType(String transactionType) {
			this.transactionType = transactionType;
			return this;
		}

		public Builder withNarrative(String narrative) {
			this.narrative = narrative;
			return this;
		}

		public TransactionViewModel build() {
			return new TransactionViewModel(this);
		}
	}
	
	
	

}
