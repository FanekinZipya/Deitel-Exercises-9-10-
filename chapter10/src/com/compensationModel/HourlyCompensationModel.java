package com.compensationModel;

public class HourlyCompensationModel extends CompensationModel{
	public double hourlyWage;
	public double hoursWorked;
	
	
	public double getHourlyWage() {
		return hourlyWage;
	}


	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}


	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	@Override
	public double earnings() {
		return hourlyWage * hoursWorked;
	}

}
