package SOLID_Principles.OverallTask;

import SOLID_Principles.OverallTask.NotificationProcessing.EmailSender;
import SOLID_Principles.OverallTask.NotificationProcessing.INotificationSender;
import SOLID_Principles.OverallTask.NotificationProcessing.WhatsappNotificationSender;
import SOLID_Principles.OverallTask.PaymentProcessing.CreditCardProcessor;
import SOLID_Principles.OverallTask.PaymentProcessing.DebitCardProcessor;
import SOLID_Principles.OverallTask.PaymentProcessing.IPaymentProcessor;

public class Main {
    public static void main(String[] args) {
        IPaymentProcessor paymentProcessor = new CreditCardProcessor();
        INotificationSender notificationSender = new WhatsappNotificationSender();
        TransactionManager transactionManager = new TransactionManager(paymentProcessor,notificationSender);
        transactionManager.processTransaction(5000);

        IPaymentProcessor paymentProcessor2 = new DebitCardProcessor();
        INotificationSender notificationSender2 = new EmailSender();
        TransactionManager transactionManager2 = new TransactionManager(paymentProcessor2,notificationSender2);
        transactionManager2.processTransaction(5000);
    }
}
