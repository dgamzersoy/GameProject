package gameProject;

public class Campaign implements Entity {
	 private int id;
	 private String name;
	 private double discountAmount;
	 private double remaining;
	 private int price;
	
	
	public Campaign() {}
	
	public Campaign(int id, String name, double discountAmount, double reamining, int price
			,double remaining) {
		super();
		this.id = id;
		this.name = name;
		this.discountAmount = discountAmount;
		this.price=price;
		this.remaining=reamining;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
		
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public double getRemaining() {
		return remaining = price - discountAmount;
	}
	

	
}
