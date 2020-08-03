package com.employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void calculateEarnings() {
		//Date date = new Date(5, 31, 2001);
		Employee commission = new CommissionEmployee("Ada", "Lovelace", "876ty097j9", null, 500, 100);
		Employee salaryWorker = new SalaryEmployee("Morenike", "Emmanuel", "756349ij68", null, 1150);
		Employee pieceWorker = new PieceWorker("Ifeoluwa", "Oluwafemi", "76uj8790p3", null, 50, 20);
		Employee hourly = new HourlyEmployee("Stephen", "Esebre", "1026yh9724", null, 50, 50);
		Employee basePlus = new BasePlusCommissionEmployee("Alicho", "Jim", "10857yt068", null, 300, 50, 100);
		
		List<Employee> cash = new ArrayList<>();
		cash.add(commission);
		cash.add(salaryWorker);
		cash.add(pieceWorker);
		cash.add(hourly);
		cash.add(basePlus);
		
		
		System.out.println(commission.toString()+"\n");
		System.out.println(salaryWorker.toString()+"\n");
		System.out.println(pieceWorker.toString()+"\n");
		System.out.println(hourly.toString()+"\n");
		System.out.println(basePlus.toString()+"\n");
		
		for(Employee cashOut : cash) {
//			Date date = new Date(6, 21, 2020);
//			cashOut.getBirthDate();
//			if (date.getMonth() == date.getCurrentMonth()) {
//				//cashOut.getPaymentAmount() + 100.0;
//			}
			System.out.println(" "+ cashOut.getPaymentAmount());
		}
	}
	
	@Test
	void payableClass() {
		Payable invoice1 = new Invoice("48576", "null", 10, 30.5);
		Payable invoice2 = new Invoice("67859", "null", 3, 60.0);
		Payable salary = new SalaryEmployee("Joanna", "Ebreso", "02947hj675", null, 1500);
		Payable hourly = new HourlyEmployee("Maleek", "Berry", "10987cn578", null, 100, 50);
		Payable commission = new CommissionEmployee("Mike", "Larry", "76119hj027", null, 100, 200);
		Payable basePlus = new BasePlusCommissionEmployee("Debby", "Zippy", "3854hf768", null, 500, 100, 50);
		
		System.out.println(invoice1.toString()+"\n");
		System.out.println(invoice2.toString()+"\n");
		System.out.println(salary.toString()+"\n");
		System.out.println(hourly.toString()+"\n");
		System.out.println(commission.toString()+"\n");
		System.out.println(basePlus.toString());
		
		List<Payable> payment = new ArrayList<>();
		payment.add(invoice1);
		payment.add(invoice2);
		payment.add(salary);
		payment.add(hourly);
		payment.add(commission);
		payment.add(basePlus);
		
		for(Payable pay : payment) {
//			if(payment != basePlus) {
//				basePlus = payment.getPaymentAmount() * 0.1;
//			}
			System.out.println(" "+ pay.getPaymentAmount());
		}
	}

}
