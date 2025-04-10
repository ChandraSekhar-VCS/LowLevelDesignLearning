package DesignPatterns.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> employees = new ArrayList<>();
    public  Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public  void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    @Override
    public void showDetails() {
        System.out.println("-----------------------");
        System.out.println("Manager: " + name + "(" + position + ")");
        for(Employee employee : employees) {
            employee.showDetails();
        }
        System.out.println("-----------------------");
    }
}
