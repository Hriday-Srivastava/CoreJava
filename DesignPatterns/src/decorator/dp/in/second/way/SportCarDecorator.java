package decorator.dp.in.second.way;

public class SportCarDecorator extends CarDecorator 
{

	public SportCarDecorator(Car car) 
	{
		super(car);
		
	}
	
	public void assemble()
	{
		super.assemble();
		System.out.println("Sport Car");
	}

}
