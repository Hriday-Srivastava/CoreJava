package abstractt.factory.design.pattern.loanapproval.loanfactory;

import abstractt.factory.design.pattern.loanapproval.process.CreditCheck;
import abstractt.factory.design.pattern.loanapproval.process.DocumentVerification;
import abstractt.factory.design.pattern.loanapproval.process.LoanDisbursement;

public interface LoanFactory {

	DocumentVerification createDocumentVerification();
    CreditCheck createCreditCheck();
    LoanDisbursement createLoanDisbursement();
}
