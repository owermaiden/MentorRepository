package oop_principles.abstraction.interface_decoupling.solution;

public class TaxCalculator2018 implements TaxCalculator{
    private double income;

    public TaxCalculator2018(double income) {
        this.income = income;
    }

    @Override
    public double calculateTax() {
        return income * 0.3;
    }
}
