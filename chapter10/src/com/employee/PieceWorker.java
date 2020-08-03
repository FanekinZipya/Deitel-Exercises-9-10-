package com.employee;

public class PieceWorker extends Employee {
	private double wage;
	private double pieces;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double pieces) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		if(wage < 0) {
			throw new IllegalArgumentException("Wages must be >= 0.0.");
		}
		
		if(pieces < 0) {
			throw new IllegalArgumentException("Pieces must be >= 0.0.");
		}
		
		this.wage = wage;
		this.pieces = pieces;
	}

	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
		if(wage < 0) {
			throw new IllegalArgumentException("Wages must be >= 0.0.");
		}
		this.wage = wage;
	}


	public double getPieces() {
		return pieces;
	}


	public void setPieces(double pieces) {
		if(pieces < 0) {
			throw new IllegalArgumentException("Pieces must be >= 0.0.");
		}
		this.pieces = pieces;
	}

	@Override
	public double getEarnings() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Piece Worker: %s%nWages: $%, .2f", 
				super.toString(), getEarnings());
	}

	@Override
	public double getPaymentAmount() {
		return wage * pieces;
	}
	

}
