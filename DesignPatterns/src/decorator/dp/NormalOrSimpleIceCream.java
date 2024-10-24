/* This class is a concrete implementation of this interface. This is the base class on which the 
 * decorators will be added.
*/
package decorator.dp;

public class NormalOrSimpleIceCream implements IceCream 
{

	@Override
	public String makeIceCream() 
	{
		
		return "Test simple ice creame";
	}

}
