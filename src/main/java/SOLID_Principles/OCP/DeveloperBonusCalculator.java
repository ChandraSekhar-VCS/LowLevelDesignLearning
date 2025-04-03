package SOLID_Principles.OCP;

public class DeveloperBonusCalculator implements IBonusCalculator{
    @Override
    public double calculateBonus(Employee employee) {
        double bonus = employee.getSalary() * 0.1;
        return bonus;
    }
}
