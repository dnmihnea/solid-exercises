package com.qa.singleresponsibility;

public class Mechanic{

	public void fix(Car car) {
		System.out.println("Cost of fixing your car: " + car.getDamage()*5);
		car.setDamage(0);
	}
	
	
}
