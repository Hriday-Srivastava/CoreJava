package abstractt.factory.design.pattern.loanapproval;

import abstractt.factory.design.pattern.loanapproval.loanfactory.LoanFactory;
import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;
import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public class LoanApprovalSystem {
	private DocumentVerification documentVerification;
    private CreditCheck creditCheck;
    private LoanDisbursement loanDisbursement;
    
    public LoanApprovalSystem(LoanFactory loanFactory) {
        this.documentVerification = loanFactory.createDocumentVerification();
        this.creditCheck = loanFactory.createCreditCheck();
        this.loanDisbursement = loanFactory.createLoanDisbursement();
    }
    
    public void processLoan() {
        documentVerification.verifyDocuments();
        creditCheck.checkCreditScore();
        loanDisbursement.disburseLoan();
    }
}
