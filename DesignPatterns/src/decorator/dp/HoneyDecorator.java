package decorator.dp;

public class HoneyDecorator extends DecoratorIceCream 
{

	public HoneyDecorator(IceCream specialIceCream) 
	{
		super(specialIceCream);
		
	}
	
	public String makeIceCream()
	{
		return specialIceCream.makeIceCream()+addHoney();
	}
	
	private String addHoney()
	{
		return " Flavour with honey";
	}

}
