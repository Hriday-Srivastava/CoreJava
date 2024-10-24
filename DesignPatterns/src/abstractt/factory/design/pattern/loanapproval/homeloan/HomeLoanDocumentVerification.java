package abstractt.factory.design.pattern.loanapproval.homeloan;

import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;

public class HomeLoanDocumentVerification implements DocumentVerification{

	@Override
	public void verifyDocuments() {
		System.out.println("Verifying documents for Home Loan.");
		
	}

}
