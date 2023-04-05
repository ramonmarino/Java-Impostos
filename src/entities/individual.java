package entities;

public class individual extends TaxPayer {

	private Double healthExpenditures;

	public individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double basicTax;
		if (getAnuaIncome() < 20000.0) {
			basicTax = getAnuaIncome() * 0.15;
		}
		else {
			basicTax = getAnuaIncome() * 0.25;

		}
		basicTax = basicTax -= getHealthExpenditures() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

}
