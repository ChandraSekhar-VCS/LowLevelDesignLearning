package SOLID_Principles.SRP;

public class EmployeeReportGenerator {
    public void generateEMployeeReport(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Position: " + employee.getPosition());
    }
}
