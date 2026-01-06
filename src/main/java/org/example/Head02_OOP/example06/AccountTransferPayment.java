package org.example.Head02_OOP.example06;

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
    public void cancel(double amount) {
        System.out.println(amount + "원 취소 완료");
    }
}