package com.qa.singleresponsibility;

public class Driver{
	

	// functionality
    public void drive(Car car, int milesDriven){
        car.setMileage(car.getMileage() + milesDriven);
    }


    

}
