package abstractt.factory.design.pattern.loanapproval.personal;

import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;

public class PersonalLoanCreditCheck implements CreditCheck{

	@Override
	public void checkCreditScore() {
		System.out.println("Checking credit score for Personal Loan.");
		
	}

}
