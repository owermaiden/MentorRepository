package oop_principles.abstraction.interface_decoupling;

public class TaxCalculator {
    private double income;

    // What if we add another parameter to that method later on?
    public TaxCalculator(double income) {
        this.income = income;
    }

    // If you change how we calculate tax... we need to recompile the whole programme
    public double calculateTax(){
        return income * 0.5;
    }

}
