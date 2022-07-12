package com.qa.openclosed;

public class Greeter {
	
	private Greet greeting;

    public Greeter(Greet greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return this.greeting.greet();
    }

    public Greet getGreeting() {
        return greeting;
    }

    public void setGreeting(Greet greeting) {
        this.greeting = greeting;
    }

}
