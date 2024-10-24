package abstractt.factory.design.pattern.loanapproval.car;

import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public class CarLoanDisbursement implements LoanDisbursement{

	@Override
	public void disburseLoan() {
		System.out.println("Disbursing Car Loan.");
		
	}

}
