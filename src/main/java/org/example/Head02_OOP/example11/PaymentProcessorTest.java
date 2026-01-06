package org.example.Head02_OOP.example11;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment[] payments = new Payment[]{
                new CreditCardPayment(),
                new AccountTransferPayment(),
                new MobilePayment()
        };
        double[] paymentAmount = new double[]{
                500, 2000, 1050
        };
        int index = 0;
        for (Payment payment :payments) {
            paymentProcessor.pay(payment, paymentAmount[index++]);
        }
    }
}
