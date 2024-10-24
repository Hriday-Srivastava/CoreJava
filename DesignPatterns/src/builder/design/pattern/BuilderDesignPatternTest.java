package builder.design.pattern;

import builder.design.pattern.Computer.ComputerBuilder;

public class BuilderDesignPatternTest 
{

	public static void main(String[] args) 
	{
		ComputerBuilder compBuilder=new ComputerBuilder("8GB","8.50GHz");
		
		compBuilder.setBluetooth(true);	compBuilder.setIswifi(true);	
		compBuilder.setHd("6TB");
		
		Computer comp=compBuilder.build();
		System.out.println(comp);
		

	}

}
