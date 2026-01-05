package org.example.Head02_OOP.example02;

    public class OOProderManager {
        public static void main(String[] args) {
            Order order = new Order("Alice", "Book", 2, 15000);
            order.printOrderSummary();
        }
    }
