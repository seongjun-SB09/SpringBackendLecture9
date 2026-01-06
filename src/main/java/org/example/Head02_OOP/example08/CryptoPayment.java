package org.example.Head02_OOP.example08;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("가상결제로 " + amount + "원 결제완료");
    }
//    public void cancel(double amount) {
//        System.out.println(amount + "원 취소 완료");
//    }
}
