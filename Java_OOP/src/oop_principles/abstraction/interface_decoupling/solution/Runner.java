package oop_principles.abstraction.interface_decoupling.solution;

public class Runner {
    public static void main(String[] args) {

        // Poor men`s dependency injection -> SPRING

        TaxCalculator taxCalculator2018 = new TaxCalculator2018(100_000);

        TaxReport taxReportFor2018 = new TaxReport(taxCalculator2018);

        taxReportFor2018.show();
    }
}
