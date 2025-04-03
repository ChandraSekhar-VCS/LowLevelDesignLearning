package SOLID_Principles.LSP;

public class BonusProcessor<T extends Employee> {
    private IBonusCalculator<T> bonusCalculator;
    public BonusProcessor(IBonusCalculator<T> bonusCalculator) {
        this.bonusCalculator = bonusCalculator;
    }
    public double  calculateBonus(T employee) {
        return bonusCalculator.calculateBonus(employee);
    }
}
