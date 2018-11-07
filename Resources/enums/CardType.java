package enums;

public enum CardType {
	CREDIT(1), DEBIT(2);
	
	private final int id;
	
	CardType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
