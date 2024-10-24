package decorator.dp.in.second.way;

public class DecoratorCarTest {

	public static void main(String[] args) 
	{
		LuxaryCarDecorator luxary=new LuxaryCarDecorator(new SportCarDecorator(new SimpleCar()));
		luxary.assemble();

	}

}
