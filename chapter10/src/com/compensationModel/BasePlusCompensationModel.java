package com.compensationModel;

public class BasePlusCompensationModel extends CommissionCompensationModel{
	public double baseSalary;
	
	
	public BasePlusCompensationModel(double grossSales, double commissionRate, double baseSalary) {
		super(grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}


	@Override
	public double earnings() {
		return baseSalary + super.earnings();
	}
	

}
