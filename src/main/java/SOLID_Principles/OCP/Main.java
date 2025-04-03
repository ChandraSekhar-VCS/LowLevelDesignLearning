package SOLID_Principles.OCP;

public class Main{
    public static void main(String[] args) {
         Employee chandra = new Employee("Chandra Sekhar","Manager",20000);
         Employee sekhar = new Employee("Sekhar","Developer",10000);

         IBonusCalculator managerBonusCalculator = new ManagerBonusCalculator();
         BonusProcessor managerBonusProcessor = new BonusProcessor(managerBonusCalculator);
        System.out.println("Manager Bonus: " + managerBonusProcessor.processBonus(chandra));

         IBonusCalculator developerBonusCalcaulator = new DeveloperBonusCalculator();
         BonusProcessor developerBonusProcessor = new BonusProcessor(developerBonusCalcaulator);
        System.out.println("Developer Bomus: " + developerBonusProcessor.processBonus(sekhar));

    }
}
