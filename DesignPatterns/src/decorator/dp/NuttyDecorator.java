package decorator.dp;

public class NuttyDecorator extends DecoratorIceCream
{
	
	public NuttyDecorator(IceCream specialIceCream) 
	{
		super(specialIceCream);
		
	}
	
	public String makeIceCream()
	{
		return specialIceCream.makeIceCream()+addNuts();
	}
	 
	private String addNuts()
	{
		return " Flavour with cruncy nuts ";
	}

}
