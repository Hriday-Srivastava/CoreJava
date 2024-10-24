package abstractt.factory.design.pattern;

public class Step_2_PersonalComputer extends Step_1_Computer 
{
	private String ram;
	private String hd;
	private String processor;
	
	public Step_2_PersonalComputer(String ram, String hd, String processor) {
		super();
		this.ram = ram;
		this.hd = hd;
		this.processor = processor;
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
		return "PersonalComputer [ram=" + ram + ", hd=" + hd + ", processor=" + processor + "]";
	}
	
	
}
