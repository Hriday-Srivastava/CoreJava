package strategy.dp;

public class Paytm implements PaymentInterface 
{
	private String emailId;
	private String pwd;
	
	Paytm(String emailId, String pwd) 
	{
		
		this.emailId = emailId;
		this.pwd = pwd;
	}

	@Override
	public void pay(float amount) 
	{
		System.out.println(amount+" Your transaction has benn successfully using Paytm");
		
	}
	
}
