package oop_principles.abstraction.interface_decoupling;

public class TaxReport {

    TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(600_000);
    }

    void show(){
        System.out.println(calculator.calculateTax());
    }
}
