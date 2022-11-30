package com.service;
import com.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.*;

@Service(value="service")
public class BankService {
	@Autowired
	
	@Qualifier(value="fixedAccount")
	
	private InterestCalculator calculator;
	
	public InterestCalculator getCalculator() {
		return calculator;
	}
	public void setCalculator(InterestCalculator calculator) {
		this.calculator=calculator;
	}
	public double service(double amount) {
		return calculator.calculate(amount);
	}
	


}
