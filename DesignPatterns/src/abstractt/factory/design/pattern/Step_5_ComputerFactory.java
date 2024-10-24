package abstractt.factory.design.pattern;

public class Step_5_ComputerFactory 
{

	public static Step_1_Computer getComputer(Step_3_AbstractComputerFactory factory)
	{
		return factory.createFactory();
	}
}
