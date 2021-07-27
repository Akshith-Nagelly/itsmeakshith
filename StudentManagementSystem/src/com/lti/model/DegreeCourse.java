package com.lti.model;

public class DegreeCourse extends Course {

	private DegreeLevel degreelevel;
	private boolean isPlacementAvailable;

	public DegreeCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DegreeCourse(int id, String name, int duration, double fees, DegreeLevel degreelevel,
			boolean isPlacementAvailable) {
		super(id, name, duration, fees);
		// TODO Auto-generated constructor stub
		this.degreelevel = degreelevel;
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public DegreeLevel getDegreelevel() {
		return degreelevel;
	}

	public void setDegreelevel(DegreeLevel degreelevel) {
		this.degreelevel = degreelevel;
	}

	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}

	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public void caluclateMonthlyFee() {
		System.out.println(super.getId()+""+super.getName()+""+super.getDuration());
		super.caluclateMonthlyFee();
		// if placement is available charge 10% from fee
	if(isPlacementAvailable) {
		System.out.println("Total fees:"+ (super.getFees()*1.1));
	}
	else {
		System.out.println("total fees:"+(super.getFees()));
	}
	
	}
}
