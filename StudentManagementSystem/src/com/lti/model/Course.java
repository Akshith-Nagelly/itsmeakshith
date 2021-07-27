package com.lti.model;


public class Course {
	private int id;
	private String name;
	private int duration;
	private double fees;
	
	public Course() {
		System.out.println("Default constructor");
	}
	

	public Course(int id, String name, int duration, double fees) {
	     System.out.println("parameterized constructor");
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}


	public int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected int getDuration() {
		return duration;
	}


	protected void setDuration(int duration) {
		this.duration = duration;
	}


	protected double getFees() {
		return fees;
	}


	protected void setFees(double fees) {
		this.fees = fees;
	}
	
	public void caluclateMonthlyFee() {
		System.out.println("Monthly fee is: "+(fees/duration));
	}
	

}
