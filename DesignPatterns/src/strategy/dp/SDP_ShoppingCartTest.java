/*
   1.favor composition over inheritance.
   2. design interfaces do not create concrete classes
   3.open for extension and closed for modification.
   
   Strategy design pattern is one of the behavioral design pattern. 
   We could have used composition to create instance variable for strategies but we should avoid that 
   as we want the specific strategy to be applied for a particular task. Same is followed in 
   Collections.sort() and Arrays.sort() method that take comparator as argument.
   
   Strategy pattern is useful when we have multiple algorithms for specific task and we want our 
   application to be flexible to chose any of the algorithm at runtime for specific task.
   
*/
package strategy.dp;

public class SDP_ShoppingCartTest {

	public static void main(String[] args) 
	{
		ShoppingCart cart=new ShoppingCart();
		
		Item i1=new Item("45612", 8888.95f);
		cart.addItem(i1);
		Item i2=new Item("845612", 1000000.26f);
		cart.addItem(i2);
		
		//Payment through CreditCard
		cart.pay(new CreditCard("45897564213", "Hriday Kumar", "789456321456987", "3-6-2041"));
		
		//Payment through Paytm
		cart.pay(new Paytm("amirkhan@gamil.com", "amir"));
		
	}

}
