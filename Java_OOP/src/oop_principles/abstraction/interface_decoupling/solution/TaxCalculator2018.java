package oop_principles.abstraction.interface_decoupling.solution;

public class TaxCalculator2018 implements TaxCalculator, Comparable<TaxCalculator2018>{
    private double income;

    public TaxCalculator2018(double income, double expenses) {
        this.income = income;
    }

    @Override
    public double calculateTax() {
        return income * 0.4;
    }

    @Override
    public int compareTo(TaxCalculator2018 o) {
        if (this.income > o.income) return 1;
        else
        return -1;
    }

    public double getIncome() {
        return income;
    }
}
