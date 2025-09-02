package br.com.mariojp.solid.srp;

public class ReceiptService {
	private final TaxCalculator taxCalculator;
	private final ReceiptFormatter formatter;

	public ReceiptService() {
		this.taxCalculator = new TaxCalculator();
		this.formatter = new ReceiptFormatter();
	}

	public String generate(Order order) {
		double subtotal = 0;
		for (Item item : order.getItems()) {
			subtotal += item.getTotal();
		}
		double tax = taxCalculator.calculateTax(subtotal);
		double total = subtotal + tax;
		return formatter.format(subtotal, tax, total);
	}
}

