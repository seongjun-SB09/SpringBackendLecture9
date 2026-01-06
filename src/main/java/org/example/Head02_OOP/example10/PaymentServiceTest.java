package org.example.Head02_OOP.example10;

public class PaymentServiceTest {
    public static void main(String[] args) {
        UserAccount account = new UserAccount("AC001");
        PaymentService service = new PaymentService();

        account.deposit(10000);
        System.out.println("초기 입금 완료. 잔액: " + account.getBalance());

//        try {
//            service.processPayment(account, -5000);
//        } catch (IllegalArgumentException e) {
//            System.out.println("예외 발생 (음수 출금): " + e.getMessage());
//        }
//
//        try {
//            service.processPayment(account, -3000);
//        } catch (IllegalArgumentException e) {
//            System.out.println("예외 발생 (음수 출금): " + e.getMessage());
//        }
//
//        try {
//            service.processPayment(account, 50000);
//        } catch (IllegalStateException e) {
//            System.out.println("예외 발생 (잔액 부족): " + e.getMessage());
//        }

        service.processPayment(account, 3000);
        service.processRefund(account, 3000);
    }
}
