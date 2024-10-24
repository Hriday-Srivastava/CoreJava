/*To extend or modify the behaviour of ‘an instance’ at runtime decorator design pattern is used. 
 * Inheritance is used to extend the abilities of ‘a class’. Unlike inheritance, you can choose 
 * any single object of a class and modify its behaviour leaving the other instances unmodified.

 In implementing the decorator pattern you construct a wrapper around an object by extending its 
 behavior. The wrapper will do its job before or after and delegate the call to the wrapped instance.
 
 Decorator Design Pattern in java API

	java.io.BufferedReader;
	java.io.FileReader;
	java.io.Reader;

Decorator design pattern is used to modify the functionality of an object at runtime. At the same 
time other instances of the same class will not be affected by this, so individual object gets the 
modified behavior. Decorator design pattern is one of the structural design pattern 
(such as Adapter Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes or 
interface with composition to implement.
 
*/
package decorator.dp;

public class DecoratorDpTest {

	public static void main(String[] args) 
	{
		IceCream iceCream=new HoneyDecorator(new NormalOrSimpleIceCream());
		
		System.out.println(iceCream.makeIceCream());

	}

}
