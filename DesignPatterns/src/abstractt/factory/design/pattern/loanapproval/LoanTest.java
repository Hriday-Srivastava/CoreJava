package abstractt.factory.design.pattern.loanapproval;

import abstractt.factory.design.pattern.loanapproval.loanfactory.CarLoanFactory;
import abstractt.factory.design.pattern.loanapproval.loanfactory.HomeLoanFactory;
import abstractt.factory.design.pattern.loanapproval.loanfactory.LoanFactory;
import abstractt.factory.design.pattern.loanapproval.loanfactory.PersonalLoanFactory;

public class LoanTest {

	public static void main(String[] args) {
		
		// Home Loan Process
        LoanFactory homeLoanFactory = new HomeLoanFactory();
        LoanApprovalSystem homeLoanSystem = new LoanApprovalSystem(homeLoanFactory);
        homeLoanSystem.processLoan();

        System.out.println();

        // Car Loan Process
        LoanFactory carLoanFactory = new CarLoanFactory();
        LoanApprovalSystem carLoanSystem = new LoanApprovalSystem(carLoanFactory);
        carLoanSystem.processLoan();

        System.out.println();

        // Personal Loan Process
        LoanFactory personalLoanFactory = new PersonalLoanFactory();
        LoanApprovalSystem personalLoanSystem = new LoanApprovalSystem(personalLoanFactory);
        personalLoanSystem.processLoan();

	}

}
