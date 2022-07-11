package oop_principles.abstraction.interface_decoupling.solution;

public class TaxCalculator2019 implements TaxCalculator{
    private double income;

    public TaxCalculator2019(double income) {
        this.income = income;
    }

    @Override
    public double calculateTax() {
        return income * 0.6;
    }
}
