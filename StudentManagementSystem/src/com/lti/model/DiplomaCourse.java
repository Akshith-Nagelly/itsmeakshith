package com.lti.model;

public class DiplomaCourse extends Course {
	public Type type;
	public DiplomaCourse() {
		super();
	}
	public DiplomaCourse(int id, String name, int duration, double fees, Type type) {
	super(id, name, duration, fees);
	this.type = type;
	} public Type getType() {
	return type;
	} public void setType(Type type) {
	this.type = type;
	}
	public void calculateMonthlyFee() {
		super.caluclateMonthlyFee();
		
		if(type.name().equals("Professional")) {
			System.out.println("total fees:" +(super.getFees()*1.1));
			System.out.println("total fees:"+(super.getFees()*1.5));
		
	}
	}
}
