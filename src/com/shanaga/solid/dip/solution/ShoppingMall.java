package com.shanaga.solid.dip.solution;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void purchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        bankCard.doTransaction(1000);

        BankCard bankCard1 = new DebitCard(); // Demonstrates run time polymorphism
        bankCard1.doTransaction(2000);

        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
        shoppingMall.purchaseSomething(3000);
    }
}
