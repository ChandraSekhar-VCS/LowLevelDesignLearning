package SOLID_Principles.OCP;

public class BonusProcessor {
    IBonusCalculator bonusCalculator;
    public BonusProcessor(IBonusCalculator bonusCalculator) {
        this.bonusCalculator = bonusCalculator;
    }
    public double processBonus(Employee employee){
        return bonusCalculator.caluclateBonus(employee);
    }
}
