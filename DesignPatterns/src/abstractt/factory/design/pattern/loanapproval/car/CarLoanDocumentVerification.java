package abstractt.factory.design.pattern.loanapproval.car;

import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;

public class CarLoanDocumentVerification implements DocumentVerification{

	@Override
	public void verifyDocuments() {
		 System.out.println("Verifying documents for Car Loan.");
		
	}

}
