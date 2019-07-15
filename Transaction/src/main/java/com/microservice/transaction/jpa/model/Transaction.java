/**
 * 
 */
package com.microservice.transaction.jpa.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author amitmishra
 * 
 * Transaction Entity bean
 */

@Entity
@Table(name = "Transaction")
public class Transaction {
	
	
	
	public Transaction() {
		super();
	}



	public Transaction(String acctNum, String acctName, Date valueDate, String currency, BigDecimal amount,
			String narrative) {
		super();
		this.acctNum = acctNum;
		this.acctName = acctName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.amount = amount;
		this.narrative = narrative;
	}



	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name = "")
	private int id;
	
	@Column(name = "acct_number")
	private String acctNum;

	
	@Column(name = "acct_name" )
	private String acctName;

	
	@Column(name = "value_date")
	private Date valueDate;

	
	
	private String currency;

	
	
	private BigDecimal amount;

	
	
	private String narrative;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAcctNum() {
		return acctNum;
	}



	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}



	public String getAcctName() {
		return acctName;
	}



	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}



	public Date getValueDate() {
		return valueDate;
	}



	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String curr) {
		this.currency = curr;
	}



	public BigDecimal getAmount() {
		return amount;
	}



	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}



	public String getNarrative() {
		return narrative;
	}



	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acctName == null) ? 0 : acctName.hashCode());
		result = prime * result + ((acctNum == null) ? 0 : acctNum.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + id;
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
		Transaction other = (Transaction) obj;
		if (acctName == null) {
			if (other.acctName != null)
				return false;
		} else if (!acctName.equals(other.acctName))
			return false;
		if (acctNum == null) {
			if (other.acctNum != null)
				return false;
		} else if (!acctNum.equals(other.acctNum))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (id != other.id)
			return false;
		if (valueDate == null) {
			if (other.valueDate != null)
				return false;
		} else if (!valueDate.equals(other.valueDate))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Transaction [id=" + id + ", acctNum=" + acctNum + ", acctName=" + acctName + ", valueDate=" + valueDate
				+ ", currency=" + currency + ", amount=" + amount + ", narrative=" + narrative + "]";
	}
	

}
