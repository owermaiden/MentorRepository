package oop_principles.polymorphism.demo;

public class TaxCalculator {
    private double income;

    public TaxCalculator(double income) {
        this.income = income;
    }

    public double calculateTax(){
        return income * 0.3;
    }
}
