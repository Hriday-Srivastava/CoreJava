package abstractt.factory.design.pattern.loanapproval.loanfactory;

import abstractt.factory.design.pattern.loanapproval.personal.PersonalLoanCreditCheck;
import abstractt.factory.design.pattern.loanapproval.personal.PersonalLoanDisbursement;
import abstractt.factory.design.pattern.loanapproval.personal.PersonalLoanDocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;
import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public class PersonalLoanFactory implements LoanFactory{

	@Override
	public DocumentVerification createDocumentVerification() {
		return new PersonalLoanDocumentVerification();
	}

	@Override
	public CreditCheck createCreditCheck() {
		return new PersonalLoanCreditCheck();
	}

	@Override
	public LoanDisbursement createLoanDisbursement() {
		return new PersonalLoanDisbursement();
	}

}
