package SOLID_Principles;

import SOLID_Principles.LSP.Developer;
import SOLID_Principles.LSP.IBonusCalculator;

public class DeveloperBonusCalculator implements IBonusCalculator<Developer> {
    @Override
    public double  calculateBonus(Developer employee) {
        return employee.getSalary() * 0.1;
    }
}
