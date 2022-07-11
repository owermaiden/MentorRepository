package oop_principles.abstraction.interface_decoupling.solution;

public class TaxReport {

    private TaxCalculator calculator;

    // Programming against Interfaces... De-coupled code....We are working with interfaces..
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
