package decorator.dp.in.second.way;

public class LuxaryCarDecorator extends CarDecorator 
{

	public LuxaryCarDecorator(Car car) 
	{
		super(car);
		
	}
	
	public void assemble()
	{
		super.assemble();
		System.out.println("Luxary Car");
	}

}
