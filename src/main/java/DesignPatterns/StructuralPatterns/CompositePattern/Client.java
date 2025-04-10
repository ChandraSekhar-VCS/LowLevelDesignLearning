package DesignPatterns.StructuralPatterns.CompositePattern;

public class Client {
    public static void main(String[] args) {
        IndividualContributor contributor1 = new IndividualContributor("Chandra","Developer");
        IndividualContributor contributor2 = new IndividualContributor("Sekhar","Tester");
        IndividualContributor contributor3 = new IndividualContributor("Chandra Sekhar","Backend Developer");

        Manager manager1 = new Manager("ABC","Project Manager");
        Manager manager2 = new Manager("DEF","Team Manager");
        Manager manager3 = new Manager("GHI","Delivery Manager");

        manager1.addEmployee(contributor1);
        manager1.addEmployee(contributor2);
        manager1.addEmployee(contributor3);
        manager1.addEmployee(manager2);

        manager2.addEmployee(contributor1);
        manager2.addEmployee(contributor2);
        manager2.addEmployee(contributor3);

        manager3.addEmployee(manager1);
        manager3.addEmployee(manager2);

        manager1.showDetails();
//        manager2.showDetails();
//        manager3.showDetails();
    }
}
