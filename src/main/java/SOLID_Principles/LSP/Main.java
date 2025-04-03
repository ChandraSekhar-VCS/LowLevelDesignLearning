package SOLID_Principles.LSP;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Chandra Sekhar", 20000);
        Developer developer = new Developer("Chandra Sekhar", 30000);

        BonusProcessor<Manager> managerBonusProcessor = new BonusProcessor<>(new ManagerBonusCalculator());
        System.out.println("Manager Bonus: " + managerBonusProcessor.calculateBonus(manager));

        BonusProcessor<Developer> developerBonusProcessor = new BonusProcessor<>(new DeveloperBonusCalculator());
        System.out.println("DeveloperBonus: " + developerBonusProcessor.calculateBonus(developer));
    }
}
