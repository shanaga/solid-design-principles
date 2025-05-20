package com.shanaga.solid.srp.solution;

public class BankService {

    // Now bank service takes care of only deposit and withdraw, and other class respectively does their own job
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
}
