package DesignPatterns.StructuralPatterns.FacadePattern;

public class PaymentService {
    public void processPayment(String studentName, String  courseName) {
        System.out.println("Processing payment for  student: " + studentName + " for the course: " + courseName);
    }
}
