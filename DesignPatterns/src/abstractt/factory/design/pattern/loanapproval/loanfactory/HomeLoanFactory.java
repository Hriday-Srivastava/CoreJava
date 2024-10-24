package abstractt.factory.design.pattern.loanapproval.loanfactory;

import abstractt.factory.design.pattern.loanapproval.home.HomeLoanCreditCheck;
import abstractt.factory.design.pattern.loanapproval.home.HomeLoanDisbursement;
import abstractt.factory.design.pattern.loanapproval.home.HomeLoanDocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;
import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public class HomeLoanFactory implements LoanFactory{

	@Override
	public DocumentVerification createDocumentVerification() {
		
		return new HomeLoanDocumentVerification();
	}

	@Override
	public CreditCheck createCreditCheck() {
		return new HomeLoanCreditCheck();
	}

	@Override
	public LoanDisbursement createLoanDisbursement() {
		return new HomeLoanDisbursement();
	}

}
