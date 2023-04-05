package entities;

public abstract class TaxPayer {
	
	 private String name;
	 private Double anuaIncome;
	 
	 public TaxPayer() {
		 
	 }
	 
	 public TaxPayer(String name,Double anualIncome) {
		 this.name = name;
		 this.anuaIncome = anualIncome;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }

	public Double getAnuaIncome() {
		return anuaIncome;
	}

	public void setAnuaIncome(Double anuaIncome) {
		this.anuaIncome = anuaIncome;
	}
	 
	 public abstract double tax(); // metodo abstrato
		 
	 

}
