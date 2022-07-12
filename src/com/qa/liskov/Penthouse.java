package com.qa.liskov;

public class Penthouse extends Apartment {
	
	 public Penthouse(int x) {
	        this.setNumberOfBedrooms(x);
	    }

	    @Override
	    public void setSquareFootage(int sqft) {
	        this.setSquareFootage(sqft);
	    }

}
