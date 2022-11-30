package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FixedAccount implements InterestCalculator {

	@Value(value="4.5")
	private double roi;
	@Value(value="3")
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
	public FixedAccount(double roi, int duration) {
		super();
		this.roi = roi;
		this.duration = duration;
	}
	public FixedAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FixedAccount [roi=" + roi + ", duration=" + duration + "]";
	}
	@Override
	public double calculate(double amount) {
		
		return amount*roi/duration ;
	}
	
	
}
