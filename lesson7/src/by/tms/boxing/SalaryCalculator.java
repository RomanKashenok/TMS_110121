package by.tms.boxing;

public class SalaryCalculator {

    public Double koef;

    public SalaryCalculator() {
    }

    public SalaryCalculator(double koef) {
        this.koef = koef;
    }

    public Double calcSalary(int rawSalary) {
        if(koef == null) {
            return null;
        }
        double total = rawSalary * 1.35;
        total *= koef;
        return total;
    }
}
