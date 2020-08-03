package com.employee;

public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		if(hourlyWage < 0) {
			throw new IllegalArgumentException("Wage per hour must be >= 0.0.");
		}
		
		if(hoursWorked < 0) {
			throw new IllegalArgumentException("Hour(s) worked must be >= 0.0.");
		}
		
		hourlyWage = wage;
		hoursWorked = hours;
	}


	public double getHourlyWage() {
		return hourlyWage;
	}



	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage < 0) {
			throw new IllegalArgumentException("Wage per hour must be >= 0.0.");
		}
		this.hourlyWage = hourlyWage;
	}



	public double getHoursWorked() {
		return hoursWorked;
	}



	public void setHoursWorked(double hoursWorked) {
		if(hoursWorked < 0) {
			throw new IllegalArgumentException("Hour(s) worked must be >= 0.0.");
		}
		this.hoursWorked = hoursWorked;
	}



	@Override
	public double getPaymentAmount() {
		if(getHoursWorked() <= 40) {
			return getHourlyWage() * getHoursWorked();
		}else {
			return 40 * getHourlyWage() + (getHoursWorked() - 40) * getHourlyWage() * 1.5;
		}
	}


	@Override
	public String toString() {
		return String.format("Hourly Employee: %s%nHourly Wage: $%, .2f,%nHours Worked: %, .2f", 
				super.toString(), getEarnings(), getHoursWorked());
	}


	@Override
	public double getEarnings() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
