package SOLID_Principles.SRP;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name) {
        this.name = name;
        this.position = null;
        this.salary = 0.0d;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
