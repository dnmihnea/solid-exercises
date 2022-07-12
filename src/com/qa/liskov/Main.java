package com.qa.liskov;

public class Main {

	public static void main(String[] args) {
		Penthouse penthouse = new Penthouse(4);
		Studio studio = new Studio();
		penthouse.setSquareFootage(600);
	    System.out.println(penthouse.getSquareFootage());

	}

}
