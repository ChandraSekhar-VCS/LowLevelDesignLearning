package SOLID_Principles.SRP;

public class EmployeeDataHandler {
    public void storeEmployee(Employee employee) {
        System.out.println("Storing employee " + employee.getName());
    }
    public void getEmployee(Employee employee) {
        System.out.println("Retrieving employee " + employee.getName());
    }
}
