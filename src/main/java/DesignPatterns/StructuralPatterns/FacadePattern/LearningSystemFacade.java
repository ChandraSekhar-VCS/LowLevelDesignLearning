package DesignPatterns.StructuralPatterns.FacadePattern;

public class LearningSystemFacade {
    private CourseService courseService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    private StudentService studentService;

    public LearningSystemFacade(CourseService courseService, PaymentService paymentService, NotificationService notificationService) {
        this.courseService = courseService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.studentService = new StudentService();
    }

    public void enrollCourse(String courseName, String studentName){
        courseService.enrollCourse(courseName);
        paymentService.processPayment(studentName, courseName);
        notificationService.sendNotification(studentName, courseName);
        studentService.updateStudent(studentName);
        System.out.println("ENROLLMENT SUCCESSFUL !!!");
    }
}
