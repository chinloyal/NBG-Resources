package models;

import java.io.Serializable;

import enums.CardType;
import enums.TransactionType;

public class ChartVals implements Serializable {
	private String transactionType;
	private double total;
	private String cardType;
	
	
	
	public ChartVals() {
		this(null, 0, null);
	}

	public ChartVals(String transactionType, double total, String cardType) {
		super();
		this.transactionType = transactionType;
		this.total = total;
		this.cardType = cardType;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
	
	
}
