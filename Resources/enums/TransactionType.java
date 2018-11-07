package enums;

public enum TransactionType {
	TRANSFER(1), INQUIRY(2), DEPOSIT(3), BILL(4);
	
	private final int id;
	TransactionType(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	
}
