package abstractt.factory.design.pattern;

public class Step_4_PersonnelComputerFactory implements Step_3_AbstractComputerFactory
{
	private String ram;
	private String hd;
	private String processor;
	
	

	public Step_4_PersonnelComputerFactory(String ram, String hd, String processor) {
		super();
		this.ram = ram;
		this.hd = hd;
		this.processor = processor;
		System.out.println("You have got Personnel computer");
	}



	@Override
	public Step_1_Computer createFactory() 
	{
		
		return new Step_2_PersonalComputer(ram, hd, processor);
	}

}
