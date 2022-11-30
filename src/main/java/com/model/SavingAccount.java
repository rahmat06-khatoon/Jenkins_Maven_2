package com.model;
import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements InterestCalculator{
	private double roi;
	private int duration;
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public double calculate(double amount) {
		 
		return amount*roi/duration;
	}

}
