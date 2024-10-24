/*
This abstract class is the decorator class. It is the core of the decorator design pattern. It 
contains an attribute for the type of interface. Instance is assigned dynamically at the creation 
of decorator using its constructor. Once assigned that instance method will be invoked.
*/package decorator.dp;

public abstract class DecoratorIceCream implements IceCream 
{
		protected IceCream specialIceCream=null;

		public DecoratorIceCream(IceCream specialIceCream) 
		{
			
			this.specialIceCream = specialIceCream;
		}
		
		public String makeIceCream()
		{
			return specialIceCream.makeIceCream();
		}
		
		
		
		
}
