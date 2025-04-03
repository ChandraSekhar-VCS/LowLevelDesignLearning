package SOLID_Principles.OCP;

class ManagerBonusCalculator implements IBonusCalculator {
    @Override
    public double caluclateBonus(Employee employee) {
        double  bonus = employee.getSalary() * 0.15;
        return bonus;
    }
}
