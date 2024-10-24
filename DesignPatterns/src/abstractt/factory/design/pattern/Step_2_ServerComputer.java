package abstractt.factory.design.pattern;

public class Step_2_ServerComputer extends Step_1_Computer
{
	private String ram;
	private String hd;
	private String processor;
	
	public Step_2_ServerComputer(String ram, String hd, String processor) {
		super();
		this.ram = ram;
		this.hd = hd;
		this.processor = processor;
		System.out.println("You have got ServerComputer");
	}

	public String getRam() {
		return ram;
	}

	public String getHd() {
		return hd;
	}

	public String getProcessor() {
		return processor;
	}

	@Override
	public String toString() {
		return "ServerComputer [ram=" + ram + ", hd=" + hd + ", processor=" + processor + "]";
	}
	
	
	
	
}
