package DesignPatterns.StructuralPatterns.FacadePattern;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        PaymentService paymentService = new PaymentService();
        NotificationService notificationService = new NotificationService();
        StudentService studentService = new StudentService();

        LearningSystemFacade facade = new LearningSystemFacade(courseService, paymentService, notificationService);
        facade.enrollCourse("Java Backedn development", "Chandra Sekhar");
    }
}
