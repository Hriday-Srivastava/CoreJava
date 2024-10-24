package abstractt.factory.design.pattern.loanapproval.loanfactory;

import abstractt.factory.design.pattern.loanapproval.car.CarLoanCreditCheck;
import abstractt.factory.design.pattern.loanapproval.car.CarLoanDisbursement;
import abstractt.factory.design.pattern.loanapproval.car.CarLoanDocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;
import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public class CarLoanFactory implements LoanFactory{

	@Override
	public DocumentVerification createDocumentVerification() {
		return new CarLoanDocumentVerification();
	}

	@Override
	public CreditCheck createCreditCheck() {
		return new CarLoanCreditCheck();
	}

	@Override
	public LoanDisbursement createLoanDisbursement() {
		return new CarLoanDisbursement();
	}

}
