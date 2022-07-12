package com.qa.singleresponsibility;

public class Car {
	
	private String colour;
    private String model;
    private int mileage;
    private double damage;

    // constructor
    public Car() {}
    
    public Car(String colour, String model, int mileage, double damage) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
        this.damage = damage;
    }

	
    public Car (int mileage) {
		this.mileage = mileage;
	}
     
    public Car (double damage) {
    	this.damage = damage;
    }

	// getters and setters for colour, model, mileage
    
    public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public double getDamage() {
		return damage;
	}
	
	public void setDamage(double damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Car [colour=" + colour + ", model=" + model + ", mileage=" + mileage + ", damage=" + damage + "]";
	}
	
	
	
	


    

}
