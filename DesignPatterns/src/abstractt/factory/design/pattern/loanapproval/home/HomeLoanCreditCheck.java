package abstractt.factory.design.pattern.loanapproval.home;

import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;

public class HomeLoanCreditCheck implements CreditCheck{

	@Override
	public void checkCreditScore() {
		System.out.println("Checking credit score for Home Loan.");
		
	}

}
