package org.example.Head02_OOP.example06;

public class Order {
    private AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    public void cancel(double amount) {
        payment.cancel((amount));
    }
}
