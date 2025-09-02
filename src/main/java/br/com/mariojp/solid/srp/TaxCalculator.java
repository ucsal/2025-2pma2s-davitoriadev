package br.com.mariojp.solid.srp;

public class TaxCalculator {
    public double getTaxRate() {
        String rate = System.getProperty("tax.rate");
        if (rate != null) {
            try {
                return Double.parseDouble(rate);
            } catch (NumberFormatException e) {
            }
        }
        return 0.10;
    }
    public double calculateTax(double subtotal) {
        return subtotal * getTaxRate();
    }
}
