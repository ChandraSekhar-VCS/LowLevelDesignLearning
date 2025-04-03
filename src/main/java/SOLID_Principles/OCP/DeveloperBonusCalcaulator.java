package SOLID_Principles.OCP;

public class DeveloperBonusCalcaulator implements IBonusCalculator{
    @Override
    public double caluclateBonus(Employee employee) {
        double bonus = employee.getSalary() * 0.1;
        return bonus;
    }
}
