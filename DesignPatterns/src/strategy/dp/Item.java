package strategy.dp;

public class Item 
{
	private String upcCode;
	private float price;
	
	public Item(String upcCode, float price) 
	{
		this.upcCode = upcCode;
		this.price = price;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public float getPrice() {
		return price;
	}
	
}
