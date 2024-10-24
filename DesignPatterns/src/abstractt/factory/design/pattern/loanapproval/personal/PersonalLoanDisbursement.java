package abstractt.factory.design.pattern.loanapproval.personal;

import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public class PersonalLoanDisbursement implements LoanDisbursement {

	@Override
	public void disburseLoan() {
		 System.out.println("Disbursing Personal Loan.");
	}

}
