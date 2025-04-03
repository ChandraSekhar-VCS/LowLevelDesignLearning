package SOLID_Principles.SRP;

public class EmployeeSalaryCalculator {
    public void updateSalary(Employee employee) {
        double currentSalary = employee.getSalary();
        double updateSalary =  currentSalary + (currentSalary * 0.05);
        employee.setSalary(updateSalary);
    }
}
