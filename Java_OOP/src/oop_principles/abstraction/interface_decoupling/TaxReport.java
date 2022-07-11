package oop_principles.abstraction.interface_decoupling;

public class TaxReport {

    TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(600.0);
    }

    void show(){
        System.out.println(calculator.calculateTax());
    }
}
