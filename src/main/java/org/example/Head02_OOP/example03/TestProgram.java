package org.example.Head02_OOP.example03;

public class TestProgram {
    public static void main(String[] args) {

//        Order order = new Order();

        Order order = new Order("aaaa", true, "성준");
        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());
        System.out.println(order.getName());

        order.setOrderId("홍길동");
        order.setIsPaid(true);
        order.setName("성준");

        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());
        System.out.println(order.getName());
    }
}
