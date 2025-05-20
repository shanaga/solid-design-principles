package com.shanaga.solid.dip.solution;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("Payment using credit card");
    }
}
