package com.qa.singleresponsibility;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("Blue", "Golf", 50000, 50);
		Driver driver = new Driver();
		Mechanic mechanic = new Mechanic();
		
		System.out.println(car.toString());
		
		driver.drive(car, 555);
		System.out.println(car.getMileage());
		
		mechanic.fix(car);
		
		System.out.println(car.toString());

	}

}
