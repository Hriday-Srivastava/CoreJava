/*Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is 
 * almost similar to Factory Pattern except the fact that its more like factory of factories.
 * 
 * If you are familiar with factory design pattern in java, you will notice that we have a single 
 * Factory class. This factory class returns different subclasses based on the input provided and 
 * factory class uses if-else or switch statement to achieve this.

In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. 
Then an Abstract Factory class that will return the sub-class based on the input factory class. 
At first it seems confusing but once you see the implementation, its really easy to grasp and 
understand the minor difference between Factory and Abstract Factory pattern.

*/
package abstractt.factory.design.pattern;

public class AbstractFactoryTest {

	public static void main(String[] args) 
	{
		Step_1_Computer pc,sc;
		Step_5_ComputerFactory cf=new Step_5_ComputerFactory();
		Step_4_ServerComputerFactory scf=new Step_4_ServerComputerFactory("4GB", "5TB", "110.50GHz");
		sc=cf.getComputer(scf);
		
		Step_4_PersonnelComputerFactory pcf=new Step_4_PersonnelComputerFactory("4GB", "500GB", "2.50GHz");
		pc=cf.getComputer(pcf);
		
		System.out.println("This configuration of PersonnelComputer"+pc);
		System.out.println("This Configuration of ServerComputer"+sc);

	}

}
