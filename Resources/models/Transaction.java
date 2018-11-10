package models;

import java.io.Serializable;
import java.util.Date;

import enums.CardType;
import enums.TransactionType;

public class Transaction implements Serializable {
	private int id;
	private int sender;
	private String receiver;
	private TransactionType transactionType;
	private double amount;
	private String description;
	private CardType cardType;
	private Date date;
	
	public Transaction() {
		id = 0;
		sender = 0;
		receiver = "";
		transactionType = TransactionType.INQUIRY;
		cardType = CardType.DEBIT;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
