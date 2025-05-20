package com.shanaga.solid.srp;

public class BankService {

    // This BankService class violates  SRP since it has many tasks to do, to fix this we have to
    // align duties separately in different classes

    long amount;
    String accountNo;

    public long deposit(long amount, String accountNo) {
        //deposit amount
        return 0;
    }

    public long withdraw(long amount, String accountNo) {
        //withdraw amount
        return 0;
    }

    public void printPassbook() {
        //update transaction info in passbook
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }
}
