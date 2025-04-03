package SOLID_Principles.LSP;

public class ManagerBonusCalculator implements IBonusCalculator<Manager>{
    @Override
    public double  calculateBonus(Manager employee) {
        return employee.getSalary() * 0.15;
    }
}
