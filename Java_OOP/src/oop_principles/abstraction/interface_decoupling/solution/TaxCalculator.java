package oop_principles.abstraction.interface_decoupling.solution;

public interface TaxCalculator {

    double calculateTax();

    static double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
