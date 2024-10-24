package abstractt.factory.design.pattern.loanapproval.home;

import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public class HomeLoanDisbursement implements LoanDisbursement {

	@Override
	public void disburseLoan() {
		System.out.println("Disbursing Home Loan.");
		
	}

}
