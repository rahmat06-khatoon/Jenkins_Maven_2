package com.model;

import org.springframework.stereotype.Component;

@Component
public class BusinessAccount implements InterestCalculator {

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

	public BusinessAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusinessAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "CurrentAccount [roi=" + roi + ", duration=" + duration + "]";
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*roi/duration;
	}
	
}
