package SOLID_Principles.LSP;

public interface IBonusCalculator<T extends Employee>{
    double  calculateBonus(T employee);
}
