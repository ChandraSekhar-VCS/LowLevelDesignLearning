package SOLID_Principles.SRP;

public class Main {
    public static void main(String[] args) {
        Employee chandraSekhar = new Employee("Chandra Sekhar");
        Employee RajaSekhar = new Employee("Raja Sekhar");
        chandraSekhar.setPosition("Manager");
        chandraSekhar.setSalary(10000);
        RajaSekhar.setPosition("Manager");
        RajaSekhar.setSalary(10000);

        EmployeeDataHandler dataHandler = new EmployeeDataHandler();
        EmployeeSalaryCalculator salaryCalculator = new EmployeeSalaryCalculator();
        EmployeeReportGenerator reportGenerator = new EmployeeReportGenerator();

        dataHandler.storeEmployee(chandraSekhar);
        dataHandler.getEmployee(chandraSekhar);

        reportGenerator.generateEMployeeReport(chandraSekhar);

        salaryCalculator.updateSalary(chandraSekhar);

    }
}
