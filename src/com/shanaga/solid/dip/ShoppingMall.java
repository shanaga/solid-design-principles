//package com.shanaga.solid.dip;
//
//public class ShoppingMall { // Shopping mall with tightly coupled with debit card
//    private DebitCard debitCard; // to use creditcard, you have change the bunch of code
//
//    public ShoppingMall(DebitCard debitCard) {
//        this.debitCard = debitCard;
//    }
//
//    public void purchaseSomething(long amount) {
//        debitCard.doTransaction(amount);
//    }
//
//    public static void main(String[] args) {
//        DebitCard debitCard1 = new DebitCard();
//        ShoppingMall shoppingMall = new ShoppingMall(debitCard1); // Not a good design
//        shoppingMall.purchaseSomething(4000);
//    }
//}
