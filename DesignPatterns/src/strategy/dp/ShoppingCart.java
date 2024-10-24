package strategy.dp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart 
{
	List<Item> items;

	public ShoppingCart()
	{
		 this.items=new ArrayList<Item>(); 
	}
	
	public void addItem(Item item)
	{
		this.items.add(item);
	}
	
	public void removeItem(Item item)
	{
		this.items.remove(item);
	}
	
	public float getTotalPrice(List<Item> items )
	{	
		float total=0;
		for(Item item:items)
		{
			total=total+item.getPrice();
		}
		return total ;
		
	}
	
	public void pay(PaymentInterface paymentMethod)
	{
		float amount=getTotalPrice(items);
		paymentMethod.pay(amount);
	}
	
	
}
