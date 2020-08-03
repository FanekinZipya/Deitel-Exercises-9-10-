package com.employee;

public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDate;
	
//	public Employee(String firstName, String lastName, String socialSecurityNumber) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.socialSecurityNumber = socialSecurityNumber;
//	}

	public abstract double getEarnings();

	@Override
	public double getPaymentAmount() {
		return getEarnings();
	}

	public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
	}

	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%nSocial Security Number: %s%nDate of Birth: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
	}

}
