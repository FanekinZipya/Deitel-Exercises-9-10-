package com.employee;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		if(grossSales < 0) {
			throw new IllegalArgumentException("Gross sales must ne >= 0.0.");
		}
		
		if(commissionRate < 0) {
			throw new IllegalArgumentException("Commission Rate must be >= 0.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	
	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(int grossSales) {
		if(grossSales < 0) {
			throw new IllegalArgumentException("Gross sales must ne >= 0.0.");
		}
		this.grossSales = grossSales;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(int commissionRate) {
		if(commissionRate < 0) {
			throw new IllegalArgumentException("Commission Rate must be >= 0.0");
		}
		this.commissionRate = commissionRate;
	}


	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}


	@Override
	public String toString() {
		return String.format("Commissioned Employee: %s%nGross Sales: %, .2f%nCommission Rate: %, .2f%nTotal: $%, .2f", 
				super.toString(), getGrossSales(), getCommissionRate(), getEarnings());
	}


	@Override
	public double getEarnings() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
