package abstractt.factory.design.pattern.loanapproval.car;

import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;

public class CarLoanCreditCheck implements CreditCheck{

	@Override
	public void checkCreditScore() {
		System.out.println("Checking credit score for Car Loan.");
		
	}

}
