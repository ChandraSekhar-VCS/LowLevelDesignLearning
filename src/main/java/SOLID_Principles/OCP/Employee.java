package SOLID_Principles.OCP;

public class Employee {
   private String name;
   private String position;
   private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
}
