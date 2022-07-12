package com.qa.liskov;

public class BedroomAdder {
	
	public void addBedroom(Penthouse penthouse) {
        penthouse.setSquareFootage(penthouse.getSquareFootage() + 40);


    }

}
