/*There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, 
the type of arguments are same and from client side its hard to maintain the order of the arguments.

Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional 
parameters need to send as NULL.

If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.

*/
package builder.design.pattern;

public class Computer 
{
	//required attributes
	private String ram;
	private String processor;
	
	//optional attributes
	private String hd;
	private boolean isBluetooth;
	private boolean iswifi;
	private Computer(ComputerBuilder builder) 
	{
		super();
		this.ram = builder.ram;
		this.processor = builder.processor;
		this.hd = builder.hd;
		this.isBluetooth = builder.isBluetooth;
		this.iswifi = builder.iswifi;
	}
	public String getRam() {
		return ram;
	}
	public String getProcessor() {
		return processor;
	}
	public String getHd() {
		return hd;
	}
	public boolean isBluetooth() {
		return isBluetooth;
	}
	public boolean isIswifi() {
		return iswifi;
	}
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", processor=" + processor + ", hd=" + hd + ", isBluetooth=" + isBluetooth
				+ ", iswifi=" + iswifi + "]";
	}
	//Builder Class
	public  static class ComputerBuilder
	{
		//required attributes
		private String ram;
		private String processor;
		
		//optional attributes
		private String hd;
		private boolean isBluetooth;
		private boolean iswifi;
		public ComputerBuilder(String ram, String processor) {
			super();
			this.ram = ram;
			this.processor = processor;
		}
		
		public ComputerBuilder setRam(String ram) {
			this.ram = ram; return this;
		}
		public ComputerBuilder setProcessor(String processor) {
			this.processor = processor;return this;
		}
		public ComputerBuilder setHd(String hd) {
			this.hd = hd; return this;
		}
		public ComputerBuilder setBluetooth(boolean isBluetooth) {
			this.isBluetooth = isBluetooth;  return this;
		}
		public ComputerBuilder setIswifi(boolean iswifi) {
			this.iswifi = iswifi;	return this;
		}
		
		public Computer build()
		{
			return new Computer(this);
		}
		
		
		
		
	}
}
