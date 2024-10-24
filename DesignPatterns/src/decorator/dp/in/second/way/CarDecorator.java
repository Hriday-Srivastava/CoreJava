package decorator.dp.in.second.way;

public class CarDecorator implements Car 
{
	Car car=null;
		
	public CarDecorator(Car car) 
	{
		
		this.car = car;
	}



	@Override
	public void assemble() 
	{
		car.assemble();
		
	}

}
