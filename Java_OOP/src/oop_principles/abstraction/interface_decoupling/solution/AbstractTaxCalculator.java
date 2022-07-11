package oop_principles.abstraction.interface_decoupling.solution;

public abstract class AbstractTaxCalculator
        implements TaxCalculator {

    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
