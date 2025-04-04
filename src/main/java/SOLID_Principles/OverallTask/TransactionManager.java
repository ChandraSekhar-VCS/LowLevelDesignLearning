package SOLID_Principles.OverallTask;

import SOLID_Principles.OverallTask.NotificationProcessing.INotificationSender;
import SOLID_Principles.OverallTask.PaymentProcessing.IPaymentProcessor;

public class TransactionManager{
    private IPaymentProcessor paymentProcessor;
    private INotificationSender notificationSender;

    public TransactionManager(IPaymentProcessor paymentProcessor, INotificationSender notificationSender) {
        this.paymentProcessor = paymentProcessor;
        this.notificationSender = notificationSender;
    }

    public void processTransaction(double amount){
        paymentProcessor.processPayment(amount);
        notificationSender.sendNotification("Payment of " + amount + " was completed successfully.");
    }
}
