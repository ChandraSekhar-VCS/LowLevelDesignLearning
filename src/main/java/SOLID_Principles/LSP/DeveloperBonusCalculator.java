package SOLID_Principles.LSP;

public class DeveloperBonusCalculator implements IBonusCalculator<Developer> {
    @Override
    public double  calculateBonus(Developer employee) {
        return employee.getSalary() * 0.1;
    }
}
