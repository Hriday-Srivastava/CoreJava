package strategy.dp;

public class CreditCard implements PaymentInterface 
{
	private String cardNo;
	private String cardHolderNm;
	private String cvvNo;
	private String dateOfExpiry;
	
	  public CreditCard(String cardNo, String cardHolderNm, String cvvNo, String dateOfExpiry) 
	  {
		
		this.cardNo = cardNo;
		this.cardHolderNm = cardHolderNm;
		this.cvvNo = cvvNo;
		this.dateOfExpiry = dateOfExpiry;
	  }

	@Override
	public void pay(float amount) 
	{
		System.out.println(amount+" has paid through CreaditCard");
		
	}
}
