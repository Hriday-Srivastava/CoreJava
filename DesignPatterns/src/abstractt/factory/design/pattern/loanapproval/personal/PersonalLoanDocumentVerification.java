package abstractt.factory.design.pattern.loanapproval.personal;

import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;

public class PersonalLoanDocumentVerification implements DocumentVerification {

	@Override
	public void verifyDocuments() {
		System.out.println("Verifying documents for Personal Loan.");
		
	}

}
