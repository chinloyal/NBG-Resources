package models;

import enums.CardType;
import enums.TransactionType;

public class Transaction {
	private int id;
	private String sender;
	private String receiver;
	private TransactionType transactionType;
	private double amount;
	private String description;
	private CardType card_type;
	
	public Transaction() {
		id = 0;
		sender = "";
		receiver = "";
		transactionType = TransactionType.INQUIRY;
		card_type = CardType.DEBIT;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
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
	public CardType getCard_type() {
		return card_type;
	}
	public void setCard_type(CardType card_type) {
		this.card_type = card_type;
	}
	
	
}
