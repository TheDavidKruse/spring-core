package com.vasanthj.spring.springcoretraining.reftypes;

public class Parts {

	private String seat;
	private String steeringWheel;
	private int doors;

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Parts [seat=" + seat + ", steeringWheel=" + steeringWheel + ", doors=" + doors + "]";
	}
	
}


