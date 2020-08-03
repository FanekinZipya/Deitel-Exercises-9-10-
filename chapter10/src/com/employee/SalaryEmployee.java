package com.employee;

public class SalaryEmployee extends Employee {
	public int weeklySalary;
	
	
	
	public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, int weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		if(weeklySalary < 0) {
			throw new IllegalArgumentException("Weekly Salary must be >= 0");
		}
		this.weeklySalary = weeklySalary;
	}


	public int getWeeklySalary() {
		return weeklySalary;
	}



	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}



	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}


	@Override
	public String toString() {
		return String.format("Salary Employee: %s%nWeekly Salary: $%, .2f", super.toString(), getEarnings());
	}


	@Override
	public double getEarnings() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
