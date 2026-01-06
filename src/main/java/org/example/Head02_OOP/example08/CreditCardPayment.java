package org.example.Head02_OOP.example08;

public class CreditCardPayment implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("신용카드로 " + amount + "원 결제 완료.");
        }
//        public void cancel(double amount) {
//            System.out.println(amount + "원 취소 완료");
//        }
}
